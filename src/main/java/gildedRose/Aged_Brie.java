package gildedRose;

public class Aged_Brie implements ItemStrategy {
    ItemValidator itemValidator=new ItemValidator();

    @Override
    public boolean selectName(String name) {
        return name.equals("Aged Brie");
    }

    @Override
    public void handle(Item item){
        itemValidator.changeBackstage_passesQuality(item);
        item.sellIn--;
        if (itemValidator.isItemSellInMinus0(item)){
            itemValidator.IsMinus50forQuality(item);
        }
    }
}
