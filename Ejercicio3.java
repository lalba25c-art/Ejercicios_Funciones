package ejercicios;
import java.util.Scanner;

// @author Laura


public class Ejercicio3 {
    /**
    3. Diseñar una función que tenga como parámetros
    * dos números, y que calcule el máximo.
     */
    
    //FUNCION MENSAJE
    public static void maximo(int n1, int n2){
        if(n1 > n2){
        System.out.println("El maximo entre " + n1 + " y " + n2 + " es: " + n1 );
    }
        else{
          System.out.println("El maximo entre " + n1 + " y " + n2 + " es: " + n2 );  
        }
}
    
   //FUNCION PRINCIPAL
    public static void main(String[] args) {
        //Solicitud parámetro
        System.out.println("Querido usuario por favor digite un numero: ");
        Scanner teclado = new Scanner(System.in);
        int numero1;
        numero1 = teclado.nextInt();
        System.out.println("Querido usuario por favor digite otro numero: ");
        int numero2;
        numero2 = teclado.nextInt();
        maximo(numero1, numero2);
    }
    
}
