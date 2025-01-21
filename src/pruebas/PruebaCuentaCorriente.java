package pruebas;

import banco.CuentaCorriente;

public class PruebaCuentaCorriente {
    public static void main(String[] args) {
        PruebaCuentaCorriente programa = new PruebaCuentaCorriente();
        programa.inicio();
    }

    private void inicio() {
        CuentaCorriente cuenta1 = new CuentaCorriente("Pablo Herrero","24436957D");

        cuenta1.ingresarDinero(186.56);
        cuenta1.sacarDinero(250);
        cuenta1.mostrarInformacion();
    }
}
