package main.java.com.gildedrose;

public class Brie extends GenericItem {

    Brie(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    public Brie(Item item){
        super(item.name,item.sellIn,item.quality);
    }


}
