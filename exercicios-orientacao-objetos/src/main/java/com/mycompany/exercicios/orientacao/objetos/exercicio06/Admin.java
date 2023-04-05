/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicios.orientacao.objetos.exercicio06;

import com.mycompany.exercicios.orientacao.objetos.exercicio06.Usuario;

/**
 *
 * @author Maecio
 */
public class Admin extends Usuario{
    private boolean admin;
    
    public Admin() {
        this.admin = true;
    }
    
    public boolean isAdmin(){
        return this.admin;
    }

    // Getters and Setters
    public boolean getAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    
    
}
