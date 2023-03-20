package com.generation.friendlysolutions.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="empresa")
public class Empresa {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Integer empresa_id;
    private String nombre_empresa;
    private String direccion;
    private String correo;
    private String contacto;

    public Empresa() {
    }

    public Empresa(Integer empresa_id, String nombre_empresa, String direccion, String correo, String contacto) {
        this.empresa_id = empresa_id;
        this.nombre_empresa = nombre_empresa;
        this.direccion = direccion;
        this.correo = correo;
        this.contacto = contacto;
    }

    public Integer getEmpresa_id() {
        return empresa_id;
    }

    public void setEmpresa_id(Integer empresa_id) {
        this.empresa_id = empresa_id;
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

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    

    

    

    


    
    
    
}
