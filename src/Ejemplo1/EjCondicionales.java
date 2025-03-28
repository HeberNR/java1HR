package Ejemplo1;

import java.util.Scanner;

public class EjCondicionales {

    public static void main(String[] args) { //psvm - atajo para el public static void

        byte stockProducto1;
        double precioProducto1;
        byte stockProducto2;
        double precioProducto2;

        stockProducto1 = 5;
        stockProducto2 = 24;

        precioProducto1 = 6548;
        precioProducto2 = 80000;

        if (stockProducto1 <= 5) {
            System.out.println("Debe comprar producto 1 esta llegando al minimo");
        }  //fin del if
        else {
            System.out.println("No es necesario comprar producto 1");
        } // fin del else

        // condicional con multiples condiciones

        if (stockProducto2 > 500 && precioProducto2 > 8000) {
            System.out.println("Stock excesivo y precio muy alto");
        }

        // variable de tipo scanner para ingresar datos por pantalla
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el stock del producto 1:");
        stockProducto1 = sc.nextByte();

        System.out.println(stockProducto1);


    } // cierra el metodo main
} // cierra la clase
