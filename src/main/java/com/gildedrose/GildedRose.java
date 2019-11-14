package main.java.com.gildedrose;

public class GildedRose {

    Item[] items;

    public GildedRose(Item[] items) {

        for (int i = 0; i < items.length; i++){
            items[i] = GenericItem.newItem(items[i]);
        }
        this.items = items;

    }

    public void updateQuality() {

        GenericItem updatedItem;
        for (int i = 0; i < items.length; i++) {

            updatedItem = GenericItem.newItem(items[i]);
            updatedItem.update();
            items[i] = updatedItem;
        }
    }

    public Item[]getItems(){
        return this.items;
    }
}
