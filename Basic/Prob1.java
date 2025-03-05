// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a integer:");
        int a = scan.nextInt();
        System.out.print("Enter a string:");
        String s = scan.next();
        System.out.print("Enter a character:");
        char ch = scan.next().charAt(0);
        
        System.out.println(a);
        System.out.println(s);
        System.out.println(ch);
        
        scan.close();
        
        
    }
}
