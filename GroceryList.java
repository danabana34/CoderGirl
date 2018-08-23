import java.util.Scanner;
import java.text.DecimalFormat;


public class GroceryList {

    public static void main(String[] args) {

    // Grocery List Calculator

     Scanner keyboard = new Scanner(System.in);
                System.out.println("Please list three items on your grocery list");

    //Enter the grocery variables
                System.out.println("Item 1 ?");
    String product1 = keyboard.nextLine();

                System.out.println("Item 2 ?");
    String product2 = keyboard.nextLine();

                System.out.println("Item 3 ?");
    String product3 = keyboard.nextLine();


    //Enter the quantity of each grocery item
                System.out.println("Please enter the quantity of each item");

                System.out.println("How many " + product1 + " ?");
    int num1 = keyboard.nextInt();
                keyboard.skip("\n");

                System.out.println("How many " + product2 + " ?");
    int num2 = keyboard.nextInt();
                keyboard.skip("\n");

                System.out.println("How many " + product3 + " ?");
    int num3 = keyboard.nextInt();
                keyboard.skip("\n");


    //Equation to calculate the quantity of each grocery item
    int totalQuantity = num1 + num2 + num3;

    //Enter the price of the items
                System.out.println("Please Enter the price of items in dollars & cents");
                System.out.println("How much does one " + product1 + " cost ?");

    double price1 = keyboard.nextDouble();
                keyboard.skip("\n");
    double cost1 = num1 * price1;

                System.out.println("How much does one " + product2 + " cost ?");

    double price2 = keyboard.nextDouble();
                keyboard.skip("\n");
    double cost2 = num2 * price2;

                System.out.println("How much does one " + product3 + " cost ?");

    double price3 = keyboard.nextDouble();
                keyboard.skip("\n");
    double cost3 = num3 * price3;


    double totalPriceOfProducts = cost1 + cost2 + cost3 ;

    DecimalFormat df = new DecimalFormat("0.00");

                System.out.println("Calculating your grocery bill");
                System.out.print("Your grocery bill is: $");
                System.out.print(df.format(totalPriceOfProducts));

}







}
