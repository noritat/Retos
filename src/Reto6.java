//Programa para comprar n cantidad de productos en una tienda, el cual pidamos el nombre del  empleado, nombre cliente si existe puede
//comprar si no no, precio producto , totaal a pagar y dar vueltas

import java.util.Scanner;

public class Reto6 {

    public static void main(String[] args) {
        String nombreempleado;
        String nombre;
        String nombreclientesr = "Carol,Luisa,Carlos,Maria,Tatiana,Luis,Brayan";
        double precioproducto;
        double totalpagar=0;
        double costopagar;
        double vueltas;
        int cantidadp;

        Scanner lectura = new Scanner(System.in);
        System.out.println("Ingrese nombre empleado");
        nombreempleado = lectura.next();
        System.out.println("ingrese el nombre del cliente");
        nombre = lectura.next();

        if (nombreclientesr.contains(nombre)) {
            System.out.println("ingrese la cantidad de productos");
            cantidadp = lectura.nextInt();
            //creamos un bucle 
            for (int i = 0; i < cantidadp; i++) {
                System.out.println("ingrese el precio producto" + i);
                precioproducto = lectura.nextDouble();
                totalpagar = totalpagar + precioproducto;


            }
            System.out.println("con cuantos vas a pagar");
            costopagar=lectura.nextDouble();

            while(costopagar<totalpagar){
                System.out.println("el valor ingresado no alcanza, digite el valor");
                costopagar=lectura.nextDouble();



            }

            vueltas=(costopagar- totalpagar);
            System.out.println("Te atendio" +nombreempleado);
            System.out.println("total a pagar:" +totalpagar);
            System.out.println("Pago con: "+costopagar );
            System.out.println("Tus cambio es:  "+vueltas);

        }

        else{
 System.out.println("Tu usuario no esta registrado");
        }
lectura.close();
    }
}