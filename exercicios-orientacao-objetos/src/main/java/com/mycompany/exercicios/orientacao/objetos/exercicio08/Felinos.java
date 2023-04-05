/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicios.orientacao.objetos.exercicio08;

import com.mycompany.exercicios.orientacao.objetos.exercicio08.Animais;

/**
 *
 * @author Maecio
 */
public class Felinos extends Animais{
    private String tipo;
    private boolean garras;
    private boolean dormir;
    
    public void inserirFelino(String porte, int idade, float peso, String tipo) {
        this.setPorte(porte);
        this.setIdade(idade);
        this.setPeso(peso);
        this.setTipo(tipo);
    }
    
    public void afiarGarras(){
        if(this.dormir){
            this.dormir = false;
            this.garras = true;
            System.out.println("Afiando garras!");
        } else{
            System.out.println("Já estou afiando as garras!");
        }
        
    }
    
    public void Dormir(){
        if(this.garras){
            this.dormir = true;
            this.garras = false;
            System.out.println("Indo dormir Zzz...");
        } else{
            System.out.println("Roncando....");
        }
        
    }
    
    // Getters and Setters
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
}
