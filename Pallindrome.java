import java.util.Scanner;

public class Pallindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rem, sum=0;
        System.out.println("Enter the number to check");
        int n = input.nextInt();
        int temp = n;
        while(n>0){
            rem = n%10;
            sum = (sum*10)+ rem;
            n=n/10;
        }
        if(sum == temp){
            System.out.println("The given number is pallindrome");
        }else{
            System.out.println("Not pallindrome");
        }
    }
}
