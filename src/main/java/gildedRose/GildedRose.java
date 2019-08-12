package gildedRose;
public class GildedRose {
    Item[] items;
    ItemUpdated itemUpdated=new ItemUpdated();
    ItemValidator itemValidator=new ItemValidator();
    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item:items) {
           switch(item.name){
               case "Aged Brie" :
                   itemValidator.changeBackstage_passesQuality(item);
                   item.sellIn--;
                   if (itemValidator.isItemSellInMinus0(item)){
                       itemValidator.IsMinus50forQuality(item);
                   }
                   break;
               case "Backstage passes to a TAFKAL80ETC concert":
                   itemValidator.changeBackstage_passesQuality(item);
                   item.sellIn--;
                   if (itemValidator.isItemSellInMinus0(item)){
                       item.quality = 0;
                   }
                   break;
               case "Sulfuras, Hand of Ragnaros":
                   itemValidator.changeBackstage_passesQuality(item);
                   break;
               default:
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
    }

}