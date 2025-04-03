package Ejemplo1;

import java.util.Scanner;

public class Ejercicio2Condicionales {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double resultado = 0;

        int ope;

        int num1;
        int num2;


        System.out.println("Ingrese el primer número: ");
        num1 = sc.nextInt();
        System.out.println("Ingrese el segundo número:");
        num2 = sc.nextInt();


        System.out.println("Seleccione una operación a realizar:\n1.Suma\n2.Resta\n3.Dividir\n4.Multiplicar");
            ope = sc.nextInt();

        if (ope == 1) {
            System.out.println("Se realizará una suma");
            resultado += num1 + num2;
            System.out.println("El resultado es: " + resultado);
        } else if (ope == 2) {
            System.out.println("Se realizará una resta");
            resultado += num1 - num2;
            System.out.println("El resultado es: " + resultado);
        } else if (ope == 3) {
            System.out.println("Se realizará una división");
            resultado = (double) num1 / num2;
            System.out.println("El resultado es: " + resultado);
        }
        else {
            System.out.println("Se realizará una multiplicación");
            resultado += num1 * num2;
            System.out.println("El resultado es: " + resultado);
        }





    }

}
