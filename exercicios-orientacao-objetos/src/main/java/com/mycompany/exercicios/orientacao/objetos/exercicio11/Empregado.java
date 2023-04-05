/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicios.orientacao.objetos.exercicio11;

/**
 *
 * @author Maecio
 */
public class Empregado {
    private String primeiroNome;
    private String segundoNome;
    private float salarioMensal;
    
    public void exibirSalarioAnual(){
        float salarioAnual = this.salarioMensal * 12;
        System.out.println("Seu salário anual é de R$" + salarioAnual);
    }

    // Constructor
    public Empregado(String primeiroNome, String segundoNome, float salarioMensal) {
        this.primeiroNome = primeiroNome;
        this.segundoNome = segundoNome;
        this.salarioMensal = salarioMensal;
    }
    
    // Getters and Setters
    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getSegundoNome() {
        return segundoNome;
    }

    public void setSegundoNome(String segundoNome) {
        this.segundoNome = segundoNome;
    }

    public float getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(float salarioMensal) {
        this.salarioMensal = salarioMensal;
    }
    
    
}
