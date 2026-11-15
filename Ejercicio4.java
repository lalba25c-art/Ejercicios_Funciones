
package ejercicios;
import java.util.Scanner;

// @author Laura


public class Ejercicio4 {
    /**
    4. Función a la que se le pasan dos enteros
    * y muestra todos los números comprendidos 
    * entre ellos, inclusive. (En la función hay 
    * que comprobar cuál es el mayor y cuál es el menor)
    */

    //FUNCION RANGO
    public static void rango(int v1, int v2){
        int n_mayor, n_menor;

        if(v1 > v2){
            n_mayor = v1;
            n_menor = v2;
        }
        else{
            n_mayor = v2;
            n_menor = v1;
        }

        System.out.println("Los numeros comprendidos entre " + v1 + " y " + v2 + " son:");

        for(int i = n_menor; i <= n_mayor; i++){
            System.out.println(i);
        }
    }


    //FUNCION PRINCIPAL
    public static void main(String[] args) {
        //Solicitud de parámetros
        Scanner teclado = new Scanner(System.in);

        System.out.println("Querido usuario por favor digite un numero: ");
        int numero1;
        numero1 = teclado.nextInt();

        System.out.println("Querido usuario por favor digite otro numero: ");
        int numero2;
        numero2 = teclado.nextInt();

        rango(numero1, numero2);

    }

}
