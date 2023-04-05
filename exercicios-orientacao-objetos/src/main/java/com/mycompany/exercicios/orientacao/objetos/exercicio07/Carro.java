/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicios.orientacao.objetos.exercicio07;

/**
 *
 * @author Maecio
 */
public class Carro {
    private String cor, marca, placa;

    public void inserirCarro(String cor, String marca, String placa){
        this.cor = cor;
        this.marca = marca;
        this.placa = placa;
    }
    
    // Getters and Setters
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
        
}
