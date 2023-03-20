package com.generation.friendlysolutions.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity (name="reciclaje")
public class Reciclaje {
    @Id
    @GeneratedValue ( strategy = GenerationType.IDENTITY)

    private Integer reciclaje_id;
    private Integer cantidad ;
    private Integer puntaje;
    private Integer tipomaterial_id ;
    public Reciclaje() {
    }
    public Reciclaje(Integer reciclaje_id, Integer cantidad, Integer puntaje, Integer tipomaterial_id) {
        this.reciclaje_id = reciclaje_id;
        this.cantidad = cantidad;
        this.puntaje = puntaje;
        this.tipomaterial_id = tipomaterial_id;
    }
    public Integer getReciclaje_id() {
        return reciclaje_id;
    }
    public void setReciclaje_id(Integer reciclaje_id) {
        this.reciclaje_id = reciclaje_id;
    }
    public Integer getCantidad() {
        return cantidad;
    }
    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
    public Integer getPuntaje() {
        return puntaje;
    }
    public void setPuntaje(Integer puntaje) {
        this.puntaje = puntaje;
    }
    public Integer getTipomaterial_id() {
        return tipomaterial_id;
    }
    public void setTipomaterial_id(Integer tipomaterial_id) {
        this.tipomaterial_id = tipomaterial_id;
    }
    

    
    
}
