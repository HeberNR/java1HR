package Ejemplo1;

import java.util.Scanner;
import java.util.logging.Logger;

public class Ejercicio3Switch {

    public static final Logger LOGGER
            = Logger.getLogger(Ejercicio3Switch.class.getName());

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char operation;
        double nro1;
        double nro2;
        double resultado;

        System.out.println("Ingrese los números a operar: ");
        nro1 = sc.nextDouble();
        nro2 = sc.nextDouble();

        System.out.println("Seleccione la operación a realizar. (s,r,m,d)");
        operation = sc.next().charAt(0);

        switch (operation) {
            case 's':
                resultado = nro1 + nro2;
                LOGGER.info("El resultado de la suma es: " + resultado);
                break;
            case 'r':
                resultado = nro1 - nro2;
                LOGGER.info("El resultado de la resta es: " + resultado);
                break;
            case 'm':
                resultado = nro1 * nro2;
                LOGGER.info("El resultado de la multiplicación es: " + resultado);
                break;
            case 'd':
                resultado = nro1 / nro2;
                LOGGER.info("El resultado de la división es: " + resultado);
                break;
            default:
                LOGGER.warning("Ingrese una opción válida por favor.");
                break;
        }

    }
}
