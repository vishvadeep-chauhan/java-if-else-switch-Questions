
// A student will not be allowed to sit in exam if his/her attendence is less than 75%.
// Take following input from user
// Number of classes held
// Number of classes attended.
// And print
// percentage of class attended
// Is student is allowed to sit in exam or not.



//  Modify the above question to allow student to sit 
// if he/she has medical cause. Ask user 
// if he/she has medical cause or not ( 'Y' or 'N' ) and print accordingly.



// import java.util.Scanner;

// public class exam {
//     public static void main(String[] args) {
//         Scanner s=new Scanner(System.in);
//         System.out.println("enter number of class held:-");
//         int x=s.nextInt();
//         System.out.println("enter number of class attended:-");
//         int y=s.nextInt();
//         float z=((float)y/(float)x)*100;
//         System.out.println("percentage of class is attended:-" +z );

//         System.out.println("you have madical type y");
//         // boolean a = s.nextBoolean();
//         char a = s.next().charAt(0);


//         if (a=='y') {
//             System.out.println("you can give exam ");
            
//         }
//         else if (z<75) {
//             System.out.println("you are not allowed to sit in exam ");
            
//         }
       

//         else {
//             System.out.println("you are allowed to sit in exam  ");
//         }

//     }
// }



import java.util.*;

public class exam
{
	public static void main(String[] args) {
	    Scanner scan=new Scanner(System.in);
		System.out.println("Enter the total number of classes-: ");
		int total_classes=scan.nextInt();
		System.out.println("Enter the total number of classes you attended-: ");
		int attended_classes=scan.nextInt();
		
		float percentage=(float)((float)attended_classes/(float)total_classes)*100;
		
		    System.out.println("Do you have any medical issue (Press Y for Yes and N for no)");
		    scan.nextLine();
		    String res=scan.nextLine();
		    if(res.equals("Y")||res.equals("y"))
		    {
		        System.out.println("you can give exam due to medical issue");
		    }
		    else if(percentage>75)
		    {
		        System.out.println("You can give the exam:):)");
		    }
		    
            else
		    {
                System.out.println("Soory you cannot give exam, your attendence is -: "+percentage);
            }
           
		
		
	}
}