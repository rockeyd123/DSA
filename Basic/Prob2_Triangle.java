// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int angle = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter angle A:");
        int A = scan.nextInt();
        System.out.print("Enter angle B:");
        int B = scan.nextInt();
        System.out.print("Enter angle C:");
        int C = scan.nextInt();
        angle = A+B+C;
        if(angle == 180)
        {
            System.out.println("Triangle can be formed");
        }
        else
        {
            System.out.println("Triangle can't be formed");
        }
    }
}
