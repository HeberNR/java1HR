package Ejemplo1;

import java.util.Scanner;

public class Ejercicio1Condicionales {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num1;
        int num2;
        int num3;

        System.out.println("Ingrese el valor del primer número: ");
        num1 = sc.nextInt();
        System.out.println("Ingrese el valor del segundo número: ");
        num2 = sc.nextInt();
        System.out.println("Ingrese el valor del segundo número: ");
        num3 = sc.nextInt();

        if  (num1 > num2 && num1 > num3) {
            System.out.println("El numero mayor es: " + num1);
        }
        else if (num2 > num1 && num2 > num3) {
            System.out.printf("El numero mayor es: " + num2);
        }
        else {
            System.out.printf("El numero mayor es: " + num3);
        }


    }

}
