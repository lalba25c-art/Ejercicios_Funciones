

package ejercicios;
import java.util.Scanner;

// @author Laura

public class Ejercicio6 {
    /**
    6. Escribir un método que recibe como parámetro un código de control
    * numérico y conforme a este código imprime un mensaje de error u otro.
    */

    //FUNCION CODIGO DE ERROR
    public static void codigo_error(int codigo){

        if(codigo == 1){
            System.out.println("Error en memoria. Revisar la memoria del equipo.");
        }
        else if(codigo == 2){
            System.out.println("Papel atascado en impresora. Revisar la impresora.");
        }
        else if(codigo == 3){
            System.out.println("Disco defectuoso. Revisar el disco del equipo.");
        }
        else{
            System.out.println("Error indefinido. El codigo introducido no existe.");
        }

    }


    //FUNCION PRINCIPAL
    public static void main(String[] args) {
        //Declaracion de variables y metodo de escaneo
        Scanner teclado = new Scanner(System.in);

        System.out.println("Querido usuario por favor digite el codigo de error: ");
        int codigo;
        codigo = teclado.nextInt();

        codigo_error(codigo);

    }

}