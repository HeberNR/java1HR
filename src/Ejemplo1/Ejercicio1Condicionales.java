package Ejemplo1;

public class Ejercicio1Condicionales {

    public static void main(String[] args) {

        int num1 = 3;
        int num2 = 8;
        int num3 = 44;

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
