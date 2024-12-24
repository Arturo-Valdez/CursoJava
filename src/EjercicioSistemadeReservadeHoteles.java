public class EjercicioSistemadeReservadeHoteles {
    public static void main(String[] args) {

        System.out.println("***Reservacion Hotelera***");
        var nombreCliente = "Santiago Valdez";
        var diasEstancia = 5;
        final var tarifaDiaria = 455.50;
        var tieneVistaMar = true;


        //Nota reservacion 1
        System.out.println("RESERVACION \n" + "Nombre de cliente: " + nombreCliente + "\nDias de estancia: " +
                diasEstancia + "\nTarifa diaria: " + tarifaDiaria + "\nCuenta con vista al mar: "+
                tieneVistaMar);

        diasEstancia = 2;
        tieneVistaMar = false;

        //Nota reservacion 1 editada
        System.out.println();//Salto de linea
        System.out.println("RESERVACION \n" + "Nombre de cliente: " + nombreCliente + "\nDias de estancia: " +
                diasEstancia + "\nTarifa diaria: " + tarifaDiaria + "\nCuenta con vista al mar: "+
                tieneVistaMar);

    }
}
