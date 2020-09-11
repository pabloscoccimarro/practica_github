/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practicagit.entidades;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
/**
 * 
 * @author Gisele Galaburri <gisele.galaburri89 at gmail.com>
 */
@Entity
public class Proveedor implements Serializable {

    @Id
    @GeneratedValue
    private String id;
    
    private String telefono;
    private String nit;
    private String direccion;
    private Integer cantidad;
    private String nombre;
    
    @OneToMany(mappedBy = "producto" )
    private List<Producto> productos;

    public Proveedor() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Producto> getProducto() {
        return productos;
    }

    public void setProducto(List<Producto> producto) {
        this.productos = producto;
    }

    @Override
    public String toString() {
        return "Proveedor{" + "id=" + id + ", telefono=" + telefono + ", nit=" + nit + ", direccion=" + direccion + ", cantidad=" + cantidad + ", nombre=" + nombre + ", producto=" + productos + '}';
    }
}
