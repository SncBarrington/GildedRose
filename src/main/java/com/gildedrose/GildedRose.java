package main.java.com.gildedrose;

public class GildedRose {
    
    private static final String SULFURAS = "Sulfuras, Hand of Ragnaros";
    private static final String BACKSTAGEPASS = "Backstage passes to a TAFKAL80ETC concert";
    private static final String BRIE = "Aged Brie";
    
    private Item[] items;

    public GildedRose(Item[] items) {
            this.items = items;
    }

    public void updateQuality() {
            for (int i = 0; i < items.length; i++) {
                if (!getItems()[i].name.equals(BRIE) && !getItems()[i].name.equals(BACKSTAGEPASS)) {
                    if (getItems()[i].quality > 0 && !getItems()[i].name.equals(SULFURAS)) {
                        getItems()[i].quality = getItems()[i].quality - 1;
                    }
                } else {
                    if (getItems()[i].quality < 50) {
                        getItems()[i].quality = getItems()[i].quality + 1;

                        if (getItems()[i].name.equals(BACKSTAGEPASS)) {
                            if (getItems()[i].sellIn < 11 && getItems()[i].quality < 50) {
                                getItems()[i].quality = getItems()[i].quality + 1;
                            }

                            if (getItems()[i].sellIn < 6 && getItems()[i].quality < 50) {
                                getItems()[i].quality = getItems()[i].quality + 1;
                            }
                        }
                    }
                }

                if (!getItems()[i].name.equals(SULFURAS)) {
                    getItems()[i].sellIn = getItems()[i].sellIn - 1;
                }

                if (getItems()[i].sellIn < 0) {
                    if (!getItems()[i].name.equals(BRIE)) {
                        if (!getItems()[i].name.equals(BACKSTAGEPASS)) {
                            if (getItems()[i].quality > 0 && !getItems()[i].name.equals(SULFURAS)) {
                                getItems()[i].quality = getItems()[i].quality - 1;
                            }
                        } else {
                            getItems()[i].quality = 0;
                        }
                    } else {
                        if (getItems()[i].quality < 50) {
                            getItems()[i].quality = getItems()[i].quality + 1;
                        }
                    }
                }
            }
        }

    public Item[]getItems(){
        return this.items;
    }
}
