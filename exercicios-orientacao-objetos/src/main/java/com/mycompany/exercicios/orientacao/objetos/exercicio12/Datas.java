/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicios.orientacao.objetos.exercicio12;

import java.util.Calendar;

/**
 *
 * @author Maecio
 */
public class Datas {
    private int dia, mes, ano;

    public Datas(int dia, int mes, int ano) {
        if(dia > 0 && dia <= 31){
            this.dia = dia;
        } else {
            System.out.println("Dia inválido");
        }
        
        if(mes > 0 && mes <= 12){
            this.mes = mes;
        } else {
            System.out.println("Mês inválido");
        }
        
        if(ano > 0){
            this.ano = ano;
        } else {
            System.out.println("Ano inválido");
        }
    }

    public Datas() {
        Calendar dataAtual = Calendar.getInstance();
        this.dia = dataAtual.get(Calendar.DAY_OF_MONTH);
        this.mes = dataAtual.get(Calendar.MONTH) + 1;
        this.ano = dataAtual.get(Calendar.YEAR);
    }
    
    public void avancarData(){
        this.dia++;
        
        if(this.dia > 31){
            this.dia = 1;
            this.mes++;
        }
        
        if(this.mes > 12){
            this.mes = 1;
            this.ano++;
        }
    }

    @Override
    public String toString() {
        return "Datas{" + "dia=" + dia + ", mes=" + mes + ", ano=" + ano + '}';
    }
    
    // Getters and Setters
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
    
    
    
}
