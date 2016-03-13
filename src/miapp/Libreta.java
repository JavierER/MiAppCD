package miapp;

/**
 * This class is used to search free memory spaces and to add an object to this. 
 * Also the name , ID and what free with constructor, getters and setters are instantiated.
 * @author Javii
 * @version 2.1
 */
public class Libreta {
     private String nombre, dni;
    private int libre = cualLibre();
    Contacto[] arrayContactos = new Contacto[3];

    public Libreta() {
        nombre = dni = "";
    }
    /**
     * Description: a constructor which just specify variables.
     * @param aux_nombre Owner.
     * @param aux_dni Owner Identificator.
     */

    public Libreta(String aux_nombre, String aux_dni) {
        this.nombre = aux_nombre;
        this.dni = aux_dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }
/**
 * Description: a method used to add contacts to notebook.
 */
    public void engadir() {
        libre = cualLibre();
        if (libre > 0) {
            System.out.println("Introduzca nombre");
            arrayContactos[libre].setNombre(nombre);
        }
    }

    /**
     * Description: a method used to search which space is empty.
     * @return -1
     */
    public int cualLibre() {
        for (int libre = 0; libre < arrayContactos.length; libre++) {
            if (arrayContactos[libre].getNombre().equals("")) {
                System.out.println("Hay hueco");
                return libre;
            } else if (libre == arrayContactos.length) {
            }
        }
        return -1;
    }
}

