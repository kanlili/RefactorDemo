package gildedRose;

public class Aged_Brie {
    ItemValidator itemValidator=new ItemValidator();
    public void handle(Item item){
        itemValidator.changeBackstage_passesQuality(item);
        item.sellIn--;
        if (itemValidator.isItemSellInMinus0(item)){
            itemValidator.IsMinus50forQuality(item);
        }
    }
}