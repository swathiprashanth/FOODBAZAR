package printbill;

import java.util.Date;
import itemscalc.Purchase;

public class BillFormat {

    public static void main(String[] args) {

        Date date1 = new Date(); //date object declaration to print date on Purchase Receipt

        Double bananaCost, orangeCost, kiwiCost;
        int appleCost;
        Purchase obj1  = new Purchase(); //object declaration
        appleCost  = obj1.PriceCalc(2,100);      // calling PriceCalc method to calculate Apple price
        orangeCost = obj1.PriceCalc(1.5,80);    // calling PriceCalc method to calculate Orange price
        bananaCost = obj1.PriceCalc(0.5,30);    // calling PriceCalc method to calculate Banana price
        kiwiCost = obj1.PriceCalc(0.75,120);    // calling PriceCalc method to calculate Kiwi price

        double totalCost = (appleCost+orangeCost+bananaCost+kiwiCost);

        System.out.println("        FOOD BAZAAR  ");
        System.out.println("    OPP: THOUGHTWORKS");
        System.out.println(" Gachibowli,HYDERABAD-500084");
        System.out.println("DATE:" + date1);
        System.out.println("-------------------------------------- ");
        System.out.print("FRUITS");
        System.out.print("      Quantity");
        System.out.println("     AMOUNT");
        System.out.println("---------------------------------------");
        System.out.print("APPLE");
        System.out.print("       2kg");
        System.out.println("          " + appleCost);
        System.out.print("ORANGE");
        System.out.print("      1.5kg");
        System.out.println("        " + orangeCost);
        System.out.print("Banana");
        System.out.print("      0.5kg");
        System.out.println("        " + bananaCost);
        System.out.print("KIWI");
        System.out.print("        0.75kg");
        System.out.println("       " + kiwiCost);
        System.out.println("---------------------------------------");
        System.out.println("Total Amount             " + totalCost);
        System.out.println("---------------------------------------");
        System.out.println("        THANK YOU  ");

    }
}
