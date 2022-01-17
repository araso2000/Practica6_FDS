package ordenar;

public abstract class Fabrica {
        
    public Ordenacion ordena(boolean burbuja,int[] array){
        Ordenacion orden = crearInstancias(burbuja,array);
        orden.ordena();
        return orden;
    }
    
    public Ordenacion imprime(boolean burbuja,int[] array){
        Ordenacion orden = crearInstancias(burbuja,array);
        orden.imprime();
        return orden;
    }
    
    public abstract Ordenacion crearInstancias(boolean burbuja,int[] array);
}
