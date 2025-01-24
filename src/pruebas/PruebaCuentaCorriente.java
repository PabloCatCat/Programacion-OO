package pruebas;

import banco.CuentaCorriente;
import banco.Texto;

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
        Texto texto = new Texto(20);



        cuenta3.mostrarInformacion();




    }
}
