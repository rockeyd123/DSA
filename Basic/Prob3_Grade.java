// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Mark of the student");
        int grade = scan.nextInt();
        
        if(grade >= 90)
        {
            System.out.println("GRADE A");
        }
        else if(grade >= 80)
        {
            System.out.println("GRADE B");
        }
        else if(grade >= 60)
        {
            System.out.println("GRADE C");
        }
        else if(grade >= 35)
        {
            System.out.println("GRADE D");
        }
        else
        {
            System.out.println("FAIL");
        }
    }
}
