package main.java.com.gildedrose;

public class NormalItem extends GenericItem {

    NormalItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    public NormalItem(Item item){
        super(item.name,item.sellIn,item.quality);
    }

    @Override
    public void update(){}
}
