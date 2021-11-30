public class Customer {
    //Fields
    private int customer_id;
    private String customer_name;
    private int purchase_qty;
    private int item_no;
    private float totalBill;

    //Getter and Setters
    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public void setPurchase_qty(int purchase_qty) {
        this.purchase_qty = purchase_qty;
    }

    public int getPurchase_id() {
        return purchase_qty;
    }

    public int getItem_no() {
        return item_no;
    }

    public void setItem_no(int item_no) {
        this.item_no = item_no;
    }

    public float getTotalBill() {
        return totalBill;
    }

    public void setTotalBill(float totalBill) {
        this.totalBill = totalBill;
    }

    //Functions
    public void addCustomerDetails(Customer c) {
        this.customer_name = c.customer_name;
        this.item_no = c.item_no;
        this.purchase_qty = c.purchase_qty;
    }

    public void displayCustomerBill(Customer c) {
        System.out.println("+---------------------------------------------------------------------+");
        System.out.println("Item No\t\t Customer Name\t\t Customer ID\t\t Purchase QTY\t\t Total Bill");
        System.out.println(c.item_no + "\t\t\t " + c.customer_name + "\t\t\t " + c.customer_id + "\t\t\t " + c.purchase_qty + "\t\t\t " + c.totalBill);
        System.out.println("+---------------------------------------------------------------------+");
    }
}
