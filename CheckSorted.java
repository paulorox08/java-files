import java.util.Scanner;

public class CheckSorted {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int[] values = new int[4];

        for (int i = 0; i < 4; i++) {
            System.out.print("Enter number " + (i + 1) + " : ");
            values[i] = sc.nextInt();
        }

        int counter = 0;

        for (int x = 0; x < 3; x++) {
            if (values[x] < values[x+1] || values[x] == values[x+1]) {
                counter++;
            }
        }

        if (counter == 3) {
            System.out.print("Sorted");
        }
        else {
            System.out.print("Unsorted");
        }

        sc.close();
    }
}
