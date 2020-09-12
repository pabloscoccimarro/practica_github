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
public class Inventario {

    private Integer numSolicitud;

    public Inventario() {
    }

    public Inventario(Integer numSolicitud) {
        this.numSolicitud = numSolicitud;
    }

    public Integer getNumSolicitud() {
        return numSolicitud;
    }

    public void setNumSolicitud(Integer numSolicitud) {
        this.numSolicitud = numSolicitud;
    }

    @Override
    public String toString() {
        return "Inventario{" + "numSolicitud=" + numSolicitud + '}';
    }
}
