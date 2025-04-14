/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package todoslostadsaplicables;

/**
 *
 * @author Operador
 */
public class Pila {

    int elemento;
    int nElementos;
    int max = 10;
    int array[] = new int[max];

    // ABSTRACCION FUNCIONAL: Permite dotar a la aplicacion de 
    // Operaciones no definidas en el lenguaje
    public void push(Pila p, int elemento) {

        if (p.nElementos == max) {
            System.out.println("La pila está llena.");

        } else {
            p.nElementos = (p.nElementos + 1);
            p.array[p.nElementos] = elemento;
        }
    }

    public int pop(Pila p) {

        if (p.nElementos == 0) {
            System.out.println("La pila está vacía.");
        }
        elemento = p.array[p.nElementos];           //Elemento toma el valor del ultimo elemento de la pila
        p.nElementos = (p.nElementos - 1);          //Se reduce en 1 el tamaño del array(pila) 
        return elemento;
    }

    public int top(Pila p) {

        int elemento = 0;
        
        if (p.nElementos == 0) {
            System.out.println("La pila está vacía.");
        } else {
            elemento = p.array[p.nElementos];
        }
        
        return elemento;
    }

    public boolean empty(Pila p) {

        boolean empty = false;

        if (p.nElementos == 0) {
            empty = true;
        }

        return empty;

    }

    public int length(Pila p) {

        int lenght;

        return lenght = (p.nElementos);
    }

}
