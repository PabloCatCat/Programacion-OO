package pruebas;

import banco.CuentaCorriente;

public class PruebaCuentaCorriente {
    public static void main(String[] args) {
        PruebaCuentaCorriente programa = new PruebaCuentaCorriente();
        programa.inicio();
    }

    private void inicio() {
        CuentaCorriente cuenta1 = new CuentaCorriente();
        CuentaCorriente cuenta2 = new CuentaCorriente(1500);
        CuentaCorriente cuenta3 = new CuentaCorriente("Pablo Herrero", "24436957D");
        CuentaCorriente cuenta4 = new CuentaCorriente(-100, 1500, "24436957D");


        cuenta1.mostrarInformacion();
        cuenta2.mostrarInformacion();
        cuenta3.mostrarInformacion();
        cuenta4.mostrarInformacion();

        cuenta1.sacarDinero(48);
        cuenta2.ingresarDinero(1500);
        cuenta2.sacarDinero(3050);
        cuenta3.ingresarDinero(29.50);
        cuenta4.sacarDinero(1600);
    }
}
