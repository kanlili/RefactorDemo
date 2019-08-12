package gildedRose;

public class OtherItemName implements ItemStrategy{
    ItemUpdated itemUpdated=new ItemUpdated();
    ItemValidator itemValidator=new ItemValidator();
    public void handle(Item item){
        if (itemValidator.notReachMinQuality(item)){
            itemUpdated.decreaceQuality(item);
        }
        item.sellIn--;
        if (itemValidator.isItemSellInMinus0(item)){
            if (itemValidator.notReachMinQuality(item)){
                itemUpdated.decreaceQuality(item);
            }
        }
    }
}
