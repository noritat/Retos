/*
 La abuela neceista realizar un postre en un microondas haci pasando de grados kelvin a grados centigrados 
 */


import java.util.Scanner;

/**
 *
 * @author user
 */
public class Reto1 {
    public static void main (String []args){
    float grados_k;
    double constante=273.15;
   double grados_c;
  
    
        Scanner lectura=new Scanner(System.in);
        System.out.println("ingrese el valor en grados kelvin");
        grados_k=consola.nextFloat();
        grados_c=grados_k - constante;

        /// grados_c=grados_k - 273.15;
        System.out.println("El valor en centigrados es"+ grados_c);
        
        
        
        
    lectura.close();
    
    }
    
}
