/***
 * Programa para explicar como utilizar ifs em JAVA
 * @author Sébastien Leroux
 */
// importar a classe Scanner
// os imports são abordados mais à frente no curso
import java.util.Scanner;

public class ExemploCondições{ //definição da classe
   public static void main(String[] args){ //ponto de entrada do programa
       Scanner scanner = new Scanner(System.in); //criação do scanner para ler do teclado
       System.out.print("Insira um número inteiro: "); //mostrar mensagem ao utilizador
       int numero1 = scanner.nextInt(); //leitura de um inteiro, armazenado na vaiável numero1
       System.out.print("Insira um outro número inteiro: "); //mostrar mensagem ao utilizador
       int numero2 = scanner.nextInt(); //leitura de um inteiro, armazenado na vaiável numero2
       if(numero1>numero2){ //se o primeiro numero inserido for maior que o segundo
           System.out.printf("%d é maior do que %d",numero1,numero2);
       }else if(numero2>numero1){ //se o segundo numero inserido for maior que o primeiro
           System.out.printf("%d é maior do que %d",numero2,numero1);
       }else{   //se o primeiro não é maior que o segundo e o segundo não é maior que o primeiro, são iguais...
           System.out.printf("%d e %d são iguais",numero1,numero2);
       }
   }
}