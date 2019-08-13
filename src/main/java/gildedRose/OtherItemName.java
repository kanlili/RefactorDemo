package gildedRose;

public class OtherItemName implements ItemStrategy{
    ItemUpdated itemUpdated=new ItemUpdated();
    ItemValidator itemValidator=new ItemValidator();
    @Override
    public boolean selectName(String name) {
        return !(name.equals("Sulfuras, Hand of Ragnaros")|| name.equals("Aged Brie")|| name.equals("Backstage passes to a TAFKAL80ETC concert"));
    }
    @Override
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
