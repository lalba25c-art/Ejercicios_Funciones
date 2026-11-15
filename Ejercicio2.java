package ejercicios;
import java.util.Scanner;

// @author Laura


public class Ejercicio2 {
    /**
     2. Escriba una función que sume
     *  los n primeros números impares.
     */
    
    //FUNCION MENSAJE
    public static void suma_impar(int n){
        int suma = 0;
        int cont = 0;
        for(int i = 1; cont < n; i += 2){
            suma += i;
            cont++;
    }
        System.out.println("La suma de los primeros " + n + " es: " + suma );    
}
    
   //FUNCION PRINCIPAL
    public static void main(String[] args) {
        //Solicitud parámetro
        System.out.println("Querido usuario por favor digite un numero: ");
        Scanner teclado = new Scanner(System.in);
        int numero;
        numero = teclado.nextInt();
        suma_impar(numero);
    }
    
}
