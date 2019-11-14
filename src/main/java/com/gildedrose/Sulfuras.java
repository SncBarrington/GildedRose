package main.java.com.gildedrose;

public class Sulfuras extends GenericItem {

    Sulfuras(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    public Sulfuras(Item item){
        super(item.name,item.sellIn,item.quality);
    }
}
