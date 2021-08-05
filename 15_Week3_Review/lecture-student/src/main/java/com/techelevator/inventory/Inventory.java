package com.techelevator.inventory;

import com.techelevator.items.Item;
import com.techelevator.view.Menu;

import java.util.HashMap;
import java.util.Map;

public class Inventory {

    private Map<String , Item> items ;

    public Inventory() {
       InventoryReader reader = new MemoryInventoryReader();
       items = reader.read();


    }

    public Map<String, Item> getItems(){
        return items;
    }


        try {
            try {
                private String Menu;
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
