import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int a = sc.nextInt();

        System.out.print("Enter a double: ");
        double b = sc.nextDouble();

        var c = a + b;
        System.out.println(a + " + " + b + " = " + c);
        
        sc.close();
    }
}