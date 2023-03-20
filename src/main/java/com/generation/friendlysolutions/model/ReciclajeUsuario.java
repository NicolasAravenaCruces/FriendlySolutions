package com.generation.friendlysolutions.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity (name="reciclajeusuario")
public class ReciclajeUsuario {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Integer reciclajeusuario_id;
    private Integer reciclaje_id;
    private Integer usuario_id;

    public ReciclajeUsuario() {
    }

    public ReciclajeUsuario(Integer reciclajeusuario_id, Integer reciclaje_id, Integer usuario_id) {
        this.reciclajeusuario_id = reciclajeusuario_id;
        this.reciclaje_id = reciclaje_id;
        this.usuario_id = usuario_id;
    }

    public Integer getReciclajeusuario_id() {
        return reciclajeusuario_id;
    }

    public void setReciclajeusuario_id(Integer reciclajeusuario_id) {
        this.reciclajeusuario_id = reciclajeusuario_id;
    }

    public Integer getReciclaje_id() {
        return reciclaje_id;
    }

    public void setReciclaje_id(Integer reciclaje_id) {
        this.reciclaje_id = reciclaje_id;
    }

    public Integer getUsuario_id() {
        return usuario_id;
    }

    public void setUsuario_id(Integer usuario_id) {
        this.usuario_id = usuario_id;
    }

    

}


