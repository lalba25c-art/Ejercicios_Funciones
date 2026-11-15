package ejercicios;
import java.util.Scanner;

// @author Laura

public class Ejercicio7 {
    /**
    7. Hacer una función que tome como argumentos dos 
    * números enteros x y n, y calcule la potencia xn. 
    * Escribir un programa que lea los valores de x
    * y n y muestre xn (El valor de x debe ser menor 
    * que 50 y el de n menor que 10) para no tener
    * problemas de desbordamiento.
    */

    //FUNCION POTENCIA
    public static void potencia(int b, int e){
        if(b < 50 && e < 10){
            int resultado = (int) Math.pow(b, e);
            System.out.println("El resultado de la potencia numero " + b + " elevado a " + e + " es: " + resultado);
        }
        else if(b < 50 && e >= 10){
            System.out.println("Error: El exponente debe ser menor que 10.");
        }
        else if(b >= 50 && e < 10){
            System.out.println("Error: La base debe ser menor que 50.");
        }
        else{
            System.out.println("Error: La base debe ser menor que 50 y el exponente menor que 10.");
        }
    }

    //FUNCION PRINCIPAL
    public static void main(String[] args) {
        //Solicitud de parámetros
        Scanner teclado = new Scanner(System.in);

        System.out.println("Querido usuario por favor digite la base: ");
        int numero1;
        numero1 = teclado.nextInt();

        System.out.println("Querido usuario por favor digite el exponente: ");
        int numero2;
        numero2 = teclado.nextInt();

        potencia(numero1, numero2);
    }
}