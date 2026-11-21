
package ejercicios;
import java.util.Scanner;

// @author Laura

public class Catalogo_Ejercicios {

    //FUNCION PRINCIPAL
    public static void main(String[] args) {

        //Declaracion de variables y metodo de escaneo
        Scanner teclado = new Scanner(System.in);

        int opcion;
        int continuar;

        do {

            System.out.println("\n****************************************");
            System.out.println("       MENU PRINCIPAL DE EJERCICIOS");
            System.out.println("****************************************");
            System.out.println("[1] Ejercicio 1 - Mostrar mensaje");
            System.out.println("[2] Ejercicio 2 - Suma de numeros impares");
            System.out.println("[3] Ejercicio 3 - Numero maximo");
            System.out.println("[4] Ejercicio 4 - Rango de numeros");
            System.out.println("[5] Ejercicio 5 - Calcular el doble");
            System.out.println("[6] Ejercicio 6 - Codigo de error");
            System.out.println("[7] Ejercicio 7 - Calcular potencia");
            System.out.println("[8] Ejercicio 8 - Area o volumen del cilindro");
            System.out.println("[9] Ejercicio 9 - Inventario de equipos");
            System.out.println("[0] Salir");
            System.out.println("----------------------------------------");

            System.out.println("Querido usuario, por favor seleccione una opcion:");
            opcion = teclado.nextInt();

            switch(opcion){

                case 1: {
                    System.out.println("\n--- EJECUTANDO EJERCICIO 1 ---");
                    System.out.println("Digite cuantas veces desea mostrar el mensaje:");
                    int numero = teclado.nextInt();

                    Ejercicio1.mensaje(numero);
                    break;
                }

                case 2: {
                    System.out.println("\n--- EJECUTANDO EJERCICIO 2 ---");
                    System.out.println("Digite cuantos numeros impares desea sumar:");
                    int numero = teclado.nextInt();

                    Ejercicio2.suma_impar(numero);
                    break;
                }

                case 3: {
                    System.out.println("\n--- EJECUTANDO EJERCICIO 3 ---");
                    System.out.println("Digite el primer numero:");
                    int numero1 = teclado.nextInt();

                    System.out.println("Digite el segundo numero:");
                    int numero2 = teclado.nextInt();

                    Ejercicio3.maximo(numero1, numero2);
                    break;
                }

                case 4: {
                    System.out.println("\n--- EJECUTANDO EJERCICIO 4 ---");
                    System.out.println("Digite el primer numero:");
                    int numero1 = teclado.nextInt();

                    System.out.println("Digite el segundo numero:");
                    int numero2 = teclado.nextInt();

                    Ejercicio4.rango(numero1, numero2);
                    break;
                }

                case 5: {
                    System.out.println("\n--- EJECUTANDO EJERCICIO 5 ---");
                    System.out.println("Digite un numero:");
                    int numero = teclado.nextInt();

                    Ejercicio5.doble(numero);
                    break;
                }

                case 6: {
                    System.out.println("\n--- EJECUTANDO EJERCICIO 6 ---");
                    System.out.println("Digite el codigo de error:");
                    int codigo = teclado.nextInt();

                    Ejercicio6.codigo_error(codigo);
                    break;
                }

                case 7: {
                    System.out.println("\n--- EJECUTANDO EJERCICIO 7 ---");
                    System.out.println("Digite la base de la potencia:");
                    int base = teclado.nextInt();

                    System.out.println("Digite el exponente:");
                    int exponente = teclado.nextInt();

                    Ejercicio7.potencia(base, exponente);
                    break;
                }

                case 8: {
                    System.out.println("\n--- EJECUTANDO EJERCICIO 8 ---");
                    System.out.println("Seleccione el calculo que desea realizar:");
                    System.out.println("[a] Calcular area del cilindro");
                    System.out.println("[v] Calcular volumen del cilindro");

                    char opcion_cilindro;
                    opcion_cilindro = teclado.next().charAt(0);

                    if(opcion_cilindro == 'a' || opcion_cilindro == 'v'){

                        System.out.println("Digite el radio del cilindro:");
                        double radio = teclado.nextDouble();

                        System.out.println("Digite la altura del cilindro:");
                        double altura = teclado.nextDouble();

                        if(opcion_cilindro == 'a'){
                            double area = Ejercicio8.area_cilindro(radio, altura);
                            System.out.println("El area del cilindro es: " + area);
                        }
                        else{
                            double volumen = Ejercicio8.volumen_cilindro(radio, altura);
                            System.out.println("El volumen del cilindro es: " + volumen);
                        }

                    }
                    else{
                        System.out.println("Error: La opcion seleccionada no es valida.");
                    }

                    break;
                }

                case 9: {
                    System.out.println("\n--- EJECUTANDO EJERCICIO 9 ---");
                    Ejercicios_arrays.inventario(teclado);
                    break;
                }

                case 0: {
                    System.out.println("Gracias por utilizar el programa. Hasta pronto.");
                    break;
                }

                default: {
                    System.out.println("Error: La opcion seleccionada no existe.");
                    break;
                }

            }

            if(opcion != 0){
                System.out.println("\n Desea realizar otra operacion?");
                System.out.println("[1] Volver al menu principal");
                System.out.println("[0] Salir del programa");
                System.out.println("Seleccione una opcion:");
                continuar = teclado.nextInt();
            }
            else{
                continuar = 0;
            }

        } while(continuar != 0);

        System.out.println("\nPrograma finalizado. Hasta pronto!");

    }
}

