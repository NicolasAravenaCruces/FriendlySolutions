package com.generation.friendlysolutions.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="premio")
public class Premio {
    @Id
    @GeneratedValue ( strategy = GenerationType.IDENTITY)
    private Integer premio_id;
    private Integer puntajepremio;
    private String nombrepremio;
    private String tipopremio;

    public Premio() {
    }

    public Premio(Integer premio_id, Integer puntajepremio, String nombrepremio, String tipopremio) {
        this.premio_id = premio_id;
        this.puntajepremio = puntajepremio;
        this.nombrepremio = nombrepremio;
        this.tipopremio = tipopremio;
    }

    public Integer getPremio_id() {
        return premio_id;
    }

    public void setPremio_id(Integer premio_id) {
        this.premio_id = premio_id;
    }

    public Integer getPuntajepremio() {
        return puntajepremio;
    }

    public void setPuntajepremio(Integer puntajepremio) {
        this.puntajepremio = puntajepremio;
    }

    public String getNombrepremio() {
        return nombrepremio;
    }

    public void setNombrepremio(String nombrepremio) {
        this.nombrepremio = nombrepremio;
    }

    public String getTipopremio() {
        return tipopremio;
    }

    public void setTipopremio(String tipopremio) {
        this.tipopremio = tipopremio;
    }
    
    
    
    
}
