package Login;

import java.util.ArrayList;

public class SinSigleton {
    private ArrayList <Usuario> usuarios;
    
    public SinSigleton(){
        usuarios = new ArrayList<Usuario>();
    }
    
    public void AñadirUsuario(String nom, String pass){
        
           Usuario a = new Usuario(nom,pass);
           boolean b=true;
           for(Usuario c : usuarios){
               if(c.equals(a)){
                   b=false;
                   System.out.println ("Usuario ya existe");
               }
           }
           if(b==true){
               usuarios.add(a);
               System.out.println ("Usuario añadido");
           }
    
    }
    
    public void imprimir(){
       for(Usuario c : usuarios){
            System.out.println (c.toString());
        }
    }
}
