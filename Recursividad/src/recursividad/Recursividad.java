
package recursividad;

/**
 *
 * @author fvp
 */
public class Recursividad {

    /**
     * @param args the command line arguments
     * Recursividad en Java
     * Es la tecnica que permite que un bloque de instrucciones se ejecute "n" veces.
     * 
     * Logramos las estructuras repetitivas en bloques que podemos ejecutar varias veces.
     * 
     * En Java, los metodos pueden hacer un llamado a ellos mismos, esto posibilita que el metodo 
     * se invoque a El mismo las veces necesite ejecutarse.
     */
    
    public void Imprimir(int x){ //Metodo Recursivo* que muestra numeros consecutivos menores a 5
        if(x <= 5){
            System.out.print(x + "  ");  //mostrar por pantalla y concatena espacio
            Imprimir(x + 1); //Llama nuevamente Metodo Recursivo* (Accion Recursiva)
        }
    } //OUT> 0  1  2  3  4  5  
    
}//>>>TECLADO>  0
