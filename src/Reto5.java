
import java.util.Random;
import java.util.Scanner;

public class Reto5 {

    public static void main(String[] args) {
        int vidas=10;
        int numero;
        int numeropc=0;
       


        Scanner lectura=new Scanner(System.in);
        Random numaleatorio = new Random();
        numeropc = numaleatorio.nextInt((100) + 1);

while(!(vidas == 0)){

    

     System.out.println("ingrese un numero del 1 al 100");
     numero=lectura.nextInt();

     if(numero==numeropc)
     {
        System.out.println("Has ganado");
        break;
        
     }
     else{
        System.out.println("Has perdido una vida");
        vidas--;
        
        if(numeropc>numero){
            System.out.println("El numero es mayor al que se digito");

        }
        else{
            System.out.println("el numero es menor ");
        }
     }
     if(vidas==0){
        System.out.println("el numero era " +numeropc);
     }

     

  

}
lectura.close();
        

    }}