import java.util.Scanner;
class StudentData{
	public static void main(String args []){
	Scanner s=new Scanner(System.in);
	System.out.println("Enter your name :- ");
	String name = s.nextLine();
	System.out.println("Enter your UID :-");
	String uid = s.nextLine();
	System.out.println("what is your intrest  :-");
	String intrest = s.nextLine();
System.out.println("My name is:-" +name+ "\n My UID is :-" +uid+ "\n My intrest are "+intrest);
	}
	 
}