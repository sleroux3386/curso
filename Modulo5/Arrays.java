
/**
 * Programa que apresenta os Arrays e alguns dos seus métodos
 * 
 * @author Sébastien Leroux
 */

import java.lang.ArrayIndexOutOfBoundsException;    // esta linha é explicada num módulo mais a frente

public class Arrays
{
    public static void main(String[] args){
        int[] numerosDeUmADez = new int[10];
        numerosDeUmADez[0] = 1;
        numerosDeUmADez[1] = 2;
        numerosDeUmADez[2] = 3;
        numerosDeUmADez[3] = 4;
        numerosDeUmADez[4] = 5;
        numerosDeUmADez[5] = 6;
        numerosDeUmADez[6] = 7;
        numerosDeUmADez[7] = 8;
        numerosDeUmADez[8] = 9;
        numerosDeUmADez[9] = 10;
        
        // não é possivel atribuir a uma posição de um array de int uma string, por exemplo:
        // numerosDeUmADez[10] = "A"; ERRO
        
        System.out.println("Tamanho do Array numerosDeUmADez: "+numerosDeUmADez.length);
        System.out.println("numerosDeUmADez[0]: "+numerosDeUmADez[0]);
        try{
            System.out.println("numerosDeUmADez[11]: "+numerosDeUmADez[11]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException: "+e.getMessage());
        }
        
        
    }
}
