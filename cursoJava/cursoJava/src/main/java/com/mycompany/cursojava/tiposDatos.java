
public class tiposDatos {
    public static void main(String[] args){
        
        //tipos datos
        
        //Enteros
        
        byte tipoByte=(byte)127; //8 bits
        System.out.println("tipoByte = " + tipoByte);
        
        short tipoShort = (short)32000;
        System.out.println("tipoShort = " + tipoShort);
        
        int tipoInt = 2147483647;
        System.out.println("tipoInt = " + tipoInt);
        
        long tipolongint = 987654321098765432l;
        System.out.println("tipoLongInt = " + tipolongint);
        
        //flotantes
        
        float tipoFloat = 3.14F; //f o F para indicar float
        System.out.println("tipoFloat = " + tipoFloat);
        
        double tipoDouble = 3.1398; //f o F para indicar float
        System.out.println("tipoDouble = " + tipoDouble);
        
        //Caracater
        char tipoChar = 'A'; // Caracateres del juego unicode
        System.out.println("tipoChar = " + tipoChar);
        
        tipoChar = 65; // VALOR 65 == A.
        System.out.println("tipoChar = " + tipoChar);
        
        // Booleano
        boolean tipoBoolean = true;
        System.out.println("tipoBoolean = " + tipoBoolean);
        tipoBoolean = false;
        System.out.println("tipoBoolean = " + tipoBoolean);
        
        String nombre = null;
        System.out.println(nombre); 
        
    }
    
}
