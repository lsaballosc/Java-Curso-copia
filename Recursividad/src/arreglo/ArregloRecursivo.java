// Vamos a  recorrer un arreglo con recursividad
package arreglo;

/**
 *
 * @author fvp
 */
public class ArregloRecursivo {
    public static void main(String[] args){
        int[] array={1,2,3,4,5};
        int busca=3;
        
        int Posicion;
        
        ArrayRecur Objeto = new ArrayRecur();
        Objeto.mostrarArrayRecur(array,0);
//        Posicion = Objeto.buscarNumero(array,0,busca);
//        System.out.print("La posicion de numero " + busca +" es el index:  "+ Posicion);
        
        
    }
}
