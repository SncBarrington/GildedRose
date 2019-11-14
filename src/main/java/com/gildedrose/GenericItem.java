package main.java.com.gildedrose;



public abstract class GenericItem extends Item {

    private static final String BRIE = "Aged Brie";
    private static final String BACKSTAGEPASS = "Backstage passes";
    private static  final String SULFURAS = "Sulfuras";

    public GenericItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    public GenericItem(Item item){
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
        return name.contains(BRIE);
    }

    boolean isBackStagePass(){
        return name.contains(BACKSTAGEPASS);
    }

    boolean isSulfuras(){
        return name.contains(SULFURAS);
    }

    static GenericItem newItem(Item item){
        if(item.name.contains(SULFURAS)) return new Sulfuras(item.name,item.sellIn,80);
        if(item.name.contains(BACKSTAGEPASS)) return new BackstagePass(item);
        if(item.name.contains(BRIE)) return new Brie(item);
        else return new NormalItem(item);
    }
    public void update(){}
}
