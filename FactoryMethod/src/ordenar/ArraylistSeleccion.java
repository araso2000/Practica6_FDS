package ordenar;

import java.util.ArrayList;
import java.util.List;

public class ArraylistSeleccion implements Ordenacion{
    
    List<Integer> arraylist = new ArrayList<Integer>();
    
    public ArraylistSeleccion(ArrayList<Integer> arraylist){
        this.arraylist=arraylist;
    }

    @Override
    public void ordena() {
        for (int i = 0; i < this.arraylist.size()-1; i++){ 
            int minimo = i; 
            for (int j = i+1; j < this.arraylist.size(); j++){
                if (this.arraylist.get(j) < this.arraylist.get(minimo)){ 
                    minimo = j; 
                }
                int temp = this.arraylist.get(minimo); 
                this.arraylist.add(minimo,this.arraylist.get(i));
                this.arraylist.add(i,temp);
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
