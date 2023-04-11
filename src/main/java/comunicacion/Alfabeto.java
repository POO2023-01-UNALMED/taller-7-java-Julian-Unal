package comunicacion;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Alfabeto extends Pictograma {
    private String[] letras;
    private String interpretacion;

    public Alfabeto(String origen, String[] letras, String interpretacion) {
        super(origen);
        this.letras = letras;
        this.interpretacion = interpretacion;
    }

    @Override
    public String interpretacion() {
        return this.interpretacion;
    }

    @Override
    public String toString() {
        String text = "";
        for (String letra:
             this.letras) {
            text += (letra + ", ");
        }
        text = text.substring(0, text.length() - 2);
        System.out.println(text);
        return text;
    }

    public int cantidadLetras() {
        return letras.length;
    }

    public String getInterpretacion() {
        return interpretacion;
    }

    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }

    public String[] getLetras() {
        return letras;
    }

    public void setLetras(String[] letras) {
        this.letras = letras;
    }
}
