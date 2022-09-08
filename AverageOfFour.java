import java.util.Scanner;

public class AverageOfFour {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[] values = new double[4];

        int i = 0;
        while (i < 4) {
            System.out.print("Enter a number: ");
              double number = sc.nextDouble();
              values[i] = number;
              i++;
        }

        double sum = 0;

        for (int x = 0; x < 4; x++) {
            sum = values[x] + sum;
        }

        double average = sum / 4;

        System.out.print("The average is " + average);

        sc.close();
    }
}
