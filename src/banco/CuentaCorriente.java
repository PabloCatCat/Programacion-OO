package banco;

public class CuentaCorriente {

    //atributos
    private int limiteDescubierto;
    private double saldo;
    private String nombre, dni;

    //setters
    private void setNombre(String nombre){
        this.nombre = nombre;
    }

    private void setDni(String dni) {
        this.dni = dni;
    }

    private void setLimiteDescubierto(int limiteDescubierto) {
        this.limiteDescubierto = limiteDescubierto;
    }

    private void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    //getters

    private String getNombre() {
        return nombre;
    }

    private double getSaldo() {
        return saldo;
    }

    private int getLimiteDescubierto() {
        return limiteDescubierto;
    }

    private String getDni() {
        return dni;
    }

    //constructores
    public CuentaCorriente(String nombre, String dni){
        setNombre(nombre);
        setDni(dni);
        setSaldo(0);
        setLimiteDescubierto(-50);
    }

    //metodos
    public void sacarDinero(double cantidad){
        if ((getSaldo()-cantidad)<getLimiteDescubierto())
            System.out.println("Lo sentimos, no puedes pasar el límite de descubierto.\n");
        else{
            setSaldo(getSaldo()-cantidad);
            System.out.println("Se han sacado " + cantidad + "€\n");
        }
    }

    public void ingresarDinero(double dinero){
        setSaldo(getSaldo()+dinero);
        System.out.println("Se han ingresado " + dinero + "€ correctamente.\n");
    }

    public void mostrarInformacion(){
        System.out.println("Titular: " + getNombre());
        System.out.println("Saldo: " + getSaldo());
        System.out.println("Límite de descubierto: " + getLimiteDescubierto() + "\n");
    }
}
