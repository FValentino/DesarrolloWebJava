package persistencia;

import javax.swing.JOptionPane;
import logica.Cliente;
import logica.Duenio;

public class ControladorPersistencia {
    
    //Separe en cliente y dueño pq me parecio que para el futuro es necesaria la distincion entre ambos
    ClienteJpaController clienteJpa = new ClienteJpaController();
    DuenioJpaController  duenioJpa  = new DuenioJpaController ();
    
    //Metodos para dar alta al cliente y al dueño
    public void ingresarCliente(Cliente cliente){
    
        try{
            clienteJpa.create(cliente);
        }
        catch (Exception ex){
            /*Aca solo hay un mensaje de error, porque si no se puede agregar la mascota, el programa se interrumpe 
            y tampoco se agrega al dueño*/
            JOptionPane.showMessageDialog(null, "No se pudo agregar el cliente");
        }
    }
    
    public void ingresarDuenio(Duenio duenio){
        
        try{
            duenioJpa.create(duenio);
            //Si se agrega al dueño es pq el programa corrio exitosamente entonces se agrego por completo al cliente
            JOptionPane.showMessageDialog(null, "Se agrego el cliente satisfactoriamente");
        }
        catch (Exception ex){
            System.out.println("No se pudo agregar el dueño");;
        }
    }
    
}
