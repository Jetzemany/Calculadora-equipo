package utez;

import java.util.Scanner;

public class Division {
    private float num1;
    private float num2;

    public float getNum1() {
        return num1;
    }
    public void setNum1(float num1) {
        this.num1 = num1;
    }
    public float getNum2() {
        return num2;
    }
    public void setNum2(float num2) {
        this.num2 = num2;
    }

    public Division(float num1, float num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public Division() {
    }

    public float Division(float num1, float num2) {
        if (num1 == 0 ) {
            return 0;
        }
        return num1 / num2;
    }

    public static void main(String[] args) {
        Scanner miScanner = new Scanner(System.in);
        System.out.print("Ingrese numero 1 : ");
        float num1 = miScanner.nextFloat();
        System.out.print("Ingrese numero 2 : ");
        float num2 = miScanner.nextFloat();
        Division division = new Division(num1, num2);
        float resultado = division.Division(num1, num2);
        System.out.println("El resultado de la division es: " + resultado);
    }
}
