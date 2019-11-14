package main.java.com.gildedrose;

public class Brie extends GenericItem {

    Brie(Item item){
        super(item.name,item.sellIn,item.quality);
    }

    @Override
    public void update(){

        this.quality ++;
        if(this.sellIn <= 0) this.quality ++;

        normalize();
        this.sellIn --;
    }

}
