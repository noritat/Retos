
import java.util.Random;
import java.util.Scanner;

public class Reto7{

    public static void main(String[] args) {

        String nombre;
        String valor;
        String resultado;
        String continuar="si";
        int valorapuesta;
       

        Scanner lectura = new Scanner(System.in);

        System.out.println("Ingresa el nombre");
        nombre = lectura.nextLine();
        System.out.println("Ingresa valor de su apuesta");
        valorapuesta = lectura.nextLine();
      
if(valorapuesta>10900){
        Random numaleatorio = new Random();
        int numero = numaleatorio.nextInt(3 + 1);


        while(continuar.equals("si")){
            System.out.println("piedra papel o tijera?\n1 p:piedra \n2 t:tijera \n3 pa:papel ");
            valor = lectura.next();

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
                System.out.println("Has perdido " + nombre);

            } else if (resultado.equals("pa")) {

                System.out.println("Has ganado " + nombre);
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

        } else if (valor.equals("pa")) {
            if (resultado.equals("t")) {

                System.out.println("Has perdido " + nombre);
            }

            else if (resultado.equals("p")) {
                System.out.println("Has ganado " + nombre);

            } else if (resultado.equals("pa")) {

                System.out.println("Has empatado  " + nombre);
            }

        }
    }
}
else{
    System.out.println("ingrese un valor de la apuesta valido   " );
}

        lectura.close();
    }
}

// System.out.println("Has perdido" +nombre);
// System.out.println("Has ganado");