
package com.megahard.mofproject.utils;

import java.util.List;

public class ListUtils {
    public static void printList(List list){
        list.forEach(
                        item->System.out.println(item)
                    );
    }
}
