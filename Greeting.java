import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        System.out.println("Enter the name");
        String name = input.nextLine();
        System.out.println("Hello "+ name + "!. Welcome to the Party");
    }
}
