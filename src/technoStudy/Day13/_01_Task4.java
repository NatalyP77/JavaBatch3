package technoStudy.Day13;

import java.util.Scanner;

public class _01_Task4 {
    // write a java program which will show
    // multiplication table of 2
    //ex:
    //    2 x 1 = 2
    //    2 x 2 = 4
    //    2 x 3 = 6
    //    2 x 4 = 8
    //    2 x 5 = 10
    //    2 x 6 = 12
    //    2 x 7 = 14
    //    2 x 8 = 16
    //    2 x 9 = 18
    //    2 x 10 = 20
    // using for-loop

    // Part 2: take the number from user input
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int multiplicand = input.nextInt();

        for (int number = 1; number <= 10; number++) {
            System.out.println( multiplicand + " x "+number+" = "+ multiplicand*number);
        }
    }
}
