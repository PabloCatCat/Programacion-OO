package banco;

public class CuentaCorriente {


    //atributos
    static String nombreBanco = "Sabadell";
    private int limiteDescubierto;
    private double saldo;
    public String nombre;
    String dni;

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

    private static void setNombreBanco(String nombreBanco) {
        CuentaCorriente.nombreBanco = nombreBanco;
    }

    //getters

    private String getNombreBanco(){
        return nombreBanco;
    }

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
    public CuentaCorriente(){
        setNombre("");
        setDni("");
        setLimiteDescubierto(-50);
        setSaldo(0);
    }

    public CuentaCorriente(String nombre, String dni){
        setNombre(nombre);
        setDni(dni);
        setSaldo(0);
        setLimiteDescubierto(-50);

    }

    public CuentaCorriente(int limiteDescubierto, double saldo, String dni) {
        this();
        setLimiteDescubierto(limiteDescubierto);
        setSaldo(saldo);
        setDni(dni);
    }

    public CuentaCorriente(double saldo){
        this();
        setSaldo(saldo);
    }

    //metodos
    public void sacarDinero(double cantidad){
        if ((getSaldo()-cantidad)<getLimiteDescubierto())
            System.out.println("Lo sentimos, no puedes pasar el límite de descubierto.");
        else{
            setSaldo(getSaldo()-cantidad);
            System.out.println("Se han sacado " + cantidad + "€ correctamente.");
        }
    }

    public void ingresarDinero(double dinero){
        setSaldo(getSaldo()+dinero);
        System.out.println("Se han ingresado " + dinero + "€ correctamente.");
    }

    public void mostrarInformacion(){
        System.out.println("Titular: " + getNombre());
        System.out.println("Saldo: " + getSaldo());
        System.out.println("Límite de descubierto: " + getLimiteDescubierto());

    }

    void cambiarNombreBanco(String nombreBanco){
        setNombreBanco(nombreBanco);
    }
}
