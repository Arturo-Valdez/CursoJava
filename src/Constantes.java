public class Constantes {
    public static void main(String[] args) {
        System.out.println("*** Constantes en Java ***");
        /*Variables constantes se escriben en mayusculas y guiones bajos
        asi con inicio con la palabra final*/
        final var DIAS_SEMANAS = 7;
        System.out.println("DIAS_SEMANAS = " + DIAS_SEMANAS);
        //DIAS_SEMANAS = 8;//NO PUEDEN SER MODIFICADO EL VALOR DE UNA CONSTANTE
        final var PI = 3.1416;
        System.out.println("PI = " + PI);

        /*Se puede utilizar tambien la clase Math que nos permite
        optener los valores y formulas matematicas*/
        System.out.println("Math.PI " + Math.PI);

        final var MENSAJE_BIENVENIDA = "Bienvenid@ a la universidad Java";
        System.out.println("MENSAJE_BIENVENIDA = " + MENSAJE_BIENVENIDA);
        final var MINUTOS_POR_SEGUNDOS = 60;
        System.out.println("MINUTOS_POR_SEGUNDOS = " + MINUTOS_POR_SEGUNDOS);

    }
}
