// ListaVaciaException.java
// Excepción personalizada para indicar que
// la Lista está vacía
package miPrincipal;

public class ListaVaciaException extends Exception{
    public ListaVaciaException(String mensaje)
    {
        super( mensaje );
    }
}
