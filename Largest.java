import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 2 values");
        int a = input.nextInt();
        int b = input.nextInt();
        if(a>b){
            System.out.println(a + " is greater than " + b);
        }else{
            System.out.println(b + " is greater than " + a);
        }
    }
}
