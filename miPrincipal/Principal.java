package miPrincipal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner( System.in );

        System.out.println( "Procesar Lista" );
        System.out.println( "==============" );
        System.out.println();

        // Solicitar el numero de elementos
        System.out.print( "Proporcione el numero de elementos:" );
        int n=0;

        // Crear arreglo de n elementos enteros
        int[] elementos = new int[ n ];

        // Ciclo para solicitar los elementos
        for ( int i = 0; i < n; i++ )
        {
        }

        // Crear el objeto ProcesarLista
        ProcesarLista pl = new ProcesarLista(elementos);

        // Mostrar resultados:
        System.out.println( "La suma es:" + pl.sumar() );
        
        entrada.close();
    }
}
