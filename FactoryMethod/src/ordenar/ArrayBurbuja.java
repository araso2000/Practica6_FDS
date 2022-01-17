package ordenar;

public class ArrayBurbuja implements Ordenacion{
    
    private int[] array;
    
    public ArrayBurbuja(int[] array){
        this.array=array;
    }

    @Override
    public void ordena() {
        for (int i = 0; i < this.array.length-1; i++){
            for (int j = 0; j < this.array.length-i-1; j++){
                if (this.array[j] > this.array[j+1]){ 
                    int temp = this.array[j]; 
                    this.array[j] = this.array[j+1]; 
                    this.array[j+1] = temp; 
                } 
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
