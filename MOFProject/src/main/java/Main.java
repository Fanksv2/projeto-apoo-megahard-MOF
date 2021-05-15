
import com.megahard.mofproject.control.DBContext;
import com.megahard.mofproject.model.Ingrediente;
import com.megahard.mofproject.model.Pedido;
import com.megahard.mofproject.model.Produto;
import com.megahard.mofproject.model.QuantidadeIngrediente;
import com.megahard.mofproject.utils.ListUtils;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args){
        populateIngredientes();
        populateProdutos();
        ListUtils.printList(DBContext.getInstance().getDbIngrediente());
        ListUtils.printList(DBContext.getInstance().getDbProduto());
        
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
}