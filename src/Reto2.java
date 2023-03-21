/*
realiar un programa donde me permita calcular las dosis asignada de una vacuna, dependiendo del peso y los meses del bebe 
 */

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Reto2 {
  public static void main(String[] args) {
    // declaramos variables
    String nombremama;
    String nombrebebe;
    String nombrevacuna;
    int mesesbebe;
    double pesobebe = 0;
    double dosisasignadas;
    // capturamos datos
    Scanner lectura = new Scanner(System.in);
    System.out.println("Ingrese el nombre de la mama");
    nombremama = lectura.nextLine();
    System.out.println("Ingrese el nombre de el bebe");
    nombrebebe = lectura.nextLine();
    System.out.println("Ingrese el nombre de la vacuna");
    nombrevacuna = lectura.nextLine();
    System.out.println("Ingrese los meses del bebe");
    mesesbebe = lectura.nextInt();
    System.out.println("Ingrese el peso de el bebe");
    pesobebe = lectura.nextDouble();
    // se realiza la operacion
    dosisasignadas = (pesobebe + 10) / (mesesbebe * 10) * 8;
    // se imrpime el mnensaje

    System.out.println("EL ACUDIENTE ES:  " + nombremama);
    System.out.println("EL NOMBRE DE EL BEBE ES:  " + nombrebebe);
    System.out.println("EL NOMBRE DE LA VACUNA ES:  " + nombrevacuna);
    System.out.println("LA DOSIS ASIGNADA ES:  " + dosisasignadas);

    lectura.close();
  }

}
