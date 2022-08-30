
import java.util.*;

public class ReadKeyboard
 {
	  public static void main(String[] args)
	
	 { 

        	try (Scanner sc = new Scanner(System.in)) {
				sc.useRadix(2);
				int x=sc.nextInt();
				System.out.println(x);
			}
    }
    
}