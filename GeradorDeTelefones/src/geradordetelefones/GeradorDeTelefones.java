package geradordetelefones;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.*;

public class GeradorDeTelefones {

    public static void main(String[] args) throws IOException {

        String path1 = "C:\\Users\\rodol\\OneDrive\\Documentos\\NetBeansProjects\\GeradorDeTelefones\\numeroBase.txt";
        //String path2 = "C:\\Users\\rodol\\OneDrive\\Documentos\\NetBeansProjects\\GeradorDeTelefones\\numeroBase2.txt";
        //BufferedWriter arquivoGerado = new BufferedWriter(new FileWriter(path1));
        GeradorDeNumeros gera = GeradorDeNumeros.getInstance();

        String novoNumero;

        System.out.println("Rodando Singleton");

        /* Leitura de arquivo */
        try ( BufferedReader arquivoLido = new BufferedReader(new FileReader(path1))) {
            String linha;

            while ((linha = arquivoLido.readLine()) != null) {
                //System.out.println(linha);

                /* gera novo numero */
                novoNumero = "" + gera.getProximoNumero(linha);
                System.out.println((novoNumero = "" + gera.getProximoNumero(linha)));
                                
                /* Gravação de arquivo */
                BufferedWriter arquivoGerado = new BufferedWriter(new FileWriter(path1));
                arquivoGerado.write(novoNumero);
                arquivoGerado.newLine();
                arquivoGerado.close();
            }

        } catch (IOException e) {
            System.out.println("Ocorreu erro ao ler o arquivo.");
            e.printStackTrace();
            
        }
                
        //arquivoGerado.close();
    }
}
