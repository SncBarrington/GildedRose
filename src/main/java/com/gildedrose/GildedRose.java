package main.java.com.gildedrose;

public class GildedRose {
    


    private Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        StockItem stockItem;
        for (int i = 0; i < items.length; i++) {
            stockItem = new StockItem(getItems()[i]);
            if (!stockItem.isBrie() && !stockItem.isBackStagePass()) {
                if (stockItem.quality > 0 && !stockItem.isSulfuras()) {
                    stockItem.quality = stockItem.quality - 1;
                }
            } else {
                if (stockItem.quality < 50) {
                    stockItem.quality = stockItem.quality + 1;

                    if (stockItem.isBackStagePass()) {
                        if (stockItem.sellIn < 11 && stockItem.quality < 50) {
                            stockItem.quality = stockItem.quality + 1;
                        }

                        if (stockItem.sellIn < 6 && stockItem.quality < 50) {
                            stockItem.quality = stockItem.quality + 1;
                        }
                    }
                }
            }

            if (!stockItem.isSulfuras()) {
                stockItem.sellIn = stockItem.sellIn - 1;
            }

            if (stockItem.sellIn < 0) {
                if (!stockItem.isBrie()) {
                    if (!stockItem.isBackStagePass()) {
                        if (stockItem.quality > 0 && !stockItem.isSulfuras()) {
                            stockItem.quality = stockItem.quality - 1;
                        }
                    } else {
                        stockItem.quality = 0;
                    }
                } else {
                    if (stockItem.quality < 50) {
                        stockItem.quality = stockItem.quality + 1;
                    }
                }
            }
            items[i] = stockItem;
        }
        }

    public Item[]getItems(){
        return this.items;
    }
}
