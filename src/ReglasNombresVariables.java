public class ReglasNombresVariables {
    public static void main(String[] args){
        //Reglas nombres variables
        String nombreCompleto = "Santiago Valdez";// Correcto- buenas practicas
        System.out.println("nombreCompleto = " + nombreCompleto);
        String NombreCompleto = "Karen Contreras";//Correcto - malas practicas
        System.out.println("NombreCompleto = " + NombreCompleto);
        //String nombre-cliente = "Carlos";//Incorrecto
        String nombre_cliente = "Jose"; //Correcto- no aplica buenas practicas
        String _apellido = "Verduzco";//Correcto / aceptable
        String $apellido = "Mondragon";  //Correcto / aceptable
        int totPzs =10;//Correcto- no aplica buenas practicas
        int totalPiezas = 10; // Correcto, aplica buenas practicas
        boolean casado = true;// Correcta / aun puede mejorar
        boolean esCasado = true;// Correcta / aplica buenas practicas
        boolean isCasado = true;// Correcta / aplica buenas practicas
        boolean tieneSaldo = true;// Correcta / aplica buenas practicas
        boolean hasSaldo = true;// Correcta / aplica buenas practicas

    }
}
