import java.util.Scanner;

public class swaping {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        System.out.println("enter the x value :-");
        double x = s.nextDouble();

        System.out.println("enter the y value :-");
        double y = s.nextDouble();

        x = y-x ;
        y = y+x ;
        y = y-x ;

        System.out.println("swaping number is x :-" +x  + "swaping number is y :-" +y  );
    }
}
