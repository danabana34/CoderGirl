package practice;

import java.util.Scanner;

public class Multiplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input a number: ");
        int size = in.nextInt();
        if(!(size<1 || size>20)){

            for (int i=0; i<= size; i++){
                for (int j=0; j<=size; j++)

                    System.out.println(i + " x " + j + " = " +
                            (i * j));

            }
        }
        else{
            System.out.println("Enter a number between 1 and 20");
        }

    }

}






