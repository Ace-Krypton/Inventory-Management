import java.util.ArrayList;
import java.util.Scanner;
public class Main {

    public static void menu() {
        System.out.println("1 - Add New Items");
        System.out.println("2 - Display All Items");
        System.out.println("3 - Add Customer Details");
        System.out.println("0 - Exit");
    }

    public static void main(String[] args) {
        int opt;
        Scanner sc = new Scanner(System.in);
        ArrayList<Shop> shopList = new ArrayList<Shop>();


        do {
            Shop s = new Shop();
            menu();
            opt = sc.nextInt();
            switch(opt) {
                case 1 -> {
                    System.out.print("Enter Item No: ");
                    s.setNo(sc.nextInt());
                    System.out.print("Enter Item Name: ");
                    s.setName(sc.next());
                    System.out.println("Enter Item Price: ");
                    s.setPrice(sc.nextInt());

                }

            }
        }
        while (opt != 0);
    }
}
