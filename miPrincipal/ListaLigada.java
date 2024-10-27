// ListaLigada.java
// Implementación de métodos comunes a las listas ligadas
package miPrincipal;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ListaLigada<T> implements TDALista<T>{
    // Atributos
    protected NodoLineal<T> inicio;         // Inicio de la lista ligada
    protected int cuenta;                   // Contador de elementos en la lista
    
    // Constructor
    public ListaLigada()
    {
        inicio = null;
        cuenta = 0;
    }

    public T removeFirst() throws ListaVaciaException
    {
        // Validar si la lita está vacía
        if ( isEmpty() )
            throw new ListaVaciaException( "Error. La lista está vacía" );

        // Obtener el elemento de la primer posición para regresarlo
        T elemento = inicio.getElemento();

        // Hacer que inicio apunte al siguiente del inicio
        inicio = inicio.getSiguiente();

        // Restar 1 a cuenta
        cuenta --;

        // Regresar el primer elemento
        return elemento;
    }

    public T removeLast() throws ListaVaciaException
    {
        // Validar si la lista está vacía
        if ( isEmpty() )
            throw new ListaVaciaException( "Error. La lista está vacía" );

        // Validar si la lista sólo tiene un elemento
        if ( size() == 1 )
            return removeFirst();

        // Encontrar el último elemento de la lista
        NodoLineal<T> actual = inicio;
        NodoLineal<T> previo = null;

        while ( actual.getSiguiente() != null )
        {
            previo = actual;
            actual = actual.getSiguiente();
        }

        // Actual es el último
        T elemento = actual.getElemento();

        // Restar uno a cuenta
        cuenta --;

        // Eliminar el último
        previo.setSiguiente( null );

        // Regresar el último
        return elemento;
    }

    public T remove( T elemento )
    {
        // Validar que el elemento a eliminar esté contenido en la lista
        if ( !contains(elemento) )
            throw new NoSuchElementException( "Error. El elemento " + elemento + " no existe en la lista");

        // Validar si el elemento a elimninar es el primero
        try {
            if ( elemento.equals( first() ) )
                return removeFirst();
        } catch (ListaVaciaException e) {
            // No hacer nada, porque la lista no está vacía
        }
        
        // Buscar elemento a eliminar
        NodoLineal<T> actual = inicio;
        NodoLineal<T> previo = null;
        while ( !elemento.equals( actual.getElemento() ) )
        {
            previo = actual;
            actual = actual.getSiguiente();
        }

        // Eliminar nodo actual
        T elem = actual.getElemento();
        previo.setSiguiente( actual.getSiguiente() );
        cuenta --;          // Disminuir en 1 el total de elementos de la lista
        return elem;
    }

    public T first() throws ListaVaciaException
    {
        // Validar si la lita está vacía
        if ( isEmpty() )
            throw new ListaVaciaException( "Error. La lista está vacía" );

        // Obtener el elemento de la primer posición para regresarlo
        T elemento = inicio.getElemento();

        // Regresar el primer elemento
        return elemento;
    }

    public T last() throws ListaVaciaException
    {
        // Validar si la lista está vacía
        if ( isEmpty() )
            throw new ListaVaciaException( "Error. La lista está vacía" );

        // Validar si la lista sólo tiene un elemento
        if ( size() == 1 )
            return first();

        // Encontrar el último elemento de la lista
        NodoLineal<T> actual = inicio;

        while ( actual.getSiguiente() != null )
            actual = actual.getSiguiente();

        // Actual es el último
        T elemento = actual.getElemento();

        // Regresar el último
        return elemento;
    }

    public boolean contains( T elemento )
    {
        // Validar si la lista está vacía
        if ( isEmpty() )
            return false;
        
        boolean encontrado = false;

        // Iterator para recorrer la lista
        Iterator<T> iterador = iterator();

        while ( iterador.hasNext() )
        {
            T elem = iterador.next();
            if ( elemento.equals( elem ) )
            {
                encontrado = true;
                break;
            }
        }

        return encontrado;
    }

    public boolean isEmpty()
    {
        return size() == 0;
    }
    
    public int size()
    {
        return cuenta;
    }

    public Iterator<T> iterator()
    {
        return new ListaIterador<T>( inicio, size() );
    }

    public String toString()
    {
        String resultado = "";

        Iterator<T> iterador = iterator();

        while ( iterador.hasNext() )
        {
            T elemento = iterador.next();
            resultado = resultado + elemento + "\n";
        }

        return resultado;
    }
}








