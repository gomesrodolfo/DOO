
package geradordetelefones;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.*;

public class GeradorDeTelefones {

    public static void main(String[] args) throws IOException{
        
        String path1 = "C:\\Users\\rodol\\OneDrive\\Documentos\\NetBeansProjects\\GeradorDeTelefones\\numeroBase.txt";
        String path2 = "C:\\Users\\rodol\\OneDrive\\Documentos\\NetBeansProjects\\GeradorDeTelefones\\numeroBase2.txt";
        BufferedWriter arquivoGerado = new BufferedWriter(new FileWriter(path2));
        GeradorDeNumeros gera = GeradorDeNumeros.getInstance();
        
        System.out.println("Rodando Singleton");
        
        
        
        /* Leitura de arquivo */
        try (BufferedReader arquivoLido = new BufferedReader(new FileReader(path1))) 
        {
            String line;
            while ((line = arquivoLido.readLine()) != null) {
                System.out.println(line);
                arquivoGerado.write(""+ gera.getProximoNumero(line));
                
                /* Numero gerado */                       
                System.out.println("proximo numero: " + gera.getProximoNumero(line));
                System.out.println("proximo numero: " + gera.getProximoNumero(line));
                System.out.println("proximo numero: " + gera.getProximoNumero(line));
                System.out.println("proximo numero: " + gera.getProximoNumero(line));
                
                /* Gravação de arquivo */       
                arquivoGerado.write(""+ gera.getProximoNumero(line));
                arquivoGerado.newLine();
            }
            
            
        }
        catch (IOException e) {
            System.out.println("Ocorreu erro ao ler o arquivo.");
            e.printStackTrace();
        }
        
        
        
        
        
        arquivoGerado.close();
    }
}
