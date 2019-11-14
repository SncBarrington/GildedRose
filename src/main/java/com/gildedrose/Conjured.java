package main.java.com.gildedrose;

public class Conjured extends GenericItem{

    Conjured(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    public Conjured(Item item){
        super(item.name,item.sellIn,item.quality);
    }

    @Override
    public void update(){}

}
