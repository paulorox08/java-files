import java.util.Scanner;

public class SmallestSwap {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] values = new int[n];

        int i = 0;
        while (i < values.length) {
            values[i] = sc.nextInt();
            i ++;
        }

        int smallest = values[0];
        for (int counter = 0; counter < values.length-1; counter ++) {
            if (smallest > values[counter + 1]) {
                smallest = values[counter + 1];
            }
        }

        int index = 0;
        for (int m: values) {
            if (smallest == m) {
                break;
            }
            else {
                index ++;
            }
        }

        int z = values[0];
        values[0] = smallest;
        values[index] = z;

        for (int m: values) {
            System.out.println(m);
        }

        sc.close();

    }
    
}
