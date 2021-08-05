package com.techelevator.inventory;

import com.techelevator.items.Book;
import com.techelevator.items.Bookmark;
import com.techelevator.items.Item;
import com.techelevator.items.Megazine;

import java.util.HashMap;
import java.util.Map;

public class MemoryInventoryReader implements InventoryReader{

    @Override
    public Map<String, Item> read() {
         Map<String, Item> inventory = new HashMap<String, Item>();

         inventory.put("B1", new Book("B1", 12.50,"Herry Potter"));
         inventory.put("B2", new Book("B2",20,"Fifty Shades of Blue") );
         inventory.put("B3", new Book("B3",5.75,"Green Egg and Ham"));
         inventory.put("M1", new Megazine("M1", 3.50,"People"));
         inventory.put("C1", new Bookmark("C1", 1.25,"red"));



        return inventory;
    }
}
