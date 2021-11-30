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
        do {
            menu();
            opt = sc.nextInt();
            switch(opt) {
                case 1 -> System.out.println();
            }
        }
        while (opt != 0);
    }
}
