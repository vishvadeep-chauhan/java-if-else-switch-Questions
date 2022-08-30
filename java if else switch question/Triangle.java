import java.util.Scanner;

// Write a program to calculate the perimeter of a triangle having sides of length 2,3 and 5 units.

public class Triangle {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

        System.out.println("enter lenth of side 1st");
        int s1 = s.nextInt();

        System.out.println("enter lenth of side 2nd :-");
        int s2 = s.nextInt();

        System.out.println("enter lenth of side 3rd:-");
        int s3 = s.nextInt();

        System.out.println("perimeter of triangle is :-" +(s1+s2+s3));
        

    }
}
