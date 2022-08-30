// find number even or odd


import java.util.Scanner;

public class evenodd {
    // public static void main(String[] args) {
    //     Scanner s=new Scanner(System.in);
    //     int x = s.nextInt();

    //     int i = x%2;


    //     if ( i==0 ) {
    //         System.out.println("even");
            
    //     }
    //     else{
    //         System.out.println("odd");
    //     } 




    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int x = s.nextInt();
        int i = x&1;  // binary 
        if ( i==0 ) {
            System.out.println("even");
            
        }
        else{
            System.out.println("odd");
        } 








    }
}
