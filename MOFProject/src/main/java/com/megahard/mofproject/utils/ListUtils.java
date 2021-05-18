
package com.megahard.mofproject.utils;

import com.megahard.mofproject.control.DBContext;
import com.megahard.mofproject.model.Ingrediente;
import com.megahard.mofproject.model.Produto;
import com.megahard.mofproject.model.QuantidadeIngrediente;
import java.util.ArrayList;
import com.megahard.mofproject.model.Comanda;
import com.megahard.mofproject.model.Pedido;import java.util.Arrays;
import java.util.List;

public class ListUtils {
    public static void printList(List list){
        System.out.println("---------");
        list.forEach(
                        item->System.out.println(item)
                    );
        System.out.println("---------");
    }
    public static void populateIngredientes(){
        List<String> ingNomes = Arrays.asList("Pão", "Salsicha", "Bacon", "Coquinha");
        for(String ingNome: ingNomes){
            Ingrediente ingrediente = new Ingrediente();
            ingrediente.setNome(ingNome);
            DBContext.getInstance().getDbIngrediente().add(ingrediente);
        }
    }
    
    public static void populateProdutos(){
        List<Integer> qtdIngredientes = Arrays.asList(1, 2, 3);
        Produto produto = new Produto();
        produto.setPreco(6.75f);
        produto.setNomeProduto("Dogão");
        for(int i = 0; i < qtdIngredientes.size(); i++){
            QuantidadeIngrediente qtdIngrediente = new QuantidadeIngrediente();
            qtdIngrediente.setIngrediente(DBContext.getInstance().getDbIngrediente().get(i));
            qtdIngrediente.setQuantidadeNecessaria(qtdIngredientes.get(i));
            produto.getQuantidadeIngredientes().add(qtdIngrediente);
        }
        DBContext.getInstance().getDbProduto().add(produto);
    }
public static <T> List<T> removeDuplicates(List<T> list)
    {
  
        // Create a new ArrayList
        List<T> newList = new ArrayList<T>();
  
        // Traverse through the first list
        for (T element : list) {
  
            // If this element is not present in newList
            // then add it
            if (!newList.contains(element)) {
  
                newList.add(element);
            }
        }
  
        // return the new list
        return newList;
    }    public static void populateComandas(){
        List<Integer> qntPedido = Arrays.asList(1, 2, 3); //Não sei para que usar isso sinceramente
        Comanda comanda = new Comanda();
        comanda.setCodigo(42); //O código da comanda pré-criada é 42
        
        Pedido pedido = new Pedido();
        pedido.setQuantidade(4); //Criado um novo pedido para ser inserido na comanda e ja inserimos a quantidade de produto que irá compor o pedido
        
        //Criar um produto aqui, codigo repetido do metodo anterior
        List<Integer> qtdIngredientes = Arrays.asList(1, 2, 3);
        Produto produto = new Produto();
        produto.setPreco(4.50f);
        produto.setNomeProduto("Coquinha");
        for(int i = 0; i < qtdIngredientes.size(); i++){
            QuantidadeIngrediente qtdIngrediente = new QuantidadeIngrediente();
            qtdIngrediente.setIngrediente(DBContext.getInstance().getDbIngrediente().get(i));
            qtdIngrediente.setQuantidadeNecessaria(qtdIngredientes.get(i));
            produto.getQuantidadeIngredientes().add(qtdIngrediente);
        }
        DBContext.getInstance().getDbProduto().add(produto);
        //Ate aqui. O produto é uma coquinha, e como estabelecemos antes, teremos 4 delas
        
        pedido.setProduto(produto);
        
        comanda.getPedidos().add(pedido);
                
        DBContext.getInstance().getDbComanda().add(comanda);
    }}
