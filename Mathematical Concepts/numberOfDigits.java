// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the input: ");
        int n = scan.nextInt();
        int count =0;
        while(n>0)
        {
            count++;
            n/=10;
        }
        System.out.println(count);
    }
}
