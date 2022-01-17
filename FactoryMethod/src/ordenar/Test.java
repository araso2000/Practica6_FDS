package ordenar;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int opt = -1;
        
        while(opt!=0){
            System.out.println("1.Crear ARRAY \t 2.Crear ARRAYLIST \t 0.Salir");
            opt=scan.nextInt();
            
            if(opt==1){
                System.out.println("Introduzca tamaño del ARRAY: ");
                int tam = scan.nextInt();
                System.out.println("Introduzca elementos:");
                int[] array = new int[tam];
                
                for(int ii=0;ii<tam;ii++){
                    System.out.println("Elemento " + (ii+1) + ": ");
                    array[ii]=scan.nextInt();
                }
                
                System.out.println("Ordenar por: 1.BURBUJA \t 2.SELECCION");
                int bool = scan.nextInt();
                
                boolean temp;
                if(bool==1){
                    temp=true;
                }else{
                    temp=false;
                }
                
                Fabrica fabrica = new FabricaArray(temp,array);
                
                int opt1=-1;
                while(opt1!=0){
                    System.out.println("1.Imprimir \t 2.Ordenar \t 0.Salir");
                    opt1=scan.nextInt();
                    if(opt1==1){
                        fabrica.imprime(temp,array);
                    }else if(opt1==2){
                        fabrica.ordena(temp,array);
                    }
                }
            }else if(opt==2){
                System.out.println("Introduzca tamaño del ARRAYLIST: ");
                int tam = scan.nextInt();
                System.out.println("Introduzca elementos:");
                int[] array = new int[tam];
                
                for(int ii=0;ii<tam;ii++){
                    System.out.println("Elemento " + (ii+1) + ": ");
                    array[ii]=scan.nextInt();
                }
                
                System.out.println("Ordenar por: 1.BURBUJA \t 2.SELECCION");
                int bool = scan.nextInt();
                
                boolean temp;
                if(bool==1){
                    temp=true;
                }else{
                    temp=false;
                }
                
                Fabrica fabrica = new FabricaArraylist(temp,array);
                
                int opt1=-1;
                while(opt1!=0){
                    System.out.println("1.Imprimir \t 2.Ordenar \t 0.Salir");
                    opt1=scan.nextInt();
                    if(opt1==1){
                        fabrica.imprime(temp,array);
                    }else if(opt1==2){
                        fabrica.ordena(temp,array);
                    }
                }    
            }
        }
    } 
}