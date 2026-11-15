package ejercicios;
import java.util.Scanner;

// @author Laura


public class Ejercicio8 {
    /**
    8. Realizar una función que calcule (muestre en pantalla) el área o el
    * volumen de un cilindro, según se especifique. Para distinguir un caso de
    * otro se le pasará el carácter 'a' (para área) o 'v' (para el volumen).
    * Además hemos de pasarle a la función el radio y la altura.
    */

    //FUNCION AREA CILINDRO
    public static double area_cilindro(double r, double h){
        return 2 * Math.PI * r * (r + h);
    }

    //FUNCION VOLUMEN CILINDRO
    public static double volumen_cilindro(double r, double h){
        return Math.PI * Math.pow(r, 2) * h;
    }


    //FUNCION PRINCIPAL
    public static void main(String[] args) {
        //Declaracion de variables y metodo de escaneo
        Scanner teclado = new Scanner(System.in);

        char opcion;
        double r = 0;
        double h = 0;

        System.out.println("************************************************");
        System.out.println("---CALCULADORA DE AREA O VOLUMEN DEL CILINDRO---\n");
        System.out.println("Por favor digite la opción que desea:\n");
        System.out.println("-------------------------------------------------");
        System.out.println("[a] Calculo de area de un cilindro");
        System.out.println("[v] Calculo de volumen de un cilindro");
        System.out.println("-------------------------------------------------");

        //SELECCIÓN MENU
        opcion = teclado.next().charAt(0);

        if(opcion == 'a' || opcion == 'v'){

            System.out.println("Querido usuario por favor digite el valor del radio del cilindro:");
            r = teclado.nextDouble();

            System.out.println("Ahora por favor introduzca el valor de la altura del cilindro:");
            h = teclado.nextDouble();

            switch(opcion){

                case 'a':
                    double area = area_cilindro(r, h);
                    System.out.println("El area del cilindro es: " + area);
                    break;

                case 'v':
                    double volumen = volumen_cilindro(r, h);
                    System.out.println("El volumen del cilindro es: " + volumen);
                    break;

            }
        }
        else{
            System.out.println("Error: La opción seleccionada no es válida.");
        }

    }

}