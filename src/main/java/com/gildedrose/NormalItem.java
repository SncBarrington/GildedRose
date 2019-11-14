package main.java.com.gildedrose;

public class NormalItem extends GenericItem {

    NormalItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    NormalItem(Item item){
        super(item.name,item.sellIn,item.quality);
    }

    @Override
    public void update(){

        this.quality --;
        if(this.sellIn <= 0) this.quality --;

        normalize();
        this.sellIn --;
    }
}
