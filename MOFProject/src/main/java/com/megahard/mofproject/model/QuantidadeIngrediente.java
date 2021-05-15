/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.megahard.mofproject.model;

/**
 *
 * @author rafae
 */
public class QuantidadeIngrediente {
    private int quantidadeNecessaria;
    private Ingrediente ingrediente;

    public int getQuantidadeNecessaria() {
        return quantidadeNecessaria;
    }

    public void setQuantidadeNecessaria(int quantidadeNecessaria) {
        this.quantidadeNecessaria = quantidadeNecessaria;
    }

    public Ingrediente getIngrediente() {
        return ingrediente;
    }

    public void setIngrediente(Ingrediente ingrediente) {
        this.ingrediente = ingrediente;
    }

    @Override
    public String toString() {
        return "QuantidadeIngrediente{" + "quantidadeNecessaria=" + quantidadeNecessaria + ", ingrediente=" + ingrediente + '}';
    }
    
    
    
}
