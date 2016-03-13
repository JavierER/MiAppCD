package miapp;

/**
 * La clase usuario contiene datos sobre cada usuario
 * @author Javii
 */
public class Usuario {
    String nommbre,pass;
    int id;

    public Usuario() {
    }

    public Usuario(String nommbre, String pass, int id) {
        this.nommbre = nommbre;
        this.pass = pass;
        this.id = id;
    }

    public String getNommbre() {
        return nommbre;
    }

    public void setNommbre(String nommbre) {
        this.nommbre = nommbre;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
}
