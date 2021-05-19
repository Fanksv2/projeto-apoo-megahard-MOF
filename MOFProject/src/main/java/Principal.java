
import com.megahard.mofproject.control.DBContext;
import com.megahard.mofproject.model.Ingrediente;
import com.megahard.mofproject.model.Pedido;
import com.megahard.mofproject.model.Produto;
import com.megahard.mofproject.model.QuantidadeIngrediente;
import com.megahard.mofproject.utils.ListUtils;
import java.util.Arrays;
import java.util.List;

public class Principal {
    public static void main(String[] args){
        ListUtils.printList(DBContext.getInstance().getDbIngrediente());
        ListUtils.printList(DBContext.getInstance().getDbProduto());
        
    }
}