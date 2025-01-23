package pruebas;
import cubo.Cubo;
import enumerados.Material;

public class PruebaCubo {
    public static void main(String[] args) {
        Cubo cubo1 = new Cubo(5, Material.Madera);

        cubo1.llenar();
        cubo1.setColor("azul");
    }
}
