package gildedRose;

public class ItemValidator {
    ItemUpdated itemUpdated=new ItemUpdated();
    public boolean isItemSellInMinus0(Item item) {
        return item.sellIn < 0;
    }

    public void IsMinus50forQuality(Item item) {
        if (item.quality < 50) {
            itemUpdated.addQuality(item);
        }
    }
    protected boolean notReachMinQuality(Item item) {
        return item.quality > 0;
    }

    public void changeBackstage_passesQuality(Item item) {
        if (item.quality < 50) {
            item.quality ++;
            if (isEqualsBackstage_passes(item)) {
                if (item.sellIn < 11) {
                    IsMinus50forQuality(item);
                }

                if (item.sellIn < 6) {
                    IsMinus50forQuality(item);
                }
            }
        }
    }
    protected boolean isEqualsBackstage_passes(Item item) {
        return item.name.equals("Backstage passes to a TAFKAL80ETC concert");
    }
}
