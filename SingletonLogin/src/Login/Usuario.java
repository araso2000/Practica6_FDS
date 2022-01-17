package Login;

import java.util.Objects;

public class Usuario {
    private String nombre;
    private String contraseña;
    public Usuario(String Nom, String pass){
        this.nombre=Nom;
        this.contraseña=pass;
    }
    public String getNombre(){
        return this.nombre;
    }
    public String getPass(){
        return this.contraseña;
    }
    @Override
    public String toString(){
        return("Nombre: "+nombre+" Contraseña: "+contraseña);
    }
    @Override
    public boolean equals(Object o){
        return(this.getNombre().equals(((Usuario) o).getNombre()) && this.getPass().equals(((Usuario) o).getPass()));
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 61 * hash + Objects.hashCode(this.nombre);
        return hash;
    }
}
