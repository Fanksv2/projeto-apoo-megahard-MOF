package com.megahard.mofproject.control;

import com.megahard.mofproject.model.Comanda;
import com.megahard.mofproject.model.Estoque;
import com.megahard.mofproject.model.EstoqueItem;
import com.megahard.mofproject.model.Ingrediente;
import com.megahard.mofproject.model.NotaFiscal;
import com.megahard.mofproject.model.Pagamento;
import com.megahard.mofproject.model.Pedido;
import com.megahard.mofproject.model.Produto;
import java.util.List;
import java.util.ArrayList;

public class DBContext {
    private static DBContext instance;
    
    private List<NotaFiscal> dbNotaFiscal;
    private List<Pagamento> dbPagamento;
    private List<Comanda> dbComanda;
    private List<Pedido> dbPedido;
    private List<Produto> dbProduto;
    private List<Ingrediente> dbIngrediente;
    private List<EstoqueItem> dbEstoque;
    
    private DBContext(){
        dbNotaFiscal = new ArrayList<>();
        dbPagamento = new ArrayList<>();
        dbComanda = new ArrayList<>();
        dbPedido = new ArrayList<>();
        dbProduto = new ArrayList<>();
        dbIngrediente = new ArrayList<>();
        dbEstoque = new ArrayList<>();
    }
    
    public static synchronized DBContext getInstance(){
        if(instance == null){
            instance = new DBContext();
        }
        return instance;
    }

    public List<NotaFiscal> getDbNotaFiscal() {
        return dbNotaFiscal;
    }

    public List<Pagamento> getDbPagamento() {
        return dbPagamento;
    }

    public List<Comanda> getDbComanda() {
        return dbComanda;
    }

    public List<Pedido> getDbPedido() {
        return dbPedido;
    }

    public List<Produto> getDbProduto() {
        return dbProduto;
    }

    public List<Ingrediente> getDbIngrediente() {
        return dbIngrediente;
    }

    public List<EstoqueItem> getDbEstoque() {
        return dbEstoque;
    } 
}
