package todoslostadsaplicables;

/**
 *
 * @author Emi2p
 */
public class Lista {

    Nodo primero = null;

    void insert(Lista l, int dato) {

        Nodo nuevo = new Nodo();
        nuevo.dato = dato;
        

        //Si la lista esta vacia, el primer elemento de la lista apunta al nuevo nodo
        if (l.primero == null) {                                                                //  if (l.primero == null) {  //
            l.primero = nuevo;                                                                  //          l.primero = nuevo;
            //  else {
            //Sino, el nuevo nodo apunta al primer elemento de la lista y                       //          nuevo.siguiente = l.primero;
            //pasa a ser el primer elemento de la lista                                         //          l.primero = nuevo;                                                        

        } else {

            //Utilizo dos variables auxiliares para recorrer la lista y 
            //mantener los punteros hacia el nodo actual y el anterior
            nuevo.siguiente = l.primero;
            l.primero = nuevo;
        }
    }

    void insertar(Lista l, int dato) {

        Nodo nuevo = new Nodo();
        nuevo.dato = dato;

        if (l.primero == null) {            //primero es el nodo creado al principio
            l.primero = nuevo;              //Primero se inicializa, primer nodo de la lista

        } else {

            nuevo.siguiente = l.primero;
            l.primero = nuevo;
        }
    }

    static void insertarElementoAlFinal(Lista l, int dato) {
        Nodo nuevo = new Nodo();
        nuevo.dato = dato;

        //Si la lista esta vacia, el primero elemento de la lista es el nodo nuevo
        if (l.primero == null) {
            l.primero = nuevo;
        } else {
            //Sino, recorro la lista hasta llegar al ultimo elemento
            Nodo actual = l.primero;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            //El siguiente del ultimo elemento de la lista es ahora el nuevo nodo
            actual.siguiente = nuevo;
        }
    }

    void mostrarLista(Lista l) {

        Nodo actual = l.primero;
        if (l.primero == null) {
            System.out.println("La lista esta vacia");
        } else {

            System.out.println(actual.dato);
            while (actual.siguiente != null) {
                actual = actual.siguiente;
                System.out.println(actual.dato);
            }
        }

    }

    void delete(Lista l, int numero) {

        boolean encontrado = false;

        if (l.primero == null) {
            System.out.println("La lista está vacía.");
        } else {

            Nodo anterior = l.primero;
            Nodo actual = anterior.siguiente;

            while ((actual != null) && !encontrado) {
                if ((actual.dato == numero)) {
                    encontrado = true;
                } else {
                    anterior = actual;
                    actual = actual.siguiente;
                }

                if (encontrado) {
                    anterior.siguiente = actual.siguiente;
                    System.out.println("Se eliminó el número " + numero + " con éxito");
                } else {
                    System.out.println("ERROR, no se encontró el elemento en la lista.");
                }

            }
        }
    }

    public boolean empty(Lista l) {

        boolean valorEmpty;

        if (l.primero == null) {
            valorEmpty = true;

        } else {
            valorEmpty = false;
        }

        return valorEmpty;
    }

    public void top(Lista l) {

//        Nodo actual = l.primero;
//        if (l.primero == null) {
//            System.out.println("La lista esta vacia");
//        } else {
//            
//            System.out.println("TOPE:" + actual.dato);
//        }
    }

    public void move(Lista l) {

    }

    public void bottom(Lista l) {

    }
}
