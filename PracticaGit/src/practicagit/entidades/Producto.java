/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practicagit.entidades;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

/**
 * 
 * @author Gisele Galaburri <gisele.galaburri89 at gmail.com>
 */
@Entity
public class Producto {
    
    @Id    
    private String IDproducto;
    
    private String Nombre;
    private double precio;
    private int cantidad;
    
    @ManyToMany
    private Proveedor proovedor;

    public Producto() {
    }

    public String getIDproducto() {
        return IDproducto;
    }

    public void setIDproducto(String IDproducto) {
        this.IDproducto = IDproducto;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Proveedor getProovedor() {
        return proovedor;
    }

    public void setProovedor(Proveedor proovedor) {
        this.proovedor = proovedor;
    }

    @Override
    public String toString() {
        return "Producto{" + "IDproducto=" + IDproducto + ", Nombre=" + Nombre + ", precio=" + precio + ", cantidad=" + cantidad + ", proovedor=" + proovedor + '}';
    }
    
}
