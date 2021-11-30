import java.lang.reflect.Array;
import java.util.ArrayList;

public class Shop {
    //Fields
    private int item_no;
    private String item_name;
    private int item_price;

    //Functions
    public void addNewItem() {

    }

    public void displayItems(ArrayList<Shop> arr) {
        for (Shop shop : arr) {
            System.out.println("+------------------------------------+");
            System.out.println("Item No: " + shop.item_no);
            System.out.println("Item Name: " + shop.item_name);
            System.out.println("Item Price: " + shop.item_price);
            System.out.println("+------------------------------------+");
        }
    }
}
