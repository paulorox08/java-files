import java.util.Scanner;

public class SwitchVersion {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose an option:\n" +
        "1. Windows\n" +
        "2. MacOS\n" +
        "3. Linux");

        int selection = sc.nextInt();

        System.out.print("You prefer ");

        switch (selection) {
            case 1:
                System.out.print("windows");
                break;
            case 2:
                System.out.print("macOS");
                break;
            case 3:
                System.out.print("linux");
            default:
                break;
        }

        System.out.print(". That is a really good OS.");
        sc.close();
    }
}