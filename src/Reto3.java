/// simular el juego de cara y sello 
import java.util.Random;
import java.util.Scanner;

public class Reto3 {

    public static void main(String[] args) {

        String nombre;
        String carasello;
        double apuesta;
        String resultado;

        Scanner lectura = new Scanner(System.in);

        System.out.println("Ingresa el nombre");
        nombre = lectura.nextLine();

        System.out.println("Ingresa el valor de la apuesta");
        apuesta = Double.parseDouble(lectura.nextLine());
        System.out.println("Ingresa el cara o sello");
        carasello = lectura.nextLine();

        if (apuesta > 10000) {
            Random numaleatorio = new Random();
            int numero = numaleatorio.nextInt(2 + 1);
            if (numero == 1) {
                resultado = "cara";
            } else {
                resultado = "sello";
            }
            if (resultado.equals(carasello)) {
                System.out.println(nombre + " has ganado");
            } else {
                System.out.println(nombre + " has perdido");
            }
        } else {
            System.out.println(" la apuesta debe ser mayor a 10000");
        }
lectura.close();
    }
}