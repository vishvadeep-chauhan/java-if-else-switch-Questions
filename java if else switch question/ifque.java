// Take values of length and breadth of a rectangle from user and check if it is square or not.

import java.util.Scanner;

public class ifque {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("enter the length of rectangle");
        int length = s.nextInt();

        System.out.println("enter the bradth of rectangle");
        int bradth = s.nextInt();

        if (length == bradth) {
            System.out.println("it is square");

        } else {
            System.out.println("it is not square");

        }

    }
}
