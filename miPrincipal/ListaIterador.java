// ListaIterador.java
// Iterador de una Lista Ligada
package miPrincipal;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ListaIterador<T> implements Iterator<T>{
    // Atributos
    private NodoLineal<T> actual;       // Nodo actual
    private int cuenta;                 // Total de elementos de la colección

    // Constructor
    public ListaIterador( NodoLineal<T> inicio, int tam )
    {
        actual = inicio;
        cuenta = tam;
    }

    public boolean hasNext()
    {
        return actual != null;
    }

    // El método next, regresa el elemento actual y avanza al siguiente elemento
    public T next()
    {
        if ( !hasNext() )
            throw new NoSuchElementException("Error. No existe un elemento");

        T elemento = actual.getElemento();

        actual = actual.getSiguiente();

        return elemento;
    }

    // El método remove no está soportado
    public void remove() throws UnsupportedOperationException
    {
        throw new UnsupportedOperationException();
    }
}
