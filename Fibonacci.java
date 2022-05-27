import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = 0;
        int b = 1;
        int sum=0;
        System.out.println("Enter the limit for fibonacci series");
        int n = input.nextInt();
        System.out.println(a);
        System.out.println(b);
        for(int i=0; i<=n; i++){
           sum = a+b;
           System.out.println(sum);
           a=b;
           b=sum;
        }
    }
}
