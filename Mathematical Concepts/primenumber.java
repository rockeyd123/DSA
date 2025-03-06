// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the input: ");
        int n = scan.nextInt();
        int i,x;
        for(i=2;i<=n;i++)
        {
            int flag =0;
            for(x=2;x<i;x++)
            {
                if(i%x==0)
                {
                    flag =1;
                }
            }
            if(flag==0)
            {
                System.out.println(i);
            }
        }
    }
}
