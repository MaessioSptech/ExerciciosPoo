/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicios.orientacao.objetos.exercicio08;

/**
 *
 * @author Maecio
 */
public class Animais {
    private String porte;
    private int idade;
    private float peso;

    public void inserirFelino(String porte, int idade, float peso) {
        this.porte = porte;
        this.idade = idade;
        this.peso = peso;
    }

    
    
    // Getters and Setters
    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
    
    
}
