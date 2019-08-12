package gildedRose;

public class Sulfuras {
    ItemValidator itemValidator=new ItemValidator();
    public void handle(Item item){
        itemValidator.changeBackstage_passesQuality(item);
    }
}
