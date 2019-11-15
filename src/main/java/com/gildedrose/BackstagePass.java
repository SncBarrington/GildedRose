package main.java.com.gildedrose;

public class BackstagePass extends GenericItem {


    BackstagePass(Item item){
        super(item.name,item.sellIn,item.quality);
    }

    @Override
    void update(){

        this.quality ++;
        if(this.sellIn <= 10) this.quality ++;
        if(this.sellIn <= 5) this.quality ++;
        if(this.sellIn <= 0) this.quality = 0;

        normalize();
        this.sellIn --;
    }

}
