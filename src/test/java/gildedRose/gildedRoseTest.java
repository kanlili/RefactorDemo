package gildedRose;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class gildedRoseTest {

    @Test
    public void should_return_2_when_call_updateQuality_given_items_qualty3(){
        Item item=new Item("Backstage passes",10,3);
        Item[] items=new Item[]{item};
        GildedRose gildedRose=new GildedRose(items);
        gildedRose.updateQuality();
        Assert.assertEquals(2,item.quality);
    }

}
