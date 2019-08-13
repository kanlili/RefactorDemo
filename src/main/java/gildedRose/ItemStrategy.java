package gildedRose;

public interface ItemStrategy {
    public boolean selectName(String name);
    public void handle(Item item);
}
