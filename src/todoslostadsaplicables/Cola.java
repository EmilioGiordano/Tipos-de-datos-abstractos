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
public class Cola {

    NodoQueue primero = null;
    NodoQueue top;
    NodoQueue bottom;
    int NElementosTotales = 0;

    void create(Cola c)     {

    }

    void push(Cola c, int dato) {

        NodoQueue nuevo = new NodoQueue();
        nuevo.dato = dato;

        if (c.empty(c)) {
            c.primero = nuevo;

            c.bottom = c.primero;
            //nuevo.nElemento = 1;
            NElementosTotales++;

        } else {

            nuevo.siguiente = c.primero;
            c.primero = nuevo;

            c.top = c.primero;
            //nuevo.nElemento = (nuevo.nElemento + 1);
            NElementosTotales++;
        }
    }

    void pop(Cola c, int dato) {

    }

    int top(Cola c) {

        int valorTop;
        valorTop = c.top.dato;

        return valorTop;

    }

    int bottom(Cola c) {

        int valorBottom;
        valorBottom = c.bottom.dato;

        return valorBottom;
    }

    boolean empty(Cola c) {

        boolean empty = false;

        if (c.NElementosTotales == 0) {
            empty = true;
        }

        return empty;

    }

    int length(Cola c) {

        return c.NElementosTotales;
    }

    void printQueue(Cola c) {

        NodoQueue actual = c.primero;
        if (c.primero == null) {
            System.out.println("La cola esta vacia");
        } else {

            System.out.println(actual.dato);
            while (actual.siguiente != null) {
                actual = actual.siguiente;
                System.out.println(actual.dato);
            }
        }

    }

}
