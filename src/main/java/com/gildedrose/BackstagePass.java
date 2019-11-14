package main.java.com.gildedrose;

public class BackstagePass extends GenericItem {

    BackstagePass(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    public BackstagePass(Item item){
        super(item.name,item.sellIn,item.quality);
    }

}
