public class TiposDatos {
    public static void main(String[] args){
        //Tipos de datos en Java
        //Enteros (Valor default 0)
        byte tipoByte = 127;
        short tipoShort = 32000;
        int tipoInt = 2147483647;
        long tipoLong = 987654321;

        //Flotantes (Valor por default 0.0)
        float tipoFloat = 3.14F;
        double tioDouble = 3.1315;

        System.out.println("tipoByte = " + tipoByte);
        System.out.println("tipoShort = " + tipoShort);
        System.out.println("tipoInt = " + tipoInt);
        System.out.println("tipoLong = " + tipoLong);
        System.out.println("tipoFloat = " + tipoFloat);


        //Caracter UniCode (Valor por default '\u0000')
        char tipoChar = 'A';
        System.out.println("tipoChar = " + tipoChar);
        tipoChar = 42;
        System.out.println("tipoChar = " + tipoChar);
        tipoChar = '@';
        System.out.println("tipoChar = " + tipoChar);

        //Booleano (false)
        boolean tipoBoolean = true;
        System.out.println("tipoBoolean = " + tipoBoolean);

        //Tipo Object (Referencia default null)
        String nombre = null;
        System.out.println("nombre = " + nombre);
        nombre = "Santiago Valdez";
        System.out.println("nombre = " + nombre);



    }
}
