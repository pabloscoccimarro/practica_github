/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practicagit.entidades;

import javax.persistence.Entity;
import javax.persistence.Id;
/**
 * 
 * @author Gisele Galaburri <gisele.galaburri89 at gmail.com>
 */

@Entity
public class Almacen {

    @Id
    private String id_empresa;
    private String nombre_empresa;
    private String direccion;

    public Almacen() {
    }

    public String getNombre_empresa() {
        return nombre_empresa;
    }

    public void setNombre_empresa(String nombre_empresa) {
        this.nombre_empresa = nombre_empresa;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Almacen{" + "id_empresa=" + id_empresa + ", nombre_empresa=" + nombre_empresa + ", direccion=" + direccion + '}';
    }
    
}
