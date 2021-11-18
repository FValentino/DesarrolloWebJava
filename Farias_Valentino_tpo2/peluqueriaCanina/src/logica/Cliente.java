package logica;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cliente implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int nro_cliente;
    @Basic
    private String nombre;
    private String raza;
    private String color;
    private String alergico;
    private String at_especial;
    private String observaciones;

    
    //Contructores
    
    public Cliente() {
    }

    public Cliente(int nro_cliente, String nombre, String raza, String color, String alergico, String at_especial, String observaciones) {
        this.nro_cliente = nro_cliente;
        this.nombre = nombre;
        this.raza = raza;
        this.color = color;
        this.alergico = alergico;
        this.at_especial = at_especial;
        this.observaciones = observaciones;
    }
    
    //Setters
    
    public void setNro_cliente(int nro_cliente) {
        this.nro_cliente = nro_cliente;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setAlergico(String alergico) {
        this.alergico = alergico;
    }

    public void setAt_especial(String at_especial) {
        this.at_especial = at_especial;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    
    
    //Getters
    
    public int getNro_cliente() {
        return nro_cliente;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRaza() {
        return raza;
    }

    public String getColor() {
        return color;
    }

    public String getAlergico() {
        return alergico;
    }

    public String getAt_especial() {
        return at_especial;
    }

    public String getObservaciones() {
        return observaciones;
    }
    
    
}
