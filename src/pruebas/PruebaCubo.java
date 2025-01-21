package pruebas;
import cubo.Cubo;

public class PruebaCubo {
    public static void main(String[] args) {
        Cubo cubo1 = new Cubo(5,"plástico");

        cubo1.llenar();
        cubo1.setColor("azul");
    }
}
