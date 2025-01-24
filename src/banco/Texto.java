package banco;

public class Texto {
    private int longitudMax;
    private String cadena;
    private final String VOCALES = "aáàeèéiíìoóòuúùü";

    //setters
    public void setLongitudMax(int longitudMax) {
        this.longitudMax = longitudMax;
    }

    //getters
    public int getNumVocales(){
        int vocales=0;

        for (int i = 0; i < cadena.length(); i++) {
            if (isVocal(cadena.charAt(i)))
                vocales++;
        }
        return vocales;
    }

    //constructores
    public Texto(int longitudMax){
        setLongitudMax(longitudMax);
    }

    //metodos
    public void addCharIzq(char letra){
        if (cadena.length()+1 <= longitudMax)
            cadena = letra + cadena;
    }

    public void addCharDcha(char letra) {
        if (cadena.length() + 1 <= longitudMax)
            cadena = cadena + letra;
    }

    public void addStringDcha(String cadenaNueva) {
        if (cadena.length() + cadenaNueva.length() <= longitudMax)
            cadena = cadena + cadenaNueva;
    }

    public void addStringIzq(String cadenaNueva) {
        if (cadena.length() + cadenaNueva.length() <= longitudMax)
            cadena = cadenaNueva + cadena;
    }

    public boolean isVocal(char letra){
        letra = Character.toLowerCase(letra);

        if (VOCALES.indexOf(letra)!=-1)
            return true;
        else
            return false;

        }
    }
}
