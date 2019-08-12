package gildedRose;
public class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item:items) {
            if (!isAgedBrie(item)) {
                if (!isEqualsBackstage_passes(item)) {
                    if (item.quality > 0) {
                        if (!isEqualsSulfuras(item)) {
                            decreaceQuality(item);
                        }
                    }
                } else {
                    if (item.quality < 50) {
                        addQuality(item);

                        if (isEqualsBackstage_passes(item)) {
                            if (item.sellIn < 11) {
                                if (item.quality < 50) {
                                    addQuality(item);
                                }
                            }

                            if (item.sellIn < 6) {
                                if (item.quality < 50) {
                                    addQuality(item);
                                }
                            }
                        }
                    }
                }
            } else {
                if (item.quality < 50) {
                    addQuality(item);

                    if (isEqualsBackstage_passes(item)) {
                        if (item.sellIn < 11) {
                            if (item.quality < 50) {
                                addQuality(item);
                            }
                        }

                        if (item.sellIn < 6) {
                            if (item.quality < 50) {
                                addQuality(item);
                            }
                        }
                    }
                }
            }

            if (!isEqualsSulfuras(item)) {
                item.sellIn = item.sellIn - 1;
            }

            if (item.sellIn < 0) {
                if (!isAgedBrie(item)) {
                    if (!isEqualsBackstage_passes(item)) {
                        if (item.quality > 0) {
                            if (!isEqualsSulfuras(item)) {
                                decreaceQuality(item);
                            }
                        }
                    } else {
                        item.quality = item.quality - item.quality;
                    }
                } else {
                    if (item.quality < 50) {
                        addQuality(item);
                    }
                }
            }
        }
    }

    private void addQuality(Item item) {
        item.quality = item.quality + 1;
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