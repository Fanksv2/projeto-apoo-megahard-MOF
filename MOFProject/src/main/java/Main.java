
import com.megahard.mofproject.control.DBContext;
import com.megahard.mofproject.model.Pedido;
import com.megahard.mofproject.utils.ListUtils;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rafae
 */
public class Main {
    public static void main(String[] args){
        Pedido p = new Pedido();
        ListUtils.printList(DBContext.getInstance().getDbPedido());
        DBContext.getInstance().getDbPedido().add(new Pedido());
        ListUtils.printList(DBContext.getInstance().getDbPedido());
        
    }
}
