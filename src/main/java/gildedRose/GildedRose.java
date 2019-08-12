package gildedRose;
public class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item:items) {
           switch(item.name){
               case "Aged Brie" :
                   changeBackstage_passesQuality(item);
                   item.sellIn--;
                   if (item.sellIn < 0){
                       IsMinus50forQuality(item);
                   }
                   break;
               case "Backstage passes to a TAFKAL80ETC concert":
                   changeBackstage_passesQuality(item);
                   item.sellIn--;
                   if (item.sellIn < 0){
                       item.quality = 0;
                   }
                   break;
               case "Sulfuras, Hand of Ragnaros":
                   changeBackstage_passesQuality(item);
                   break;
               default:
                    if (notReachMinQuality(item)){
                        decreaceQuality(item);
                    }
                    item.sellIn--;
                    if (item.sellIn < 0){
                        if (notReachMinQuality(item)){
                            decreaceQuality(item);
                        }
                    }

           }

        }
    }

    private void IsMinus50forQuality(Item item) {
        if (item.quality < 50) {
            addQuality(item);
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

    public void addQuality(Item item) {
        item.quality ++;
    }

    private void decreaceQuality(Item item) {
        item.quality = item.quality - 1;
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