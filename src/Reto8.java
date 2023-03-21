//Clase la cual nos permite crear un numero aleatorio (Random)
import java.util.Random;
import java.util.Scanner;

public class Reto8 {

  public static void main(String[] args) {

    String nombre;
    String carasello;
    double apuesta;
    String resultado;
    boolean continuar = true;
    int i = 0;
    double acomulado = 0;
    int vecesjugadas = 0;

    Scanner lectura = new Scanner(System.in);

    System.out.println("Ingresa el nombre");
    nombre = lectura.nextLine();

    System.out.println("Ingresa el valor de la apuesta");
    apuesta = Double.parseDouble(lectura.nextLine());

    if (apuesta >= 10000) {

      while (continuar) {
        System.out.println("Ingresa el cara o sello");
        carasello = lectura.next();
        vecesjugadas++;
        Random numaleatorio = new Random();
        int numero = numaleatorio.nextInt(2 + 1);
        if (numero == 1) {
          resultado = "cara";
        } else {
          resultado = "sello";
        }
        if (resultado.equals(carasello)) {
          System.out.println(nombre + " has ganado");
          acomulado = acomulado + apuesta;
        } else {
          System.out.println(nombre + " has perdido");
          acomulado = acomulado - apuesta;

        }
        System.out.println("Tu acomulado es " + acomulado);
        System.out.println("IQuieres seguir jugando?");
        if (lectura.next().equalsIgnoreCase("si")) {
          continuar = true;
        } else {
          continuar = false;
        }
      }

    } else {
      System.out.println(" la apuesta debe ser mayor a 10000");
    }

    System.out.println("NOMBRE " + nombre);
    System.out.println("TU ACOMULADO ES: " + acomulado);
    System.out.println("LA VECES QUE JUGASTE FUERON " + vecesjugadas);
    lectura.close();
  }
}