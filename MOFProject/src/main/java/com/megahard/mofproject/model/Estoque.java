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
public class Estoque {
    private List<EstoqueItem> estoqueItens = new ArrayList <>();

    public List<EstoqueItem> getEstoqueItens() {
        return estoqueItens;
    }

    public void setEstoqueItens(List<EstoqueItem> estoqueItens) {
        this.estoqueItens = estoqueItens;
    }
    
}
