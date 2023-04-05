/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicios.orientacao.objetos.exercicio14;

/**
 *
 * @author Maecio
 */
public class IngressoApp {
    public static void main(String[] args) {
        Ingresso ingressoComum = new Ingresso();
        
        IngressoVIP ingressoVIP = new IngressoVIP();
        ingressoVIP.setValorAdd(50.00f);
        
        ingressoComum.imprimirValor();
        ingressoVIP.imprimirValor();
    }
}
