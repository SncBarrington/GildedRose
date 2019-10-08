package com.gildedrose;

import static org.junit.Assert.*;

import org.junit.Test;

public class GildedRoseTest {

    @Test
    public void checkUsualUpdate() {
        String name = "Dummie Core";
        int n = 10;
        Item[] items = new Item[] { new Item(name, n, n) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(name, app.items[0].name);
        assertEquals(n-1,app.items[0].quality);
        assertEquals(n-1,app.items[0].sellIn);
    }

    @Test
    public void noNegativeQuality() {
        String name = "Crappy Dummie Core";
        int n = 10;
        int j = 0;
        Item[] items = new Item[] { new Item(name, n, j) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertTrue(app.items[0].quality == j);
    }

    @Test
    public void doubleQualityDegradation() {
        String name = "Old Dummie Core";
        int i = 0;
        int j = 10;
        Item[] items = new Item[] { new Item(name, i, j) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(j-2,app.items[0].quality);
        assertEquals(i-1,app.items[0].sellIn);
    }

}
