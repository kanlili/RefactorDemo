package gildedRose;
public class GildedRose {
    Item[] items;
    ItemUpdated itemUpdated=new ItemUpdated();
    ItemValidator itemValidator=new ItemValidator();
    Aged_Brie aged_brie=new Aged_Brie();
    Backstage_passes backstage_passes=new Backstage_passes();
    Sulfuras sulfuras=new Sulfuras();
    OtherItemName otherItemName=new OtherItemName();
    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item:items) {
           switch(item.name){
               case "Aged Brie" :
                   aged_brie.handle(item);
                   break;
               case "Backstage passes to a TAFKAL80ETC concert":
                   backstage_passes.handle(item);
                   break;
               case "Sulfuras, Hand of Ragnaros":
                   sulfuras.handle(item);
                   break;
               default:
                    otherItemName.handle(item);

           }

        }
    }

}