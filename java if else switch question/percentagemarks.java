import java.util.Scanner;

public class percentagemarks {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("enter the number of maths :- ");
        int math=s.nextInt();

        System.out.println("enter the number of physics :- ");
        int physics=s.nextInt();

        System.out.println("enter the number of chemestry :- ");
        int chemestry=s.nextInt();

        double total=math+physics+chemestry;

        System.out.println("student totel marks is :- " +total+ "\n student percent is :- " +(total/300)*100 +" %");


    }
}
