// NodoLineal.java
// Clase para implementar los nodos de una lista ligada
package miPrincipal;

public class NodoLineal<T> {
    // Atributos
    private T elemento;
    private NodoLineal<T> siguiente;

    // Constructores
    public NodoLineal( T elemento )
    {
        this.elemento = elemento;
        siguiente = null;
    }

    public NodoLineal()
    {
        this( null );
    }

    // Métodos set/get
    public void setElemento( T elemento )
    {
        this.elemento = elemento;
    }

    public void setSiguiente( NodoLineal<T> siguiente )
    {
        this.siguiente = siguiente;
    }

    public T getElemento()
    {
        return elemento;
    }

    public NodoLineal<T> getSiguiente()
    {
        return siguiente;
    }
}
