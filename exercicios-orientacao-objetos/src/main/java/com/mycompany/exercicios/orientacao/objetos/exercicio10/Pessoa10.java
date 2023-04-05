/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicios.orientacao.objetos.exercicio10;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Maecio
 */
public class Pessoa10 {
    
    private String nome;
    private Date dataNasc;
    private float altura;

    // construtor e outros métodos da classe...

    public int calcIdade() {
        Calendar dataNasc = Calendar.getInstance();
        dataNasc.setTime(this.dataNasc);

        Calendar dataAtual = Calendar.getInstance();

        int idade = dataAtual.get(Calendar.YEAR) - dataNasc.get(Calendar.YEAR);

        if (dataAtual.get(Calendar.DAY_OF_YEAR) < dataNasc.get(Calendar.DAY_OF_YEAR)) {
            idade--;
        }

        return idade;
    }
    
            
    @Override
    public String toString() {
        return super.toString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
    // Getters and Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    
}
