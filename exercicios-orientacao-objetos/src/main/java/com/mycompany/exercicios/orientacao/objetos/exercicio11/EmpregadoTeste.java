/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicios.orientacao.objetos.exercicio11;

/**
 *
 * @author Maecio
 */
public class EmpregadoTeste {
    public static void main(String[] args) {
        Empregado funcionario1 = new Empregado("João", "Zinho", 1500.00f);
        Empregado funcionario2 = new Empregado("Maria", "Zinha", 2000.00f);
        
        funcionario1.exibirSalarioAnual();
        funcionario2.exibirSalarioAnual();
        
        funcionario1.setSalarioMensal(funcionario1.getSalarioMensal() * 110 / 100);
        funcionario2.setSalarioMensal(funcionario2.getSalarioMensal() * 110 / 100);
        
        funcionario1.exibirSalarioAnual();
        funcionario2.exibirSalarioAnual();
    }
}
