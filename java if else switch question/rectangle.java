// Length and breadth of a rectangle are 5 and
//  7 respectively. Write a program to calculate the area and 
//  perimeter of the rectangle.

import java.util.Scanner;

public class rectangle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("enter lenth");
        int l = s.nextInt();

        System.out.println("enter bridth");
        int b = s.nextInt();



        System.out.println("area of rectangle:-" +l*b+
         "\n peramiter of rectangle :- " +2*(l+b) ); 

    }
}
