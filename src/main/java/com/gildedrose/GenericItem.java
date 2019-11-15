package main.java.com.gildedrose;



public abstract class GenericItem extends Item {

    //Add new item type constants here

    private static final String BRIE = "Aged Brie";
    private static final String BACKSTAGEPASS = "Backstage passes";
    private static final String SULFURAS = "Sulfuras";
    private static final String CONJURED = "Conjured";


    GenericItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
        normalize();
    }

    static GenericItem newItem(Item item){
        if(item.name.contains(SULFURAS)) return new Sulfuras(item);
        if(item.name.contains(BACKSTAGEPASS)) return new BackstagePass(item);
        if(item.name.contains(BRIE)) return new Brie(item);
        if(item.name.contains(CONJURED)) return new Conjured(item);

        //Add new item type tests here

        else return new NormalItem(item);
    }

    void normalize(){
        if(super.quality > 50) super.quality = 50;
        if(super.quality < 0) super.quality = 0;
    }

    void update(){}
}
