package gildedRose;

public class HandleItem {
      private  ItemStrategy itemStrategy;


    public HandleItem(ItemStrategy itemStrategy) {
        this.itemStrategy = itemStrategy;
    }
    public void   handle(Item item){
        itemStrategy.handle(item);
    }
}
