package gildedRose;

public class CoujuredItem  implements ItemStrategy{
    ItemValidator itemValidator=new ItemValidator();
    @Override
    public boolean selectName(String name) {
        return  name.equals("Conjured");
    }

    @Override
    public void handle(Item item) {
        itemValidator.changeBackstage_passesQuality(item);
        item.sellIn--;
        if (item.sellIn<0){
            item.sellIn=item.sellIn-2;
        }
        if (item.quality>0){
            item.quality=item.quality-2;
        }
    }
}
