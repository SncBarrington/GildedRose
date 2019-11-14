package main.java.com.gildedrose;

public class GildedRose {

    private Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        GenericItem item;
        for (int i = 0; i < items.length; i++) {
            item = GenericItem.newItem(items[i]);

            if (!item.isBrie() && !item.isBackStagePass()) {
                if (item.quality > 0 && !item.isSulfuras()) {
                    item.quality = item.quality - 1;
                }
            } else {
                if (item.quality < 50) {
                    item.quality = item.quality + 1;

                    if (item.isBackStagePass()) {
                        if (item.sellIn < 11 && item.quality < 50) {
                            item.quality = item.quality + 1;
                        }

                        if (item.sellIn < 6 && item.quality < 50) {
                            item.quality = item.quality + 1;
                        }
                    }
                }
            }

            if (!item.isSulfuras()) {
                item.sellIn = item.sellIn - 1;
            }

            if (item.sellIn < 0) {
                if (!item.isBrie()) {
                    if (!item.isBackStagePass()) {
                        if (item.quality > 0 && !item.isSulfuras()) {
                            item.quality = item.quality - 1;
                        }
                    } else {
                        item.quality = 0;
                    }
                } else {
                    if (item.quality < 50) {
                        item.quality = item.quality + 1;
                    }
                }
            }

            items[i] = new Item(item.name,item.sellIn,item.quality);
        }
        }

    public Item[]getItems(){
        return this.items;
    }
}
