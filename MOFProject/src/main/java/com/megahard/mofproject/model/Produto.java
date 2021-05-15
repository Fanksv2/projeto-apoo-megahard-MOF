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
public class Produto {
        private char nomeProduto;
        private float preco;
        private List<QuantidadeIngrediente> quantidadeIngredientes = new ArrayList <>();

    public char getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(char nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public List<QuantidadeIngrediente> getQuantidadeIngredientes() {
        return quantidadeIngredientes;
    }

    public void setQuantidadeIngredientes(List<QuantidadeIngrediente> quantidadeIngredientes) {
        this.quantidadeIngredientes = quantidadeIngredientes;
    }
        
}
