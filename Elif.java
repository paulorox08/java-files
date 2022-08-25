import java.util.Scanner;

public class Elif {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Hello, what would you like to order?\n" +
                            "1. Fried chicken\n" +
                            "2. Chicken kiev\n" +
                            "3. Chicken schnitzel");
        
        int selection = sc.nextInt();

        System.out.print("You selected the ");

        if (selection == 1) {
            System.out.print("fried chicken");
        }
        else if (selection == 2) {
            System.out.print("chicken kiev");
        }
        else if (selection == 3) {
            System.out.print("chicken schnitzel");
        }
        else {
            System.out.print("secret mystery");
        }

        System.out.print(". Thank you for your order.");
    
        sc.close();
    }

}
