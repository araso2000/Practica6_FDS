package Login;

import java.util.ArrayList;

public class ConSingleton {
    
    private ArrayList <Usuario> usuarios;
    private static ConSingleton instancia;
    
    private ConSingleton(){
        usuarios = new ArrayList<Usuario>();
    }
    
    public static ConSingleton getInstance() { 
       if (instancia == null){
            instancia = new ConSingleton();
       }
       return instancia;
    }
    
    public void AñadirUsuario(String nom, String pass){
        Usuario a = new Usuario(nom,pass);
        boolean b=true;
        for(Usuario c : usuarios){
            if(c.getNombre().equals(a.getNombre())){
                b=false;
                System.out.println ("Usuario ya existe");
            }
        }
        if(b==true){
            usuarios.add(a);
            System.out.println ("Usuario añadido");
        }
    }
    
    public void IniciarSesion(String nom, String pass){
        Usuario a = new Usuario(nom,pass);
        if(usuarios.isEmpty())System.out.println ("Usuario no registrado");
        for(Usuario c : usuarios){
            if(c.equals(a)){
                System.out.println ("Bienvenido: "+a.toString());
               }else{
                   System.out.println ("Usuario no registrado");
               }
           }
    }
    
    public void imprimir(){
       for(Usuario c : usuarios){
            System.out.println (c.toString());
        }
    } 
}
