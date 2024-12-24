public class TipoVar {
    public static void main(String[] args){
        
        System.out.println("USO DE VAR EN JAVA");
        
        //Sin uso de var
        String nombre1 = "Juan";
        System.out.println("nombre1 como String = " + nombre1);
        //Con uso de var
        var nombre2 = "Carlos";
        System.out.println("nombre2 como var= " + nombre2);
        //Definir otras variables usando var
        var edad = 30;//Se infiere tipo int
        System.out.println("edad como var= " + edad);
        var sueldo = 5000.5;//Se infiere el tipo float
        System.out.println("sueldo como var = " + sueldo);

        var esCasado = false;//Se infiere tipo boolean
        esCasado = false;

        /*Al generar una variable tipo var debe de asignar un valor
        al momento de crearlo*/


    }
}
