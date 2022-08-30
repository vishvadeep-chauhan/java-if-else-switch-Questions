import java.util.Scanner;

// A shop will give discount of 10% if the cost of purchased quantity is more than 1000.
// Ask user for quantity
// Suppose, one unit will cost 100.
// Judge and print total cost for user.

public class shop {
    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       System.out.println("enter Quantity :-");
       float x=s.nextFloat();

       if ((x*100)>1000) { 
        System.out.println("total descount quantity  is :-" +(x*.1)   +  " '/n'discount cost is :- " + (.1*x*100)+ "total quantity withount discount is :- " +x*100  );       
       }


       else{ 
        System.out.println("no sescount");
    }
        
    }
    
}
