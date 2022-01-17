package ordenar;

import java.util.ArrayList;
import java.util.List;

public class FabricaArraylist extends Fabrica{
    
    private boolean burbuja;
    private int[] array;
    
    public FabricaArraylist(boolean burbuja,int[] array){
        this.burbuja=burbuja;
        this.array=array;
    }
    
    Ordenacion orden = crearInstancias(this.burbuja,this.array);
    
    @Override
    public Ordenacion crearInstancias(boolean burbuja, int[] array) {
        List<Integer> arraylist = new ArrayList<Integer>();
        for(int ii=0;ii<array.length;ii++){
            arraylist.add(array[ii]);
        }
        Ordenacion array1;
        if(burbuja){
            array1 = new ArraylistBurbuja((ArrayList<Integer>) arraylist);
        }else{
            array1 = new ArraylistSeleccion((ArrayList<Integer>) arraylist);
        }
        return(array1);
    }
}