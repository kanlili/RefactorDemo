package gildedRose;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class gildedRoseTest {
    private  static final String Other_Name="Other Name";
    private  static final String Aged_Brie="Aged Brie";
    private  static final String Backstage_passes="Backstage passes to a TAFKAL80ETC concert";
    private  static final String Sulfuras_Hand="Sulfuras, Hand of Ragnaros";
    @Test
    public void should_return_2_when_call_updateQuality_given_items_qualty3(){
        Item item=new Item("Backstage passes",10,3);
        Item[] items=new Item[]{item};
        GildedRose gildedRose=new GildedRose(items);
        gildedRose.updateQuality();
        Assert.assertEquals(2,item.quality);
    }
    @Test
    public void should_return_1_when_call_updateQuality_given_items_qualty3_sillin_minus1(){
        Item item=new Item("Backstage passes",-1,3);
        Item[] items=new Item[]{item};
        GildedRose gildedRose=new GildedRose(items);
        gildedRose.updateQuality();
        Assert.assertEquals(1,item.quality);
    }
}
