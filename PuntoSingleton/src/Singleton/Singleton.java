package Singleton;

public class Singleton {

   
    public static void main(String[] args) {
        
        System.out.println ("Sin Singleton \n");
        System.out.println ("Creamos P1");
        PuntoSin p1 = new PuntoSin();
        p1.set(2, 2);
         System.out.println (p1.getInfo());
         
         System.out.println ("Creamos nuevo P1");
        p1 = new PuntoSin();
        p1.set(3, 2);
         System.out.println (p1.getInfo());
        
         System.out.println ("Creamos nuevo P1");
        p1 = new PuntoSin();
        p1.set(5, 5);
         System.out.println (p1.getInfo());
         
         System.out.println ("Creamos nuevo P1");
        p1 = new PuntoSin();
        p1.set(4, 8);
         System.out.println (p1.getInfo());
         
        System.out.println ("Creamos P5 y vemos que esta vacio");
        PuntoSin p5 = new PuntoSin();
        System.out.println (p5.getInfo());
        System.out.println ("Añadimos algo a P5");
        p5 = new PuntoSin();
        p5.set(9, 9);
        System.out.println (p5.getInfo());
         
        System.out.println ("\n");
        System.out.println ("Con Singleton \n");
        System.out.println ("Creamos P2");
        PuntoSingleton p2;
        p2 = PuntoSingleton.getInstance();
        p2.set(2,7);
         System.out.println (p2.getInfo());
        
         System.out.println ("Cambiamos el punto P2");
        p2 = PuntoSingleton.getInstance();
        p2.set(4,7);
         System.out.println (p2.getInfo());
        
         
        p2 = PuntoSingleton.getInstance();
         System.out.println (p2.getInfo());
         
        System.out.println ("Creamos nuevo P3 y vemos que tenemos la misma instancia y punto que P2");
        PuntoSingleton p3;
        p3 = PuntoSingleton.getInstance();
         System.out.println (p3.getInfo());
         
        System.out.println ("Creamos nuevo P4 y vemos que tenemos la misma instancia y punto que P2 y P3");
        PuntoSingleton p4;
        p4 = PuntoSingleton.getInstance();
         System.out.println (p4.getInfo());
         
        
         
    }
    
}
