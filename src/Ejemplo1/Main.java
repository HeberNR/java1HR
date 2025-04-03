package Ejemplo1;

import java.util.logging.Logger;

public class Main {

    // Primer paso, creo constante
    public static final Logger LOGGER
            = Logger.getLogger(Main.class.getName());
                               //miClase.class.getName()

    public static void main(String[] args) {

        // comentario con una sola linea
        /* comentario de multiples lineas
        comentario de multiples lineas
         */

        //Declaracion de variables
        //Tipo de dato nombreVariable = valor;

        byte edad = 30;
        short stock = 230;
        double precio = 10.5;

        System.out.println("La edad es: " + edad);
        System.out.println("El stock es: " + stock);
        System.out.println("El precio es: " + precio);


        LOGGER.info("Esto es un logger");
        LOGGER.info("La edad es: " + edad);
        LOGGER.warning("Esta es una advertencia.");
        LOGGER.severe("Aca paso algo grave..");



        String nombreProducto = "Nootebook HP";
        System.out.println("El nombre del producto es: " + nombreProducto);

        boolean estaDisponible = true;
        char letra = 'A';

        // Esto es una constante
        final byte NRO_ISP = 63;
        System.out.println("El numero del ISP es: " + NRO_ISP);


        System.out.println("Esta es la primera linea \nEsta es la segunda linea");

        String texto = "Este es un segundo texto de tres lineas\nlinea1\nlinea2\nlinea3";
        System.out.println(texto);
    }
}