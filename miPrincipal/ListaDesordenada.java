// ListaDesordenada.java
// Implementa los diversos métodos add de una lista desordenada
package miPrincipal;

import java.util.NoSuchElementException;

public class ListaDesordenada<T> extends ListaLigada<T> implements TDAListaDesordenada<T> {
    
    public void addToFront( T elemento )
    {
        // Agregar al inicio
        NodoLineal<T> nuevo = new NodoLineal<T>( elemento );
        nuevo.setSiguiente( inicio );
        inicio = nuevo;
        cuenta ++;
    }

    public void addToRear( T elemento )
    {
        // Verificar si la lista está vacía
        if ( isEmpty() )
        {
            addToFront(elemento);
            return;
        }

        // Recorrer la lista hasta encontrar el último elemento
        NodoLineal<T> previo = inicio;
        while ( previo.getSiguiente() != null )
            previo = previo.getSiguiente();

        // El nodo previo es el último nodo
        NodoLineal<T> nuevo = new NodoLineal<T>( elemento );
        previo.setSiguiente( nuevo );
        cuenta ++;
    }

    public void addAfter( T elemento, T elemPrevio )
    {
        // Verificar que el elemento previo exista
        if ( !contains( elemPrevio ) )
            throw new NoSuchElementException();


        // Convertir el elemento de tipo T a tipo Comparable
        @SuppressWarnings("unchecked")
        Comparable<T> temporal = (Comparable<T>) elemPrevio;
        
        // Ciclo para buscar el elemento
        NodoLineal<T> previo = inicio;
        while ( previo != null )
        {
            if ( temporal.compareTo( previo.getElemento() ) == 0  )
                break;

            previo = previo.getSiguiente();
        }

        // Insertar nuevo nodo después del nodo previo
        NodoLineal<T> nuevo = new NodoLineal<T>( elemento );
        nuevo.setSiguiente( previo.getSiguiente() );
        previo.setSiguiente(nuevo);
        cuenta ++;
    }

}
