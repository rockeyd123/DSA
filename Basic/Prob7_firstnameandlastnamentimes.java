// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        int i;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter First Name: ");
        String firstName = scan.next();
        System.out.println("Enter Last Name: ");
        String lastName = scan.next();
        System.out.println("Enter n: ");
        int n = scan.nextInt();
        String fullName = firstName + lastName;
        for(i=1;i<=n;i++)
        {
            System.out.println(fullName);
        }
        
    }
}
