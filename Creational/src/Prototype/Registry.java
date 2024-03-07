package Prototype;
import java.util.HashMap;
import java.util.Map;

public class Registry {

    private Map<String, Item> items = new HashMap<>();

    public Registry(){
        loadItems();
    }

    public Item createItem(String type){
        Item item = null;
        try {
            item = (Item)(items.get(type)).clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return item;
    }

    private void loadItems(){
        Movie movie = new Movie();
        movie.setTitle("Movie Title");
        movie.setPrice(300);
        movie.setRunTime("2 hours");
        items.put("Movie", movie);

        Book book = new Book();
        book.setNumberOfPages(250);
        book.setPrice(20);
        book.setTitle("Book Title");
        items.put("Book", book);
    }
    
}