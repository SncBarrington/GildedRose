package main.java.com.gildedrose;

public class Conjured extends GenericItem{

    Conjured(Item item){
        super(item.name,item.sellIn,item.quality);
    }

    @Override
    public void update(){

        this.quality = this.quality - 2;
        if(this.sellIn <= 0) this.quality = this.quality - 2;

        normalize();
        this.sellIn --;

    }

}
