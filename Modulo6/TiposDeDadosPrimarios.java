
/**
 * Programa que apresenta os vários tipos de dados primários existentes na liguagem JAVA
 * 
 * @author Sébastien Leroux
 */
public class TiposDeDadosPrimarios
{
    public static void main(String[] args){
        
        System.out.println("************\nBOOLEANOS\n************");
        
        boolean bool1 = true;
        boolean bool2 = false;
        System.out.println("bool1="+bool1+" e bool2="+bool2); 

        boolean boolTrue = Boolean.TRUE;
        boolean boolFalse = Boolean.FALSE;
        System.out.println("Os valores possíveis para variáveis booleanas são: "+boolFalse+" e "+boolTrue);
        /*
        valores inválidos (comentados, pois o código nem sequer compila)
        
        boolean bool3 = sim;    
        boolean bool4 = 1;
        boolean bool5 = "sim";
         */
        
        
        
        System.out.println("************\nBYTES\n************");
        byte byte1 = -10;
        byte byte2 = 45;
        System.out.println("byte1="+byte1+" e byte2="+byte2);
        byte byteMin = Byte.MIN_VALUE;
        byte byteMax = Byte.MAX_VALUE;
        System.out.println("Uma variável do tipo byte pode ter valores entre "+byteMin+" e "+byteMax);
        /*
        valores inválidos (comentados, pois o código nem sequer compila)  
        
        byte byte3 = 300;
        byte byte4 = -260;
         */
        
        
        
        System.out.println("************\nSHORTS\n************");
        short short1 = 300;
        short short2 = -260;
        System.out.println("short1="+short1+" e short2="+short2);
        short shortMin = Short.MIN_VALUE;
        short shortMax = Short.MAX_VALUE;
        System.out.println("Uma variável do tipo short pode ter valores entre "+shortMin+" e "+shortMax);
        /*
        valores inválidos (comentados, pois o código nem sequer compila)  
        
        short short3 = -34000;
        short short4 = 35000;
         */
        
        
        
        System.out.println("************\nINTS\n************");
        int int1 = -34000;
        int int2 = 35000;
        System.out.println("int1="+int1+" e int2="+int2);
        int intMin = Integer.MIN_VALUE;
        int intMax = Integer.MAX_VALUE;
        System.out.println("Uma variável do tipo int pode ter valores entre "+intMin+" e "+intMax);
        /*
        valores inválidos (comentados, pois o código nem sequer compila)  
        
        int int3 = -2247483648;
        int int4 = 3147483648;
         */
        
        System.out.println("************\nLONGS\n************");
        //NOTA: para ser initializado como Long, é necessário adicionar um L no fim 
        //      (senão, o compilador processa o valor como sendo um inteiro... e dá erro se este estiver fora da gama de valores do int)
        long long1 = -2247483648L;
        long long2 = 3147483648L;
        System.out.println("long1="+long1+" e long2="+long2);
        long longMin = Long.MIN_VALUE;
        long longMax = Long.MAX_VALUE;
        System.out.println("Uma variável do tipo long pode ter valores entre "+longMin+" e "+longMax);
        /*
        valores inválidos (comentados, pois o código nem sequer compila)  
        long long3 = -2247483648;   //o valor é válido, mas falta o L
        long long4 = 3147483648;    //o valor é válido, mas falta o L
        long long5 = -9223372036854775809;
        long long6 = 9223372036854775808;
         */
        
        
        
        System.out.println("************\nFLOATS\n************");
        //NOTA: para ser initializado como Float, é necessário adicionar um f no fim...
        //      se o valor não tiver componente decimal e não tiver um f no fim, o compilador avalia o valor como sendo do tipo int
        //      se o valor tiver componente decimal e não tiver um f no fim, o compilador avalia o valor como sendo double
        float float1 = -2247483648f;
        float float2 = 31474.83648f;
        System.out.println("float1="+float1+" e float2="+float2);
        float floatMin = Float.MIN_VALUE;
        float floatMax = Float.MAX_VALUE;
        System.out.println("Uma variável do tipo float pode ter valores entre "+floatMin+" e "+floatMax+" (positivo e negativo)");
        /*
        valores inválidos (comentados, pois o código nem sequer compila)  
        float float3 =  4.4028235E38f;
        float float4 = -3.4028235E39f;
        float float5 = -2247483648; //o valor é válido, mas falta o f
        float float6 = 3147483648; //o valor é válido, mas falta o f
         */
      
        
        
        System.out.println("************\nDOUBLES\n************");
        double double1 = 2221212.21221;
        double double2 = -31474836.48;
        System.out.println("double1="+double1+" e double2="+double2);
        double doubleMin = Double.MIN_VALUE;
        double doubleMax = Double.MAX_VALUE;
        System.out.println("Uma variável do tipo double pode ter valores entre "+doubleMin+" e "+doubleMax+" (positivo e negativo)");
        /*
        valores inválidos (comentados, pois o código nem sequer compila)  
        double double3 =  1.7976931348623157E309;
        double double4 = -5.7976931348623157E308;
         */
        
        System.out.println("************\nCHARS\n************");
        char char1 = 's';
        char char2 = 'g';
        System.out.println("char1="+char1+" e char2="+char2);
        char charMin = Character.MIN_VALUE;
        char charMax = Character.MAX_VALUE;
        System.out.println("Uma variável do tipo char pode ter valores entre "+charMin+" e "+charMax);
        System.out.println("Uma variável do tipo char pode ter valores entre "+(int)charMin+" e "+(int)charMax);
        /*
        valores inválidos (comentados, pois o código nem sequer compila)  
        double double3 =  1.7976931348623157E309;
        double double4 = -5.7976931348623157E308;
         */
    }
}
