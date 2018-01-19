package F_M;

import java.util.Formatter;

public class StringOutPFormat {
    private double total = 0;
    private Formatter f = new Formatter(System.out);

    public void printTitle(){
        f.format("%-15s %5s %10s\n", "Item", "Qty", "Price");
        f.format("%-15s %5s %10s\n", "----", "---", "-----");
    }
    public void print(String name, int qty, double price){
        f.format("%-15.15s %5d %10.2f\n", name, qty, price);
        total+=price;
    }
    public void printTotal(){
        f.format("%-15s %5s %10.2f\n", "Tax", "", total*0.06);
        f.format("%-15s %5s %10s\n", "", "", "-----");
        f.format("%-15s %5s %10.2f\n", "Total", "", total*1.06);
    }

    public static void main(String[] args) {
        StringOutPFormat receipt = new StringOutPFormat();
        receipt.printTitle();
        receipt.print("Jack's magic beans", 4, 4.25);
        receipt.print("Princess peas", 3, 4.00);
        receipt.print("Three bears porridge", 1, 14.05);
        receipt.printTotal();
    }
}
