/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicios.orientacao.objetos.exercicio13;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Maecio
 */
public class Jogador {
    private String nome, posicao, nacionalidade;
    private Date dataNasc;
    private float altura, peso;
    
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
    
    public int calcAposentadoria(){
        int aposentadoria;
        if(this.posicao == "Defesa"){
            aposentadoria = 40;
        } else if(this.posicao == "Meio-Campo"){
            aposentadoria = 38;
        } else {
            aposentadoria = 35;
        }
        
        return aposentadoria - calcIdade();
    }

    @Override
    public String toString() {
        return "Jogador{" + "nome=" + nome + ", posicao=" + posicao + ", nacionalidade=" + nacionalidade + ", dataNasc=" + dataNasc + ", altura=" + altura + ", peso=" + peso + '}';
    }
    
    // Getters and Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
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

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
    
    
    
}
