package main.java.com.gildedrose;

public class GildedRose {

    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {

        GenericItem item;

        for (int i = 0; i < items.length; i++) {

            item = GenericItem.newItem(items[i]);
            item.update();
            items[i] = item;

        }
    }

    public Item[]getItems(){
        return this.items;
    }
}
