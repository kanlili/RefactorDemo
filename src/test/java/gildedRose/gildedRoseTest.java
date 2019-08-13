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
        Item item=new Item(Other_Name,10,3);
        Item[] items=new Item[]{item};
        GildedRose gildedRose=new GildedRose(items);
        gildedRose.updateQuality();
        Assert.assertEquals(2,item.quality);
    }
    @Test
    public void should_return_1_when_call_updateQuality_given_items_qualty3_sillin_minus1(){
        Item item=new Item(Other_Name,-1,3);
        Item[] items=new Item[]{item};
        GildedRose gildedRose=new GildedRose(items);
        gildedRose.updateQuality();
        Assert.assertEquals(1,item.quality);
    }
    @Test
    public void should_return_0_when_call_updateQuality_given_name_otherName_sillin_10_items_qualty0(){
        Item item=new Item(Other_Name,10,0);
        Item[] items=new Item[]{item};
        GildedRose gildedRose=new GildedRose(items);
        gildedRose.updateQuality();
        Assert.assertEquals(0,item.quality);
    }
    @Test
    public void should_return_6and9_when_call_updateQuality_given_name_AgedBrie_sillin_10_items_qualty5(){
        Item item=new Item(Aged_Brie,10,5);
        Item[] items=new Item[]{item};
        GildedRose gildedRose=new GildedRose(items);
        gildedRose.updateQuality();
        Assert.assertEquals(6,item.quality);
        Assert.assertEquals(9,item.sellIn);
    }
    @Test
    public void should_return_9and50_when_call_updateQuality_given_name_AgedBrie_sillin_10_items_qualty50(){
        Item item=new Item(Aged_Brie,10,50);
        Item[] items=new Item[]{item};
        GildedRose gildedRose=new GildedRose(items);
        gildedRose.updateQuality();
        Assert.assertEquals(50,item.quality);
        Assert.assertEquals(9,item.sellIn);
    }
    @Test
    public void should_return_7and_minus1_when_call_updateQuality_given_name_AgedBrie_sillin_0_items_qualty5(){
        Item item=new Item(Aged_Brie,0,5);
        Item[] items=new Item[]{item};
        GildedRose gildedRose=new GildedRose(items);
        gildedRose.updateQuality();
        Assert.assertEquals(7,item.quality);
        Assert.assertEquals(-1,item.sellIn);
    }
    @Test
    public void should_return_50and_minus1_when_call_updateQuality_given_name_AgedBrie_sillin_0_items_qualty49(){
        Item item=new Item(Aged_Brie,0,49);
        Item[] items=new Item[]{item};
        GildedRose gildedRose=new GildedRose(items);
        gildedRose.updateQuality();
        Assert.assertEquals(50,item.quality);
        Assert.assertEquals(-1,item.sellIn);
    }
    @Test
    public void should_return_50and9_when_call_updateQuality_given_name_Backstage_passes_sillin_10_items_qualty49(){
        Item item=new Item(Backstage_passes,10,49);
        Item[] items=new Item[]{item};
        GildedRose gildedRose=new GildedRose(items);
        gildedRose.updateQuality();
        Assert.assertEquals(50,item.quality);
        Assert.assertEquals(9,item.sellIn);
    }
    @Test
    public void should_return_50and9_when_call_updateQuality_given_name_Backstage_passes_sillin_10_items_qualty48(){
        Item item=new Item(Backstage_passes,10,48);
        Item[] items=new Item[]{item};
        GildedRose gildedRose=new GildedRose(items);
        gildedRose.updateQuality();
        Assert.assertEquals(50,item.quality);
        Assert.assertEquals(9,item.sellIn);
    }
    @Test
    public void should_return_50and4_when_call_updateQuality_given_name_Backstage_passes_sillin_5_items_qualty47(){
        Item item=new Item(Backstage_passes,5,47);
        Item[] items=new Item[]{item};
        GildedRose gildedRose=new GildedRose(items);
        gildedRose.updateQuality();
        Assert.assertEquals(50,item.quality);
        Assert.assertEquals(4,item.sellIn);
    }
    @Test
    public void should_return_0and_minus_1_when_call_updateQuality_given_name_Backstage_passes_sillin_0_items_qualty50(){
        Item item=new Item(Backstage_passes,0,50);
        Item[] items=new Item[]{item};
        GildedRose gildedRose=new GildedRose(items);
        gildedRose.updateQuality();
        Assert.assertEquals(0,item.quality);
        Assert.assertEquals(-1,item.sellIn);
    }
    @Test
    public void should_return_80_when_call_updateQuality_given_name_Sulfuras_Hand_sillin_10_items_qualty80(){
        Item item=new Item(Sulfuras_Hand,10,80);
        Item[] items=new Item[]{item};
        GildedRose gildedRose=new GildedRose(items);
        gildedRose.updateQuality();
        Assert.assertEquals(80,item.quality);

    }
    @Test
    public void should_return_18_when_call_updateQuality_given_name_Conjured_sillin_10_items_qualty20(){
        Item item=new Item("Conjured",10,20);
        Item[] items=new Item[]{item};
        GildedRose gildedRose=new GildedRose(items);
        gildedRose.updateQuality();
        Assert.assertEquals(18,item.quality);

    }

}
