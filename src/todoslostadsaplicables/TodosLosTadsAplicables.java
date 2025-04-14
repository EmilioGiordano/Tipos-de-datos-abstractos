/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package todoslostadsaplicables;

import java.util.Scanner;

/**
 *
 * @author Operador
 */
public class TodosLosTadsAplicables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        Cola c = new Cola();

        Pila p = new Pila();

        Lista l = new Lista();

        //aplicarCola(c, in);
        //AplicarPila(p, in);
        AplicarLista(l, in);

    }

    public static void aplicarCola(Cola queue, Scanner in) {

        int length;
        int top;
        int bottom;
        boolean empty;

        queue.push(queue, 1);
        queue.push(queue, 2);
        queue.push(queue, 3);
        queue.push(queue, 4);
        queue.push(queue, 5);
        queue.push(queue, 6);
        queue.push(queue, 7);
        queue.length(queue);

        queue.printQueue(queue);

        bottom = queue.bottom(queue);
        System.out.println("BOTTOM: " + bottom);

        top = queue.top(queue);
        System.out.println("TOP: " + top);

        length = queue.length(queue);
        System.out.println("TAMAÑO: " + length);

        empty = queue.empty(queue);
        System.out.println(empty);

    }

    public static void AplicarPila(Pila stack, Scanner in) {

        int lenght;
        int tope;
        int elementoEliminado = 0;
        boolean empty;

        stack.push(stack, 12);
        stack.push(stack, 13);
        stack.push(stack, 14);
        stack.push(stack, 15);
        stack.push(stack, 16);

        lenght = stack.length(stack);
        System.out.println("El tamaño de la pila es: " + lenght);

        //IMPRIMIR TOPE
        System.out.println(imprimirTOP(stack, elementoEliminado));

        System.out.println(imprimirTOP(stack, elementoEliminado));
        System.out.println(imprimirTOP(stack, elementoEliminado));
        System.out.println(imprimirTOP(stack, elementoEliminado));
        System.out.println(imprimirTOP(stack, elementoEliminado));
        System.out.println(imprimirTOP(stack, elementoEliminado));

    }

    public static int imprimirTOP(Pila stack, int elementoEliminado) {

        System.out.println("ELEMENTO TOPE DE LA PILA");
        elementoEliminado = stack.pop(stack);
        return elementoEliminado;
    }

    public static void AplicarLista(Lista l, Scanner in) {

        int operacion = 0;
        Boolean empty;

        do {
            try {

                System.out.println("\n\n<<< LISTA >>>");
                System.out.println("1.- Insertar");
                System.out.println("2.- Insertar al final");
                System.out.println("3.- Eliminar elemento");
                System.out.println("4.- Mostrar lista");
                System.out.println("5.- ¿Lista vacía");
                System.out.println("6.- Salir");

                System.out.print("Opcion? ---> ");
                operacion = in.nextInt();
                switch (operacion) {
                    case 1:
                        System.out.println("Ingrese el numero a insertar a la lista:");
                        int n = in.nextInt();
                        l.insert(l, n);
                        break;

                    case 2:
                        System.out.println("ingrese el numero a insertar al final de la lista:");
                        int nu = in.nextInt();
                        l.insertarElementoAlFinal(l, nu);
                        break;
                    case 3:
                        break;
                    case 4:
                        System.out.println("");
                        System.out.println("------- Lista -------");
                        l.mostrarLista(l);
                        break;
                    case 5:
                        empty = l.empty(l);
                        if (l.primero == null) {
                            System.out.println("--------------------");
                            System.out.println("La lista está vacía");
                            System.out.println("--------------------");
                        } else {
                            System.out.println("----------------------");
                            System.out.println("La lista NO está vacía");
                            System.out.println("----------------------");
                        }
                        break;

                    case 6:
                        break;

                    default:
                        System.out.println("ingrese una opcion valida");
                }
            } catch (NumberFormatException e) {
            }

        } while (operacion != 6);
    }
}
