// TDALista.java
// Interfaz pública del Tipo de Dato Abstracto Lista
package miPrincipal;

import java.util.Iterator;

public interface TDALista<T> {
    public  T removeFirst() throws ListaVaciaException;     // Elimina el primer elemento de la lista
    public  T removeLast() throws ListaVaciaException;      // Elimina el último elemento de la lista
    public  T remove( T elemento );                         // Elimina el elemento especificado de la lista
    public  T first() throws ListaVaciaException;           // Consulta el primer elemento de la lista
    public  T last() throws ListaVaciaException;            // Consulta el último elemento de la lista
    public  boolean contains(T elemento );                  // ¿La lista contiene un elemento especifico?
    public  boolean isEmpty();                              // ¿La lista está vacía?
    public  int size();                                     // El total de elementos dentro de la lista
    public  Iterator<T> iterator();                         // Para recorrer los elementos de la lista
    public  String toString();                              // Convertir el TDALista a una representación de cadena
}
