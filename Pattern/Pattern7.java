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
            for(j=i;j>0;j--)
            {
                System.out.print(j);
            }
            System.out.println();
        }
        
    }
}
