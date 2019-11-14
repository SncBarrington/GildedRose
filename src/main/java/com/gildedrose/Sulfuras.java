package main.java.com.gildedrose;

public class Sulfuras extends GenericItem {

    Sulfuras(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
        super.quality = quality;
    }

    @Override
    public void update(){

        //Sulfuras' sellIn and quality never changes

    }
}
