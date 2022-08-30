// Java Program to Check Whether a Given Alphabets are Uppercase or Lowercase or Digits


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class chack_Ascii {

    public static void main(String args[]) throws IOException
    {
        char m;
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter any alphabet:");
        m = (char) bf.read();
        if(m >= 97 && m <= 123)
        {
            System.out.println("Lower Case");
        }
        else if(m >= 65 && m <= 96)
        {
            System.out.println("Upper Case");
        }
        else if(m >= 48 && m <= 57)
        {
            System.out.println("Digit");
        }
    }
}