package logica;

import persistencia.ControladorPersistencia;

public class ControladorLogica {
    ControladorPersistencia controlador = new ControladorPersistencia();
    
    //metodos para dar alta
    //Capturar datos del cliente
    public void agregarCliente(String nom, String raza, String color, String alergico, String atencion, String obser){
        
        Cliente cliente = new Cliente ();
        cliente.setNombre(nom);
        cliente.setRaza(raza);
        cliente.setColor(color);
        cliente.setAlergico(alergico);
        cliente.setAt_especial(atencion);
        cliente.setObservaciones(obser);
        
        agregarCliente(cliente);
    }
    //Dar alta
    private void agregarCliente(Cliente cliente){
        controlador.ingresarCliente(cliente);
    }
    
    //capturar datos del duenio
    public void agregarDuenio(String duenioNom, String duenioTel){
        
        Duenio duenio = new Duenio();
        duenio.setNombre(duenioNom);
        duenio.setTel(duenioTel);
        
        agregarDuenio(duenio);
    }
    //Dar alta
    private void agregarDuenio(Duenio duenio){
        controlador.ingresarDuenio(duenio);
    }
}
