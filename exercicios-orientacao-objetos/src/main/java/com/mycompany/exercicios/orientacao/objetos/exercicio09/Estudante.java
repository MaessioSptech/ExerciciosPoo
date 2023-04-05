/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicios.orientacao.objetos.exercicio09;

/**
 *
 * @author Maecio
 */
public class Estudante extends Pessoa{
    private String turma;
    private String turno;

    public void inserirEstudante(String turma, String turno, String nome, String endereco,
            String cpf) {
        this.turma = turma;
        this.turno = turno;
        this.setNome(nome);
        this.setEndereco(endereco);
        this.setCpf(cpf);
    }

    public void alterarTurno(String turma){
        this.setTurma(turma);
    }
    
    //Getters and Setters
    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }
    
    
}
