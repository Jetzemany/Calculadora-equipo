package utez;

import java.util.Scanner;

public class Suma {
    private float numero1;
    private float numero2;

    public Suma(float Numero1, float Numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public Suma() {
    }

    public float getResultado(float numero1, float numero2) {
        return numero1+numero2;
    }

    public void setResultado(float numero1, float numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

}
