package com.devweb.curso.entidades;

import jakarta.persistence.Entity;

import java.io.Serializable;
import java.util.Objects;


@Entity
public class usúarios implements Serializable {
    private Long Id;
    private String nome;
    private String email;
    private String telefone;
    private String senha;


    public usúarios(){

    }

    public usúarios(Long id, String nome, String email, String telefone, String senha) {
        Id = id;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.senha = senha;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        usúarios usúarios = (usúarios) o;
        return Objects.equals(Id, usúarios.Id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(Id);
    }

}
