/***
 * Programa para explicar como apresentar informação ao utilizador
 * e como recolher informação.
 * @author Sébastien Leroux
 */
// importar a classe Scanner
// os imports são abordados mais à frente no curso
import java.util.Scanner;

public class ExemploScanner{ //definição da classe
   public static void main(String[] args){ //ponto de entrada do programa
       Scanner scanner = new Scanner(System.in); //criação do scanner para ler do teclado
       System.out.print("Insira um número inteiro: "); //mostrar mensagem ao utilizador
       int numero = scanner.nextInt(); // declara uma variável chamada numero
                                       // e initializa a variável com informação proveniente do teclado
       //NOTA: Se for introduzido algo que não seja um inteiro, o programa crasha!
       //      Mais à frente no curso será apresentado o porquê, e como processar estes erros.
       
       //mostrar valor inserido pelo utilidor, de 3 formas diferentes
       System.out.print("Inseriu: ");
       System.out.println(numero);
       System.out.println("Inseriu: "+numero);
       System.out.printf("Inseriu: %d\n",numero);
       System.out.printf("Inseriu: \"%d\"\n",numero);
       int a = 4*3+2*3;
       System.out.println(a);
   }
}