/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.megahard.mofproject.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rafae
 */
public class EstoqueItem {
    private int qntItemEstoque;
    private Ingrediente ingrediente;

    public int getQntItemEstoque() {
        return qntItemEstoque;
    }

    public void setQntItemEstoque(int qntItemEstoque) {
        this.qntItemEstoque = qntItemEstoque;
    }

    public Ingrediente getIngrediente() {
        return ingrediente;
    }

    public void setIngrediente(Ingrediente ingrediente) {
        this.ingrediente = ingrediente;
    }
    
}
