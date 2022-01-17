package ordenar;

import java.util.ArrayList;

public class ArraySeleccion implements Ordenacion{
    
    private int[] array;
    
    public ArraySeleccion(int[] array){
        this.array=array;
    }

    @Override
    public void ordena() {
        for (int i = 0; i < this.array.length-1; i++){ 
            int minimo = i; 
            for (int j = i+1; j < this.array.length; j++){
                if (this.array[j] < this.array[minimo]){ 
                    minimo = j; 
                }
                int temp = this.array[minimo]; 
                this.array[minimo] = this.array[i]; 
                this.array[i] = temp; 
            } 
        }
    }

    @Override
    public void imprime() {
        for(int ii=0;ii<this.array.length;ii++){
            System.out.print(this.array[ii] + "\t");
        }
        System.out.println();
    }
}
