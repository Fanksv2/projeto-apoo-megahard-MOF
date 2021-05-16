package com.megahard.mofproject.utils;

import com.megahard.mofproject.control.DBContext;
import com.megahard.mofproject.model.EstoqueItem;
import com.megahard.mofproject.model.Ingrediente;
import javax.swing.JTable;

public class ViewUtils {
    public static int getRow(JTable table){
        int column = 0;
        int row = table.getSelectedRow();
        if(row < 0){
            return -1;
        }
        
        return row;
    }
    public static String getRowFirstField(JTable table){
        int column = 0;
        int row = getRow(table);
        
        if(row < 0){
            return "";
        }
        
        String firstField = table.getModel().getValueAt(row, column).toString();
        
        if(firstField.isEmpty()){
            return "";
        }
        
        return firstField;
    }
}
