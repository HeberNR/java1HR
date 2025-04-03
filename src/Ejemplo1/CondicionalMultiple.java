package Ejemplo1;

import java.util.Scanner;
import java.util.logging.Logger;

public class CondicionalMultiple {

    public static final Logger LOGGER
            = Logger.getLogger(CondicionalMultiple.class.getName());

    public static void main(String[] args) {

        //Declaro la variable
        byte nroDia;
        //Creo el scanner
        Scanner sc = new Scanner(System.in);
        //Muestro que debe ingresar
        LOGGER.info("Ingrese el nro de día: ");
        //Ingreso el dato
        nroDia = sc.nextByte();

        //Condicional multiple

        switch (nroDia){
            case 1:
                LOGGER.info("Domingo");
                break;
            case 2:
                LOGGER.info("Lunes");
                break;
            case 3:
                LOGGER.info("Martes");
                break;
            case 4:
                LOGGER.info("Miércoles");
                break;
            case 5:
                LOGGER.info("Jueves");
                break;
            case 6:
                LOGGER.info("Viernes");
                break;
            case 7:
                LOGGER.info("Sábado");
                break;
            default:
                LOGGER.warning("No es una opción válida.");
        }//cierra el switch


        //Operador ternario

        /*
        String mensaje = "";

        if(nroDia == 1)
            mensaje = "Hoy no se trabaja";
        else
            mensaje = "Hoy se trabaja";

         */

        String mensaje = (nroDia==1) ? "Hoy no se trabaja" : "Hoy se trabaja";
        // variable = (condicion) ? valorSiVerdadero : valorSiFalso;

        LOGGER.info(mensaje);


    }

}
