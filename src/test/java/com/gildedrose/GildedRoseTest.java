package test.java.com.gildedrose;

import main.java.com.gildedrose.GildedRose;
import org.junit.jupiter.api.Test;

import main.java.com.gildedrose.Item;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GildedRoseTest {

    @Test
    public void checkUsualUpdate() {
        String name = "Dummie Core";
        int n = 10;
        Item[] items = new Item[] { new Item(name, n, n) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(name, app.getItems()[0].name);
        assertEquals(n-1,app.getItems()[0].quality);
        assertEquals(n-1,app.getItems()[0].sellIn);
    }

    @Test
    public void noNegativeQuality() {
        String name = "Crappy Dummie Core";
        int n = 10;
        int j = 0;
        Item[] items = new Item[] { new Item(name, n, j) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(j,app.getItems()[0].quality);
    }

    @Test
    public void doubleQualityDegradation() {
        String name = "Old Dummie Core";
        int i = 0;
        int j = 10;
        Item[] items = new Item[] { new Item(name, i, j) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(j-2,app.getItems()[0].quality);
        assertEquals(i-1,app.getItems()[0].sellIn);
    }

    @Test
    public void checkAgedBrieNormal(){
        String name = "Aged Brie";
        int n = 10;
        Item[] items = new Item[] { new Item(name, n, n) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(n+1,app.getItems()[0].quality);
        assertEquals(n-1,app.getItems()[0].sellIn);
    }

    @Test
    public void checkAgedBrieDouble(){
        String name = "Aged Brie";
        int i = 0;
        int j = 10;
        Item[] items = new Item[] { new Item(name, i, j) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(j+2,app.getItems()[0].quality);
        assertEquals(i-1,app.getItems()[0].sellIn);
    }

    @Test
    public void checkAgedBrieMaxQuality(){
        String name = "Aged Brie";
        int i = 10;
        int j = 50;
        Item[] items = new Item[] { new Item(name, i, j) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(j,app.getItems()[0].quality);
        assertEquals(i-1,app.getItems()[0].sellIn);
    }

    @Test
    public void checkSulfuras(){
        String name = "Sulfuras, Hand of Ragnaros";
        int i = 0;
        int j = 80;
        Item[] items = new Item[] { new Item(name, i, j) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(j,app.getItems()[0].quality);
        assertEquals(i,app.getItems()[0].sellIn);
    }

    @Test
    public void checkBackstagePassesNormal(){
        String name = "Backstage passes to a TAFKAL80ETC concert";
        int n = 15;
        Item[] items = new Item[] { new Item(name, n, n) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(n+1,app.getItems()[0].quality);
        assertEquals(n-1,app.getItems()[0].sellIn);
    }

    @Test
    public void checkBackstagePassesDouble(){
        String name = "Backstage passes to a TAFKAL80ETC concert";
        int n = 10;
        Item[] items = new Item[] { new Item(name, n, n) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(n+2,app.getItems()[0].quality);
        assertEquals(n-1,app.getItems()[0].sellIn);
    }

    @Test
    public void checkBackstagePassesTriple(){
        String name = "Backstage passes to a TAFKAL80ETC concert";
        int n = 5;
        Item[] items = new Item[] { new Item(name, n, n) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(n+3,app.getItems()[0].quality);
        assertEquals(n-1,app.getItems()[0].sellIn);
    }

    @Test
    public void checkBackstagePassesZero(){
        String name = "Backstage passes to a TAFKAL80ETC concert";
        int i = 0;
        int j = 25;
        Item[] items = new Item[] { new Item(name, i, j) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(0,app.getItems()[0].quality);
        assertEquals(i-1,app.getItems()[0].sellIn);
    }

    @Test
    public void checkBackstageMaxQuality(){
        String name = "Backstage passes to a TAFKAL80ETC concert";
        int i = 5;
        int j = 50;
        Item[] items = new Item[] { new Item(name, i, j) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(j,app.getItems()[0].quality);
        assertEquals(i-1,app.getItems()[0].sellIn);
    }

}
