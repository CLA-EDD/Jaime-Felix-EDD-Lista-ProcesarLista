// TDAListaDesordenada.java
// Tipo de Dato Abstracto de una Lista Desordenada
// Se hereda de la interfaz TDALista
package miPrincipal;

public interface TDAListaDesordenada<T> extends TDALista<T>{
    public void addToFront( T elemento );               // Insertar al inicio de la lista
    public void addToRear( T elemento );                // Insertar al final de la lista
    public void addAfter( T elemento, T elemPrevio );   // Insertar después de un elemento
}
