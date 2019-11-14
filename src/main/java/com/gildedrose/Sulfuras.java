package main.java.com.gildedrose;

public class Sulfuras extends GenericItem {

    Sulfuras(Item item) {
        super(item.name, item.sellIn, item.quality);
        super.quality = 80;
    }

    @Override
    public void update(){

        //Sulfuras' sellIn and quality never changes

    }
}
