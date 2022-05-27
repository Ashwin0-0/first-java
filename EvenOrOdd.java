import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = input.nextInt();
        if(a%2 == 0){
            System.out.println("It is even number");
        }
        else{
            System.out.println("It is odd number");
        }
    }
}
