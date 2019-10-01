package com.gildedrose;

import static org.junit.Assert.*;

import org.junit.Test;

public class GildedRoseTest {

    @Test
    public void checkUsualUpdate() {
        String name = "Dummie Core";
        int n = 15;
        Item[] items = new Item[] { new Item(name, n, n+10) };
        GildedRose app = new GildedRose(items);
        for (int i = n; i > 0; i--){
            app.updateQuality();
            assertEquals(name, app.items[0].name);
            assertEquals(i-1,app.items[0].quality);
            assertEquals(i-1,app.items[0].sellIn);
        } 
    }

    @Test
    public void noNegativeQuality() {
        String name = "Crappy Dummie Core";
        int n = 15;
        Item[] items = new Item[] { new Item(name, n, n-5) };
        GildedRose app = new GildedRose(items);
        for (int i = 0; i < n; i++){
            app.updateQuality();
            assertTrue(app.items[0].quality >= 0);
        } 
    }

    @Test
    public void doubleQualityDegradation() {
        String name = "Old Dummie Core";
        int n = 16;
        Item[] items = new Item[] { new Item(name, 0, n) };
        GildedRose app = new GildedRose(items);
        for (int i = 1; i <= n; i++){
            app.updateQuality();
            assertEquals(n-i*2,app.items[0].quality);
            assertEquals(-i,app.items[0].sellIn);
        } 
    }

}
