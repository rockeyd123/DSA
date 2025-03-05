// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i;
        System.out.println("Enter x: ");
        int x = scan.nextInt();
        System.out.println("Enter y: ");
        int y = scan.nextInt();
        
        for(i=1;i<=y;i++)
        {
            System.out.println(x);
        }
    }
}
