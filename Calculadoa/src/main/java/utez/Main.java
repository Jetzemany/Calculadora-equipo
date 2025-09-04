package utez;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite un numero (numero 1): ");
        float num1 = sc.nextFloat();
        System.out.println("Digite un numero (numero 2): ");
        float num2 = sc.nextFloat();

        System.out.println("----Menu----");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Division");

        int opcion = sc.nextInt();

        Division division = new Division();
        Multiplicacion multiplicacion = new Multiplicacion(num1, num2);
        Suma suma = new Suma(num1, num2);
        Resta resta = new Resta(num1, num2);



        switch (opcion){
            case 1:

                float resultadoSuma = suma.getResultado(num1, num2);
                System.out.println("El resultado de la suma es: " + resultadoSuma);
                break;
                case 2:

                    float resultadoResta = resta.getResultado(num1, num2);
                    System.out.println("El resultado de la resta es: " + resultadoResta);

                    break;
                    case 3:
                        float resultadoMultiplicacion = multiplicacion.Multiplicacion();
                        System.out.println("El resultado de la multiplicación es: " + resultadoMultiplicacion);

                        break;
                        case 4:
                            division.Division(num1,num2);
                            float resultado = division.Division(num1, num2);
                            System.out.println("El resultado de la division es: " + resultado);
                            break;
        }

    }
}