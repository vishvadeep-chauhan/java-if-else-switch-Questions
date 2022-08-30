// A school has following rules for grading system:
// a. Below 25 - F
// b. 25 to 45 - E
// c. 45 to 50 - D
// d. 50 to 60 - C
// e. 60 to 80 - B
// f. Above 80 - A
// Ask user to enter marks and print the corresponding grade.

import java.util.Scanner;

public class School_grading_system {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println(" enter number ");

        int num = s.nextInt();
        if (num < 25) {
            System.out.println("gread is F");
        }

        else if ((num>=25)&&(num<45)){
            System.out.println("grade is :- E");
        }

        else if ((num>=45)&&(num<50)){
            System.out.println("grade is :- D");
        }

        else if ((num>=50)&&(num<60)){
            System.out.println("grade is :- C");
        }

        else if ((num>=60)&&(num<80)){
            System.out.println("grade is :- B");
        }

        else if ((num>=80)&&(num<100)){
            System.out.println("grade is :- B");
        }


        else{
            System.out.println("not valid num");
        }

    }
}
