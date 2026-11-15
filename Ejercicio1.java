package ejercicios;
import java.util.Scanner;

// @author Laura


public class Ejercicio1 {
    /**
     1. Realizar una función, a la que se 
     le pase como parámetro un número
     N, y muestre por pantalla N veces, 
     el mensaje: “Módulo ejecutándose”
     */
    
    //FUNCION MENSAJE
    public static void mensaje(int N){
    for(int i = 0; i < N; i++){
        System.out.println("Modulo ejecutandose");
    }
}
   //FUNCION PRINCIPAL
    public static void main(String[] args) {
        //Solicitud parámetro
        System.out.println("Querido usuario por favor digite un numero: ");
        Scanner teclado = new Scanner(System.in);
        int numero;
        numero = teclado.nextInt();
        mensaje(numero);
    }
    
}
