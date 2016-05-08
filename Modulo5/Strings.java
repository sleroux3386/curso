
/**
 * Programa que apresenta os vários métodos suportados pela class java.lang.String
 * ver https://docs.oracle.com/javase/7/docs/api/java/lang/String.html
 * 
 * @author Sébastien Leroux
 */

import java.util.Arrays;    //esta linha é explicada num módulo mais à frente

public class Strings
{
    public static void main(String[] args){
        // charAt(int index) - retorna o caracter na posição [index]
        String frase = "Sara Guimarães é gestora da qualidade";
        char primeiroCaracter = frase.charAt(0);    //a primeira posição é 0
        System.out.println("O primeiro caracter da frase \""+frase+"\" é '"+primeiroCaracter+"'");
        char quintoCaracter = frase.charAt(5);
        System.out.println("O quinto caracter da frase \""+frase+"\" é '"+quintoCaracter+"'");
        
        // compareTo(String anotherString) - compara duas Strings. 
        // Retorna um número negativo se a frase vem "alfabeticamente" antes da frase passada como parámetro
        // Retorna um número positivo se a frase vem "alfabeticamente" depois da frase passada como parámetro
        // Retorna 0 se as frases forem iguais
        String outraFrase = "Umbelina Guimarães é gestora da qualidade";
        int compareTo1 = frase.compareTo(outraFrase);
        System.out.println("(\""+frase+"\").compareTo(\""+outraFrase+"\") = "+compareTo1); //como a frase original vem antes da frase passada como parámetro (S vem antes de U), dá negativo
        int compareTo2 = outraFrase.compareTo(frase);
        System.out.println("(\""+outraFrase+"\").compareTo(\""+frase+"\") = "+compareTo2); //como a frase original vem depois da frase passada como parámetro (U vem depois de S), dá positivo
        int compareTo3 = frase.compareTo(frase);
        System.out.println("(\""+frase+"\").compareTo(\""+frase+"\") = "+compareTo3); //como a frase original é igual à frase passada como parámetro, dá 0
        
        // compareToIgnoreCase(String str) - compara duas String, ignorando maiúsculas e minúsculas
        String fraseMaiusculas = "SARA GUIMARÃES É GESTORA DA QUALIDADE";
        int compareToIgnoreCase1 = frase.compareTo(fraseMaiusculas); // se utilizar o método compareTo, as frase são diferentes, e retorna um valor diferente de 0
        System.out.println("(\""+frase+"\").compareTo(\""+fraseMaiusculas+"\") = "+compareToIgnoreCase1);
        int compareToIgnoreCase2 = frase.compareToIgnoreCase(fraseMaiusculas); // se utilizar o método compareToIgnoreCase, as frase são "iguais", e retorna 0
        System.out.println("(\""+frase+"\").compareToIgnoreCase(\""+fraseMaiusculas+"\") = "+compareToIgnoreCase2);
        
        // concat(String str) - concatena/junta strings, retornando uma nova String resultante da junçao das duas
        // NOTA: As String são imutáveis / não mudam. Portanto, a frase original mantém-se inalterada.
        String adicionar = " e gestora de projetos";
        String concatString = frase.concat(adicionar);
        System.out.println("(\""+frase+"\").concat(\""+adicionar+"\")= \""+concatString+"\"");
        
        // contains(CharSequence s) - retorna true se a frase original contém [s]
        boolean contains1 = frase.contains("Sara");
        System.out.println("(\""+frase+"\").contains(\"Sara\") = "+contains1);
        boolean contains2 = frase.contains("Umbelina");
        System.out.println("(\""+frase+"\").contains(\"Umbelina\") = "+contains2);
        
        // endsWith(String suffix) - retorna true se a frase original termina com [suffix]
        boolean endsWith1 = frase.endsWith("qualidade");
        System.out.println("(\""+frase+"\").endsWith(\"qualidade\") = "+endsWith1);
        boolean endsWith2 = frase.endsWith("projetos");
        System.out.println("(\""+frase+"\").endsWith(\"projetos\") = "+endsWith2);
        
        // equals(Object anObject) - verifica se duas strings são iguais
        boolean equals1 = frase.equals(frase);
        System.out.println("(\""+frase+"\").equals(\""+frase+"\") = "+equals1);
        boolean equals2 = frase.equals(fraseMaiusculas);
        System.out.println("(\""+frase+"\").equals(\""+fraseMaiusculas+"\") = "+equals2);
        
        // equalsIgnoreCase(Object anObject) - verifica se duas strings são iguais, ignorando maiusculas e minusculas
        boolean equalsIgnoreCase1 = frase.equalsIgnoreCase(frase);
        System.out.println("(\""+frase+"\").equalsIgnoreCase(\""+frase+"\") = "+equalsIgnoreCase1);
        boolean equalsIgnoreCase2 = frase.equalsIgnoreCase(fraseMaiusculas);
        System.out.println("(\""+frase+"\").equalsIgnoreCase(\""+fraseMaiusculas+"\") = "+equalsIgnoreCase2);
        
        // indexOf(int ch) - retorna a primeira posição onde está [ch] (ou -1 se não for encontrado)
        int indexOf1 = frase.indexOf('a');
        System.out.println("(\""+frase+"\").indexOf('a') = "+indexOf1);
        int indexOf2 = frase.indexOf('G');
        System.out.println("(\""+frase+"\").indexOf('G') = "+indexOf2);
        
        // indexOf(int ch, int fromIndex) - retorna a primeira posição onde está [ch], a partir do índice [fromIndex] (ou -1 se não for encontrado)
        int indexOf3 = frase.indexOf('a',5);
        System.out.println("(\""+frase+"\").indexOf('a',5) = "+indexOf3);
        
        // indexOf(String str) - retorna a primeira posição onde está [str] (ou -1 se não for encontrada)
        int indexOf4 = frase.indexOf("Guimarães");
        System.out.println("(\""+frase+"\").indexOf(\"Guimarães\") = "+indexOf4);
        
        // indexOf(String str, int fromIndex) - retorna a primeira posição onde está [str], a partir do índice [fromIndex] (ou -1 se não for encontrada)
        int indexOf5 = frase.indexOf("Guimarães",7);
        System.out.println("(\""+frase+"\").indexOf(\"Guimarães\",7) = "+indexOf5);
        
        // isEmpty() - retorna true se a string estiver vazia
        boolean isEmpty1 = frase.isEmpty();
        System.out.println("(\""+frase+"\").isEmpty() = "+isEmpty1);
        String vazia = "";
        boolean isEmpty2 = vazia.isEmpty();
        System.out.println("(\""+vazia+"\").isEmpty() = "+isEmpty2);
        
        // lastIndexOf(int ch) - retorna a última posição onde está [ch] (ou -1 se não for encontrado)
        int lastIndexOf1 = frase.lastIndexOf('a');
        System.out.println("(\""+frase+"\").lastIndexOf('a') = "+lastIndexOf1);
        
        // length() - retorna o comprimento da String
        int length1 = frase.length();
        System.out.println("(\""+frase+"\").length() = "+length1);
        
        // replace(CharSequence oldString, CharSequence newString)~- substitui na string original [oldString] por [newString]
        String replace1 = frase.replace("Sara","Umbelina");
        System.out.println("(\""+frase+"\").replace(\"Sara\",\"Umbelina\") = \""+replace1+"\"");
        
        // split(String regex) - parte a string original em pedaços, utilizando [regex] como separador
        String[] pedaços = frase.split(" ");
        System.out.println("(\""+frase+"\").split(\" \") = "+Arrays.toString(pedaços)); 
        // NOTA: o split retorna um array... como ainda não abordamos controlo de fluxo, ou imports, apenas precisas de saber que Arrays.toString transforma um array numa string com o seu conteúdo.
        // como foi referido nos slides, o array tem um tamanho (length), e podemos aceder aos seus elementos através do índice:
        int tamanhoPedaços = pedaços.length;
        System.out.println("("+Arrays.toString(pedaços)+").length = "+tamanhoPedaços); 
        String primeiroPedaço = pedaços[0];
        System.out.println("("+Arrays.toString(pedaços)+")[0] = \""+primeiroPedaço+"\"");
        String segundoPedaço = pedaços[1];
        System.out.println("("+Arrays.toString(pedaços)+")[1] = \""+segundoPedaço+"\""); 
        
        // startsWith(String prefix) - retorna true se a string começa com [prefix]
        boolean startsWith1 = frase.startsWith("Sara");
        System.out.println("(\""+frase+"\").startsWith(\"Sara\") = "+startsWith1);
        boolean startsWith2 = frase.startsWith("Umbelina");
        System.out.println("(\""+frase+"\").startsWith(\"Umbelina\") = "+startsWith2);
        
        // substring(int beginIndex) - retorna uma substring (um pedaço da string...), que começa na posição [beginIndex] e vai até ao fim da String
        String substring1 = frase.substring(17);
        System.out.println("(\""+frase+"\").substring(17) = \""+substring1+"\"");
        
        // substring(int beginIndex, int endIndex) - retorna uma substring (um pedaço da string...), que começa na posição [beginIndex] e vai até a posição [endIndex]
        String substring2 = frase.substring(17,24);
        System.out.println("(\""+frase+"\").substring(17,24) = \""+substring2+"\"");
        
        // toLowerCase() - retorna a string em minúsculas
        String toLowerCase1 = frase.toLowerCase();
        System.out.println("(\""+frase+"\").toLowerCase() = \""+toLowerCase1+"\"");
        
        // toUpperCase() - retorna a string em maiúsculas
        String toUpperCase1 = frase.toUpperCase();
        System.out.println("(\""+frase+"\").toUpperCase() = \""+toUpperCase1+"\"");
        
        // trim() - retira os espaços no início e no fim da string
        String stringComEspaços = "    Sara     ";
        String trim1 = stringComEspaços.trim();
        System.out.println("(\""+stringComEspaços+"\").trim() = \""+trim1+"\"");
    }
}
