package arreglo;
/**
 *
 * @author fvp
 */
public class ArrayRecur {
    public void mostrarArrayRecur(int[] array, int index){
//        1era forma/
        if(index != array.length){
            System.out.println(array[index]);
            mostrarArrayRecur(array,index+1);
        }

//        2da forma
//        if(index == (array.length-1)){
//            System.out.println(array[index]);
//        }else{
//            System.out.println(array[index]);
//            mostrarArrayRecur(array, index+1);
//        }
    }
    
    public int buscarNumero(int[] array, int index, int numero){
        int pos;
        if(array[index]==numero){
            return index;
        }else {
            return pos = buscarNumero(array, index+1, numero);
        }
    }
}
