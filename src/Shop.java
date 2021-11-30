import java.lang.reflect.Array;
import java.util.ArrayList;

public class Shop {
    //Fields
    private int item_no;
    private String item_name;
    private int item_price;

    //Setter and Getters
    //For item_no
    public void setNo(int no) {
        this.item_no = no;
    }

    public int getNo() {
        return this.item_no;
    }

    //For item_name
    public void setName(String name) {
        this.item_name = name;
    }

    public String getName() {
        return this.item_name;
    }

    //For item_price
    public void setPrice(int price) {
        this.item_price = price;
    }

    public int getPrice() {
        return this.item_price;
    }

    //Functions
    public void addNewItem(Shop s) {
        this.item_no = s.item_no;
        this.item_price = s.item_price;
        this.item_name = s.item_name;
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
