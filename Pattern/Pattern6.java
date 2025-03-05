// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        int i,j;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = scan.nextInt();
        for(i=n;i>0;i--)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}
