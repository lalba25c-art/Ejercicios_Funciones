
package ejercicios;

import java.util.Scanner;

public class Ejercicios_arrays {

    // FUNCION INVENTARIO
    public static void inventario(Scanner teclado) {

        // Arrays para guardar los equipos
        String[] nombres = new String[20];
        String[] tipos = new String[20];

        int cantidad = 0;
        int opcion;

        do {

            System.out.println("\n****************************************");
            System.out.println("          INVENTARIO DE EQUIPOS");
            System.out.println("****************************************");
            System.out.println("[1] Alta de un equipo");
            System.out.println("[2] Listar todos los equipos");
            System.out.println("[3] Buscar por nombre");
            System.out.println("[0] Salir");
            System.out.println("----------------------------------------");

            System.out.println("Querido usuario, seleccione una opcion:");
            opcion = teclado.nextInt();
            teclado.nextLine();

            switch (opcion) {

                case 1: {
                    if (cantidad < nombres.length) {

                        System.out.println("Querido usuario, digite el nombre del equipo:");
                        nombres[cantidad] = teclado.nextLine();

                        System.out.println("Querido usuario, digite el tipo del equipo:");
                        tipos[cantidad] = teclado.nextLine();

                        cantidad++;

                        System.out.println("Equipo registrado correctamente.");
                    } else {
                        System.out.println("El inventario esta completo.");
                    }

                    break;
                }

                case 2: {
                    System.out.println("\n--- LISTADO DE EQUIPOS ---");

                    if (cantidad == 0) {
                        System.out.println("No hay equipos registrados.");
                    } else {

                        for (int i = 0; i < cantidad; i++) {

                            System.out.println("Nombre: " + nombres[i]);
                            System.out.println("Tipo: " + tipos[i]);
                            System.out.println("----------------------------------------");
                        }
                    }

                    break;
                }

                case 3: {
                    System.out.println("Querido usuario, escriba el nombre del equipo que desea buscar:");
                    String buscar = teclado.nextLine();

                    int encontrado = 0;

                    for (int i = 0; i < cantidad; i++) {

                        if (nombres[i].equals(buscar)) {

                            System.out.println("Nombre: " + nombres[i]);
                            System.out.println("Tipo: " + tipos[i]);

                            encontrado = 1;
                        }
                    }

                    if (encontrado == 0) {
                        System.out.println("El equipo no se encuentra registrado.");
                    }

                    break;
                }

                case 0: {
                    System.out.println("Gracias por utilizar el inventario. Hasta pronto.");
                    break;
                }

                default: {
                    System.out.println("Error: La opcion seleccionada no existe.");
                    break;
                }
            }

        } while (opcion != 0);
    }
}
