package miapp;

import javax.swing.JOptionPane;

/**
 *
 * @author Javii
 */
public class Grupo {
     Contacto propietario = new Contacto();
    Contacto [] arrayContacto = new Contacto [10];
    //for(int i=0;i<arrayContactos.length;i++){
        //arrayContactos[i].setNombre("");
    int libre= cualLibre();
    
    public void engadir (){
    
     if(libre<0){
         JOptionPane.showMessageDialog(null,"No hay espacio.");
     } else {
         PedirDatos();
     }   
    }
    
    public int cualLibre(){
    for(int i=0;i<arrayContacto.length;i++){      
    if(arrayContacto[i].getNombre().equals("")){
        return i;
    }
    }
        return -1;
}
 public Contacto PedirDatos(){
     String aux_nombre = JOptionPane.showInputDialog("Nombre:");
     String aux_apellido = JOptionPane.showInputDialog("Apellido:");
     String aux_telefono = JOptionPane.showInputDialog("Telefono:");
     String aux_email = JOptionPane.showInputDialog("Email:");
     Contacto contacto = new Contacto();
        return contacto;
  
 }
public Grupo() {
         for(int i=0;i<arrayContacto.length;i++){
             arrayContacto[i].setNombre("");
         }
         } 
 
 public void listar(){

     for(int i=0;i<arrayContacto.length;i++){
         if(arrayContacto[i]!=null){
             JOptionPane.showMessageDialog(null,"Contactos que ya estan completos :"+arrayContacto[i].toString());
          }
          }
          }
          }