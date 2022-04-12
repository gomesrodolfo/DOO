
package geradordetelefones;

public class GeradorDeNumeros {
    
    private static GeradorDeNumeros instance;
       
    public synchronized static GeradorDeNumeros getInstance(){
        
        if(instance == null){
            instance = new GeradorDeNumeros();
        }
        return instance;
    }
    
    //instance variables
    private int count;
    private int ultimoNumero;
    
    //private constructor
    private GeradorDeNumeros(){}
    
    //instance methods
    public synchronized int getProximoNumero(String numeroInicial){
        
        int numeroConvertido = Integer.parseInt(numeroInicial);
        
        ultimoNumero = numeroConvertido + count;
        ++count;
        
        return ultimoNumero;
    }

}
