package banco;

public class Texto {
    int longitudMax;

    //setters
    public void setLongitudMax(int longitudMax) {
        this.longitudMax = longitudMax;
    }

    //getters
    public int getNumVocales(String cadena){
        int num=0;

        for (int i = 0; i < cadena.length(); i++) {
            if (isVocal(cadena.charAt(i)))
                num++;
        }
        return num;
    }

    //constructores
    public Texto(int longitudMax){
        setLongitudMax(longitudMax);
    }

    //metodos
    public String addCharIzq(String cadena, char letra){
        if (cadena.length()+1 <= longitudMax)
            return letra + cadena;
        else
            return cadena;
    }

    public String addCharDcha(String cadena, char letra) {
        if (cadena.length() + 1 <= longitudMax)
            return cadena + letra;
        else
            return cadena;
    }

    public String addStringDcha(String cadena, String cadenaNueva) {
        if (cadena.length() + cadenaNueva.length() <= longitudMax)
            return cadena + cadenaNueva;
        else
            return cadena;
    }

    public String addStringIzq(String cadena, String cadenaNueva) {
        if (cadena.length() + cadenaNueva.length() <= longitudMax)
            return cadenaNueva + cadena;
        else
            return cadena;
    }

    public boolean isVocal(char letra){
        switch (letra){
            case 'a', 'e', 'i', 'o', 'u',
                 'A', 'E', 'I', 'O', 'U':
                return true;
            default:
                return false;
        }
    }
}
