package com.generation.friendlysolutions.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="tipomaterial")
public class TipoMaterial {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Integer tipomaterial_id;
    private String nombrematerial;


    public TipoMaterial() {
    }


    public TipoMaterial(Integer tipomaterial_id, String nombrematerial) {
        this.tipomaterial_id = tipomaterial_id;
        this.nombrematerial = nombrematerial;
    }


    public Integer getTipomaterial_id() {
        return tipomaterial_id;
    }


    public void setTipomaterial_id(Integer tipomaterial_id) {
        this.tipomaterial_id = tipomaterial_id;
    }


    public String getNombrematerial() {
        return nombrematerial;
    }


    public void setNombrematerial(String nombrematerial) {
        this.nombrematerial = nombrematerial;
    }
    
    
   

    
    
}
