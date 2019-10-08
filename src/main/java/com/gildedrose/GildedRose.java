package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() { 

        int conj;
        int sellin;
        int quality;
        String firstWord;
        String theRest;
        String splitName[];

        for (int i = 0; i < items.length; i++) {
            conj = 1;
            sellin = -1;
            quality = 0;
            splitName = items[i].name.split(" ", 2);

            firstWord = splitName[0];
            theRest = splitName[1];

            if(firstWord.equals("Conjured")){
                conj++;
            }
            else{
                theRest = items[i].name;
            }

            switch(theRest){
                case "Aged Brie":
                    quality++;
                    if(items[i].sellIn < 1){
                        quality++;
                    }
                    break;

                case "Sulfuras, Hand of Ragnaros":
                    sellin++;
                    break;

                case "Backstage passes to a TAFKAL80ETC concert":
                    quality++;
                    if(items[i].sellIn < 11){
                        quality++;
                    }
                    if(items[i].sellIn < 6){
                        quality++;
                    }
                    if(items[i].sellIn < 1){
                        quality = -1*items[i].quality;
                    }
                    break;
                
                default:
                    quality--;
                    if(items[i].sellIn < 1){
                        quality--;
                    }
            }

            items[i].quality = items[i].quality + (quality * conj);
            items[i].sellIn = items[i].sellIn + sellin;

            if(items[i].quality > 50 && !theRest.equals("Sulfuras, Hand of Ragnaros")){
                items[i].quality = 50;
            }
            if(items[i].quality < 0 && !theRest.equals("Sulfuras, Hand of Ragnaros")){
                items[i].quality = 0;
            }

        }
    }
}
