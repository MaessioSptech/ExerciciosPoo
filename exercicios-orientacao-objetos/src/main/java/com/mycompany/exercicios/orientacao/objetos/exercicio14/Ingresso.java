/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicios.orientacao.objetos.exercicio14;

/**
 *
 * @author Maecio
 */
public class Ingresso {
    private float valor;

    public Ingresso() {
        this.valor = 100.0f;
    }
    
    public void imprimirValor(){
        System.out.println("Valor do ingresso R$" + this.valor);
    }

    //Getters and Setters
    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
    
    
}
