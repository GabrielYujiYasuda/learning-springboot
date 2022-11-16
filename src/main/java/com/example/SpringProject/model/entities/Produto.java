package com.example.SpringProject.model.entities;

import com.sun.istack.NotNull;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Entity
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotBlank
    private String nome;

    @Min(0)
    private double preco; // preco > 0

    @Min(0)
    @Max(1)
    private double desconto; // desconto maior que 0, menor que 1.

    //Constructors

    public Produto() {}

    public Produto(String nome, Double preco, Double desconto) {
        super();
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
    }

    //Getters
    public int getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
    public double getPreco() {
        return preco;
    }
    public double getDesconto() {
        return desconto;
    }
    //Setters
    public void setId(int id) {
        this.id = id;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

}
