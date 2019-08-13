package gildedRose;


import java.util.ArrayList;
import java.util.List;

public class GildedRose {
    Item[] items;
    private static List<ItemStrategy> itemStrategies = new ArrayList<>();
    static {
        itemStrategies.add(new Aged_Brie());
        itemStrategies.add(new Backstage_passes());
        itemStrategies.add(new Sulfuras());
        itemStrategies.add(new OtherItemName());
        itemStrategies.add(new CoujuredItem());
    }
    public GildedRose(Item[] items) {
        this.items = items;
    }
    public void updateQuality() {
        for (Item item:items) {
            itemStrategies.stream().filter(i->i.selectName(item.name))
                    .forEach(i->i.handle(item));
        }
    }

}