package ordenar;

public class FabricaArray extends Fabrica{    
    
    private boolean burbuja;
    private int[] array;
    
    public FabricaArray(boolean burbuja,int[] array){
        this.burbuja=burbuja;
        this.array=array;
    }
    
    Ordenacion orden = crearInstancias(this.burbuja,this.array);
    
    @Override
    public Ordenacion crearInstancias(boolean burbuja, int[] array) {
        Ordenacion array1;
        if(burbuja){
            array1 = new ArrayBurbuja(array);
        }else{
            array1 = new ArraySeleccion(array);
        }
        return(array1);
    }
}