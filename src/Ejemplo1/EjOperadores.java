package Ejemplo1;

public class EjOperadores {

    public static void main(String[] args) {

        double precio;
        int cantidad;
        double total;
        byte unidades;

        // Operador de asignacion
        precio = 6542.55;
        cantidad = 5;

        total = precio * cantidad; // Operador de asignacion y multiplicacion
        System.out.println("El total es " + total);

        precio = 7852.55;
        cantidad = 256;

        //total = total + (precio * cantidad);
        total += precio * cantidad;
        System.out.println("El total es " + total);

        cantidad++; // operador unario 
        System.out.println(cantidad);






    }
}
