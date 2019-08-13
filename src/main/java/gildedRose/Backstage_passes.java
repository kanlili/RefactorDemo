package gildedRose;

public class Backstage_passes implements ItemStrategy{
    ItemValidator itemValidator=new ItemValidator();
    @Override
    public boolean selectName(String name) {
        return name.equals("Backstage passes to a TAFKAL80ETC concert");
    }
    @Override
     public void handle(Item item) {
        itemValidator.changeBackstage_passesQuality(item);
        item.sellIn--;
        if (itemValidator.isItemSellInMinus0(item)) {
            item.quality = 0;
        }
    }
}
