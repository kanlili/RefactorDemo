package gildedRose;
public class GildedRose {
    Item[] items;
    ItemUpdated itemUpdated=new ItemUpdated();
    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item:items) {
           switch(item.name){
               case "Aged Brie" :
                   changeBackstage_passesQuality(item);
                   item.sellIn--;
                   if (isItemSellInMinus0(item)){
                       IsMinus50forQuality(item);
                   }
                   break;
               case "Backstage passes to a TAFKAL80ETC concert":
                   changeBackstage_passesQuality(item);
                   item.sellIn--;
                   if (isItemSellInMinus0(item)){
                       item.quality = 0;
                   }
                   break;
               case "Sulfuras, Hand of Ragnaros":
                   changeBackstage_passesQuality(item);
                   break;
               default:
                    if (notReachMinQuality(item)){
                       itemUpdated.decreaceQuality(item);
                    }
                    item.sellIn--;
                    if (isItemSellInMinus0(item)){
                        if (notReachMinQuality(item)){
                            itemUpdated.decreaceQuality(item);
                        }
                    }

           }

        }
    }

    private boolean isItemSellInMinus0(Item item) {
        return item.sellIn < 0;
    }

    private void IsMinus50forQuality(Item item) {
        if (item.quality < 50) {
            itemUpdated.addQuality(item);
        }
    }
    private boolean notReachMinQuality(Item item) {
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
    private boolean isEqualsSulfuras(Item item) {
        return item.name.equals("Sulfuras, Hand of Ragnaros");
    }

    private boolean isEqualsBackstage_passes(Item item) {
        return item.name.equals("Backstage passes to a TAFKAL80ETC concert");
    }

    private boolean isAgedBrie(Item items){
        return  items.name.equals("Aged Brie");
    }
}