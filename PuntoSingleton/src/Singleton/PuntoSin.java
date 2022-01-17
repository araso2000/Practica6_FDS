package Singleton;

   public class PuntoSin{
   private int x,y;
   String info;
   
   public PuntoSin(){
   }
  
   public void set(int a , int b){
       x=a;
       y=b;
       info = "X: "+x+" Y:"+y;
   }
    
    public String getInfo () { 
        return info;
    }
        
}