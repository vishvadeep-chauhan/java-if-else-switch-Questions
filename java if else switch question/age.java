// Take input of age of 3 people by user and determine oldest and youngest among them.


import java.util.Scanner;
public class age {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        System.out.println("enter age of three people :- ");

        int a= s.nextInt();
        int b= s.nextInt();
        int c= s.nextInt();

        if ((a>b) && (a>c)) {
            System.out.println("this  is yungest person"+a); 
        }

        if ((b>a) && (b>c)){
            System.out.println("this  is yungest person"+b);
        }

       if ((c>a) && (c>b)){
            System.out.println("this  is yungest person"+c);
        }

         if ((a<b) && (a<c)){
            System.out.println("this  is oldest person"+a);
        }

         if ((b<a) && (b<c)){
            System.out.println("this  is oldest person"+b);
        }

         if ((c<a) && (c<b)){
            System.out.println("this  is oldest person"+c);
        }

        else {
            System.out.println("wrong age");
        }
        
    }
}