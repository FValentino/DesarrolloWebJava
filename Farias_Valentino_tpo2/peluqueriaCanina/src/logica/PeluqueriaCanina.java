package logica;

import igu.Interfaz;

public class PeluqueriaCanina {

    public static void main(String[] args) {
     
        ControladorLogica controlador = new ControladorLogica();
        
        Interfaz interfaz = new Interfaz(controlador);
        
        interfaz.setVisible(true);
        interfaz.setLocationRelativeTo(null);
        
    }
}
