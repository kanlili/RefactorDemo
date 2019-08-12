package gildedRose;

public class ItemUpdated {
    public void addQuality(Item item) {
        item.quality ++;
    }

    public void decreaceQuality(Item item) {
        item.quality = item.quality - 1;
    }
}
