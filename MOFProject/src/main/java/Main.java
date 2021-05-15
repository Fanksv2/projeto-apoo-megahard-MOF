
import com.megahard.mofproject.control.DBContext;
import com.megahard.mofproject.model.Pedido;
import com.megahard.mofproject.utils.ListUtils;

public class Main {
    public static void main(String[] args){
        ListUtils.printList(DBContext.getInstance().getDbPedido());
        DBContext.getInstance().getDbPedido().add(new Pedido());
        DBContext.getInstance().getDbPedido().add(new Pedido());
        ListUtils.printList(DBContext.getInstance().getDbPedido());   
    }
}

