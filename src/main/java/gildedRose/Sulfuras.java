package gildedRose;

public class Sulfuras implements ItemStrategy {
    ItemValidator itemValidator=new ItemValidator();

    @Override
    public boolean selectName(String name) {
        return name.equals("Sulfuras, Hand of Ragnaros");
    }

    @Override
    public void handle(Item item){
        itemValidator.changeBackstage_passesQuality(item);
    }
}
