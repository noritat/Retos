
import java.util.Random;
import java.util.Scanner;

public class Reto4 {

    public static void main(String[] args) {

        String nombre;
        String valor;
        String resultado;
        int valorapuesta;
       

        Scanner lectura = new Scanner(System.in);

        System.out.println("Ingresa el nombre");
        nombre = lectura.nextLine();
        System.out.println("Ingresa el valor de la apuesta ");
        valorapuesta = lectura.nextLine();
        

if(valorapuesta>1000){
        System.out.println("piedra papel o tijera?\n1 p:piedra \n2 t:tijera \n3 pa:papel ");
        valor = lectura.nextLine();

        Random numaleatorio = new Random();
        int numero = numaleatorio.nextInt(3 + 1);
        if (numero == 1) {
            resultado = "p";
        } else if (numero == 2) {
            resultado = "t";
        } else {
            resultado = "pa";
        }
        System.out.println(" La maquina escogio  "+ resultado);
        if (valor.equals("t")) {
            if (resultado.equals("t")) {

                System.out.println("Has empatado" + nombre);
            }

            else if (resultado.equals("p")) {
                System.out.println("Has ganado " + nombre);

            } else if (resultado.equals("pa")) {

           
                System.out.println("Has perdido " + nombre);
            }

        }

        else if (valor.equals("p")) {
            if (resultado.equals("t")) {

                System.out.println("Has ganado " + nombre);
            }

            else if (resultado.equals("p")) {
                System.out.println("Has empatado " + nombre);

            } else if (resultado.equals("pa")) {

                System.out.println("Has perdido " + nombre);
            }

        } 
        
        else if (valor.equals("pa")) {
            if (resultado.equals("t")) {

                System.out.println("Has gana " + nombre);
            }

            else if (resultado.equals("p")) {
                System.out.println("Has pierde " + nombre);

            } else if (resultado.equals("pa")) {

                System.out.println("Has empatado  " + nombre);
            }

        }
    }
    else{ System.out.println("Ingrese un valor valido");}

        lectura.close();
    }
}

// System.out.println("Has perdido" +nombre);
// System.out.println("Has ganado");