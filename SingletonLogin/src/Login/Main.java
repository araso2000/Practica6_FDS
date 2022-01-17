package Login;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean w=false;
        while(w==false){
        System.out.println("Bienvenido, que desea hacer (1) bateria de pruebas, o (2) Entrar al sistema Login, (3) Salir \n");
        String let;
        String pa;
        Scanner datos = new Scanner(System.in);
        int a=datos.nextInt();
        switch(a){
            case 1:
        System.out.println("Con Singleton \n");
        ConSingleton p1;
        System.out.println("Usuario 1 \n");
        p1 = ConSingleton.getInstance();
        p1.AñadirUsuario("pedro", "asdf");
        p1.imprimir();
        System.out.println("\n");
        
        System.out.println("Usuario 2 \n");
        p1 = ConSingleton.getInstance();
        p1.AñadirUsuario("Pablo", "asdf");
        p1.imprimir();
        System.out.println("\n");
        
        System.out.println("No añadir nada \n");
        p1 = ConSingleton.getInstance();
        p1.imprimir();
        System.out.println("\n");
        
        System.out.println("No añadir nada \n");
        p1 = ConSingleton.getInstance();
        p1.imprimir();
        System.out.println("\n");
        
        System.out.println("Con P2 \n");
        System.out.println("Añadir Pedro P2 \n");
        ConSingleton p2;
        p2 = ConSingleton.getInstance();
        p2.AñadirUsuario("pedro", "asdf");
        p2.imprimir();
        System.out.println("\n");
        
        System.out.println("Ver P2 sin nada \n");
        p2 = ConSingleton.getInstance();
        p2.imprimir();
        System.out.println("\n");
        
        System.out.println("Sin singleton \n");
        
        System.out.println("Añadir Paco P3 \n");
        SinSigleton p3 = new SinSigleton();
        p3.AñadirUsuario("Paco", "awerf");
        p3.imprimir();
        System.out.println("\n");
        
        System.out.println("Añadir Pepe P3 \n");
        p3.AñadirUsuario("pepe", "awerf");
        p3.imprimir();
        System.out.println("\n");
        
        
        System.out.println("Añadir pepe P3 \n");
        p3.AñadirUsuario("pepe", "awerf");
        p3.imprimir();
        System.out.println("\n");
        
        SinSigleton p4 = new SinSigleton();
        System.out.println("Añadir pepe P4 \n");
        p4.AñadirUsuario("pepe", "awerf");
        p4.imprimir();
        System.out.println("\n");
        
        System.out.println("Añadir pepe P4 \n");
        p4.AñadirUsuario("pedro", "awerf");
        p4.imprimir();
        System.out.println("\n");
        break;
        
            case 2:
                System.out.println("¿Quiere Registrarse (1), o quiere iniciar sesión(2)?");
               a=datos.nextInt();
               
               switch(a){
                   
                   case 1:
                       Scanner v = new Scanner(System.in);
                       System.out.println("Usuario:");
                       let = v.nextLine();
                       System.out.println("Contraseña:");
                       pa = v.nextLine();
                       ConSingleton p9;
                        
                        p9 = ConSingleton.getInstance();
                        p9.AñadirUsuario(let, pa);
                        break;
                   case 2:
                       
                       Scanner x = new Scanner(System.in);
                       System.out.println("Usuario:");
                       let = x.nextLine();
                       System.out.println("Contraseña:");
                       pa = x.nextLine();
                       ConSingleton p8;
                       p8 = ConSingleton.getInstance();
                       p8.IniciarSesion(let, pa);
                       break;
               }
               break;
            case 3:
                w = true;
                break;
        }
        
    }
  }
    
}
