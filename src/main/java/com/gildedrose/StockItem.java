package main.java.com.gildedrose;

public class StockItem extends Item {

    private static final String BRIE = "Aged Brie";
    private static final String BACKSTAGEPASS = "Backstage passes to a TAFKAL80ETC concert";
    private static final String SULFURAS = "Sulfuras, Hand of Ragnaros";

    public StockItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    public StockItem(Item item){
        super(item.name,item.sellIn,item.quality);
    }

    boolean lFifty(){
        return quality < 50;
    }

    boolean gZero(){
        return quality > 0;
    }

    boolean lZero(){
        return sellIn < 0;
    }

    boolean isBrie(){
        return name.equals(BRIE);
    }

    boolean isBackStagePass(){
        return name.equals(BACKSTAGEPASS);
    }

    boolean isSulfuras(){
        return name.equals(SULFURAS);
    }
}
