package practice;

import java.util.Scanner;


    public class Temps {


        public static void main(String[] args) {
            //Create and populate array temps
            int[][] temps = new int[7][4];

            temps[0][0] = 68;
            temps[0][1] = 76;
            temps[0][2] = 73;
            temps[0][3] = 64;

            temps[1][0] = 70;
            temps[1][1] = 76;
            temps[1][2] = 72;
            temps[1][3] = 65;

            temps[2][0] = 76;
            temps[2][1] = 87;
            temps[2][2] = 81;
            temps[2][3] = 69;

            temps[3][0] = 70;
            temps[3][1] = 84;
            temps[3][2] = 78;
            temps[3][3] = 68;

            temps[4][0] = 68;
            temps[4][1] = 82;
            temps[4][2] = 76;
            temps[4][3] = 70;

            temps[5][0] = 71;
            temps[5][1] = 75;
            temps[5][2] = 73;
            temps[5][3] = 74;

            temps[6][0] = 75;
            temps[6][1] = 83;
            temps[6][2] = 77;
            temps[6][3] = 72;


            System.out.println("Based on that data, the following are the average temperatures for the week by days");

            avgByDays(temps);
            System.out.println("The following are the average temperatures for the week by time");
            avgByTime(temps);
            System.out.println("The final average temperature for the week was:");
            System.out.println("Overrall:" +avgWholeArray(temps));

        }
        //Method to calculate average by week day
        public static void avgByDays(int[][] temps) {
            String [] day={"Sun","Mon","Tue","Wed","Thu","Fri","Sat"};
            int sum;
            for (int k = 0; k < temps.length; k++){
                sum = 0;
                for (int l = 0; l < temps[k].length; l++){
                    sum = sum + temps[k][l];
                }




                System.out.print(day[k] + ": = "+ (double)sum / temps[k].length);



            }
        }
        //Method to calculate average by time of the day
        public static void avgByTime(int[][] temps) {
            String [] timeOfDay={"7 AM","3 PM","7 PM","3 AM"};
            int sum;
            for (int k = 0; k < temps[k].length; k++){
                sum = 0;
                for (int l = 0; l< temps.length; l++){
                    sum = sum + temps[l][k];
                }




                System.out.print(timeOfDay[k] + ": = ");

                System.out.printf("%4.1f\n", (double)sum / temps.length);

            }
        }

        public static double avgWholeArray(int[][] temps) {
            int row = temps.length, col = temps[0].length;
            int sum  = 0;
            for (int k = 0; k < row; k++) {
                for (int l = 0; l < col; l++)
                    sum = sum + temps[k][l];
            }
            return  Math.floor((double)sum / (row * col));

        }

    }


