package gildedRose;

public class Backstage_passes implements ItemStrategy{
    ItemValidator itemValidator=new ItemValidator();
     public void handle(Item item) {
        itemValidator.changeBackstage_passesQuality(item);
        item.sellIn--;
        if (itemValidator.isItemSellInMinus0(item)) {
            item.quality = 0;
        }
    }
}
