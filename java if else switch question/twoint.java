// Take two int values from user and print greatest among them.

import java.util.Scanner;

public class twoint {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter two number");

        int a = s.nextInt();
        int b = s.nextInt();

        if ( a>b) {
            System.out.println(+a);
        }
        else {

            System.out.println(+b);
        }
    }
}
