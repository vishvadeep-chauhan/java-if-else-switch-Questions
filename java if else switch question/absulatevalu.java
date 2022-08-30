import java.util.Scanner;

// Write a program to print absolute vlaue of a number entered by user. E.g.-
// INPUT: 1        OUTPUT: 1
// INPUT: -1        OUTPUT: 1


public class absulatevalu {
    public static void main(String[] args){
      Scanner s = new Scanner(System.in);
      System.out.println("Enter number");
      int x = s.nextInt();
      if(x<0){
        System.out.println("Absolute value : "+(-1*x));
      }
      else{
        System.out.println("Absolute value : "+x);
      }
    }
  }