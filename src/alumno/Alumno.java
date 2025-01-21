package alumno;

public class Alumno {

    //atributos
    String nombre;
    private double notaMedia;

    //metodos
    public void asignarNota (double notaMedia){
        if (notaMedia>=0&&notaMedia<=10)
            this.notaMedia=notaMedia;
        else
            System.out.println("Nota incorrecta");
    }
}
