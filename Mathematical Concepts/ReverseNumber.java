// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the input: ");
        int n = scan.nextInt();
        int reverse = 0,ld;
        if(n>=10){
        while(n>0)
        {
            ld = n%10;
            reverse = reverse*10+ld;
            n/=10;
        }
        System.out.println(reverse);
        }
        else
        {
            System.out.println(n);
        }
    }
}
