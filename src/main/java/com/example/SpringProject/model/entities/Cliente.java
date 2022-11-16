package com.example.SpringProject.model.entities;

public class Cliente {

    private int id;
    private String nome;
    private String cpf;

    //Constructor
    public Cliente (int id, String nome, String cpf) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
    }

    //Getters
    public int getId() {
        return id;
    }
    public String getNome(){
        return nome;
    }
    public String getCpf() {
        return cpf;
    }
    //Setters
    public void setId(int id) {
        this.id = id;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }



}
