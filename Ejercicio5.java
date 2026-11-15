package ejercicios;
import java.util.Scanner;

// @author Laura


public class Ejercicio5 {
    /**
    5. Función que muestra en pantalla el doble
    * del valor que se le pasa como parámetro.
     */
    
    //FUNCION MENSAJE
    public static void doble(int v){
       System.out.println("El doble del numero " + v + " es: " + (v*2));
}
    
   //FUNCION PRINCIPAL
    public static void main(String[] args) {
        //Solicitud parámetro
        System.out.println("Querido usuario por favor digite un numero: ");
        Scanner teclado = new Scanner(System.in);
        int numero1;
        numero1 = teclado.nextInt();
        doble(numero1);
    }
    
}
