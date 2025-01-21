package pruebas;

public class GatoSimple {

    String color;
    String raza;
    byte edad;
    String sexo;
    float peso;

    void maullar(){
        System.out.println("Miau");
    }
    void ronronear(){
        System.out.println("Purr");
    }
    void comer(){
        System.out.println("Ñam ñam");
    }
    void pelear(GatoSimple contrincante){
        if (sexo.equalsIgnoreCase("Macho")&&contrincante.sexo.equalsIgnoreCase("Macho")){
            System.out.println("Se dan de zarpazos");
        }else
            System.out.println("No pelean");
    }

    public GatoSimple(String color, String raza, byte edad, String sexo, float peso) {
        this.color = color;
        this.raza = raza;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
    }
}
