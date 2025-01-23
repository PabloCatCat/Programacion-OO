package cubo;

import enumerados.Material;

public class Cubo {

    //atributos
    int capacidadMaxima, contenidoLiquido;
    String color;
    Material material;
    boolean asa;

    //getters

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public int getContenidoLiquido() {
        return contenidoLiquido;
    }

    public String getColor() {
        return color;
    }

    public Material getMaterial() {
        return material;
    }

    public boolean isAsa() {
        return asa;
    }

    //setters
    public void setColor(String color){
        this.color = color;
    }
    public void setAsa(boolean asa){
        this.asa = asa;
    }

    private void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    //constructor
    public Cubo(int capacidadMaxima, Material material){
        setCapacidadMaxima(capacidadMaxima);
        this.material = material;
        color = "rojo";
        asa = true;
        contenidoLiquido = 0;
    }

    //metodos
    public void llenar(){
        contenidoLiquido = capacidadMaxima;
        System.out.println("El cubo se ha llenado");
    }

    public void vaciar(){
        contenidoLiquido = 0;
    }

    public void ponerLiquido(int litros){
        contenidoLiquido += litros;
    }

    public void quitarLiquido(int litros){
        contenidoLiquido -= litros;
    }

}
