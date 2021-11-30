import java.util.ArrayList;
import java.util.Scanner;
public class Main {

   public static ArrayList<Shop> shopList = new ArrayList<Shop>();
   public static ArrayList<Customer> customerList = new ArrayList<Customer>();

    public static void menu() {
        System.out.println("1 - Add New Items");
        System.out.println("2 - Display All Items");
        System.out.println("3 - Add Customer Details");
        System.out.println("0 - Exit");
    }

    public static void main(String[] args) {
        int opt;
        Scanner sc = new Scanner(System.in);

        do {
            Shop s = new Shop();
            menu();
            System.out.print("-> ");
            opt = sc.nextInt();
            switch(opt) {
                case 1 -> {
                    System.out.print("Enter Item No: ");
                    s.setNo(sc.nextInt());
                    System.out.print("Enter Item Name: ");
                    s.setName(sc.next());
                    System.out.print("Enter Item Price: ");
                    s.setPrice(sc.nextInt());
                    s.addNewItem(s);
                    shopList.add(s);
                }

                case 2 -> s.displayItems(shopList);

                case 3 -> {
                    _sellOutDetails();
                }
            }
        }
        while (opt != 0);
    }

    private static void _sellOutDetails() {
        Scanner sc = new Scanner(System.in);
        Customer c = new Customer();

        System.out.print("Enter your customer name: ");
        c.setCustomer_name(sc.nextLine());

        System.out.print("Enter your item no: ");
        c.setItem_no(sc.nextInt());

        System.out.print("Enter your item qty: ");
        c.setPurchase_qty(sc.nextInt());

        c.addCustomerDetails(c);

    }
}
