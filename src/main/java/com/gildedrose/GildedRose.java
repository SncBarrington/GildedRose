package main.java.com.gildedrose;

public class GildedRose {
    


    private Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        GenericItem genericItem;
        for (int i = 0; i < items.length; i++) {
            genericItem = new NormalItem(getItems()[i]);
            if (!genericItem.isBrie() && !genericItem.isBackStagePass()) {
                if (genericItem.quality > 0 && !genericItem.isSulfuras()) {
                    genericItem.quality = genericItem.quality - 1;
                }
            } else {
                if (genericItem.quality < 50) {
                    genericItem.quality = genericItem.quality + 1;

                    if (genericItem.isBackStagePass()) {
                        if (genericItem.sellIn < 11 && genericItem.quality < 50) {
                            genericItem.quality = genericItem.quality + 1;
                        }

                        if (genericItem.sellIn < 6 && genericItem.quality < 50) {
                            genericItem.quality = genericItem.quality + 1;
                        }
                    }
                }
            }

            if (!genericItem.isSulfuras()) {
                genericItem.sellIn = genericItem.sellIn - 1;
            }

            if (genericItem.sellIn < 0) {
                if (!genericItem.isBrie()) {
                    if (!genericItem.isBackStagePass()) {
                        if (genericItem.quality > 0 && !genericItem.isSulfuras()) {
                            genericItem.quality = genericItem.quality - 1;
                        }
                    } else {
                        genericItem.quality = 0;
                    }
                } else {
                    if (genericItem.quality < 50) {
                        genericItem.quality = genericItem.quality + 1;
                    }
                }
            }
            items[i] = genericItem;
        }
        }

    public Item[]getItems(){
        return this.items;
    }
}
