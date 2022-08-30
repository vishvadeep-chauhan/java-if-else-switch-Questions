import java.util.Scanner;
class UserInput {
	public static void main (String args[]){
	Scanner s = new Scanner(System.in);
	
	String name ;
	System.out.println("may i know your name ");
	name = s.nextLine();
	System.out.println("wellcome mr " + name ) ;
	}


}