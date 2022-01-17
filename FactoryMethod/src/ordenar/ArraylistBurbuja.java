package ordenar;

import java.util.ArrayList;
import java.util.List;

public class ArraylistBurbuja implements Ordenacion{
    
    List<Integer> arraylist = new ArrayList<Integer>();
    
    public ArraylistBurbuja(ArrayList<Integer> arraylist){
        this.arraylist=arraylist;
    }

    @Override
    public void ordena() {
        for (int i = 0; i < this.arraylist.size()-1; i++){
            for (int j = 0; j < this.arraylist.size()-i-1; j++){
                if (this.arraylist.get(j) > this.arraylist.get(j+1)){ 
                    int temp = this.arraylist.get(j); 
                    this.arraylist.add(j,this.arraylist.get(j+1));
                    this.arraylist.add(j+1,temp);
                } 
            }
        }
    }

    @Override
    public void imprime() {
        for(int a: arraylist){
            System.out.print(a + "\t");
        }
        System.out.println();
    }
    
}
