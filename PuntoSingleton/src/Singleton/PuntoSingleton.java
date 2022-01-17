package Singleton;

   public class PuntoSingleton{
   private int x,y;
   String info;
   private static PuntoSingleton uniqueInstance;
   
    private PuntoSingleton(){
       //Para login, inicializar el array de usuarios aqui.
    }
   public static PuntoSingleton getInstance() { 
        if (uniqueInstance == null){
            uniqueInstance = new PuntoSingleton();
        }
        return uniqueInstance;
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