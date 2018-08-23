import java.util.Scanner;

public class SandwichShop {


        public static void main(String[] args) {
            //Application to measure the success rate of reaching daily sales goals.

            Scanner keyboard = new Scanner(System.in);
            System.out.println("Checking sales goals.");
            System.out.println("The sales goal for veggie sandwiches is 30");
            System.out.println("How many veggie sandwiches were sold today?");
            int veggiesSold = keyboard.nextInt();

            //Sales goal for veggies
            if (veggiesSold >= 30) {
                System.out.println("Made goal for veggies");
            }
            else {
                System.out.println("Fell short on goal");
            }



            //Sales goal for burgers
            System.out.println("The sales goal for burgers is 175");
            System.out.println("How many burgers were sold today ?");
            int burgersSold = keyboard.nextInt();

            if (burgersSold >= 175) {
                System.out.println("Made goal for burgers");
            }
            else {
                System.out.println("Fell short on goal");
            }




            //Sales goal for subs
            System.out.println("The sales goal for subs is 200");
            System.out.println("How many subs were sold today");
            int subsSold = keyboard.nextInt();

            if (subsSold >= 200) {
                System.out.println("Made goal for subs");
            }
            else {
                System.out.println("Fell short on goal");
            }


            //Sales goal for soup
            System.out.println("The sales goal for soup is 87");
            System.out.println("How many bowls of soup were sold today ?");
            int soupSold = keyboard.nextInt();

            if (soupSold >= 87) {
                System.out.println("Made goal for soup");
            }
            else{
                System.out.println("Fell short on goal");
            }


            if (veggiesSold + burgersSold + subsSold + soupSold >= 492)
                System.out.println("Made goal for everything !");
        }


    }



