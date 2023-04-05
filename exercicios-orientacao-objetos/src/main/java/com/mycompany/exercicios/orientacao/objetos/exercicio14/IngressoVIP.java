/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicios.orientacao.objetos.exercicio14;

/**
 *
 * @author Maecio
 */
public class IngressoVIP extends Ingresso{
    private float valorAdd;

    @Override
    public void imprimirValor(){
         System.out.println("Valor do ingresso VIP R$" + (this.getValor() + this.valorAdd));
    }
    
    // Getters and Setters
    public float getValorAdd() {
        return valorAdd;
    }

    public void setValorAdd(float valorAdd) {
        this.valorAdd = valorAdd;
    }
    
    
}
