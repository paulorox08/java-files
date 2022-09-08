import java.util.Arrays;

public class ShiftLeft {
    public static int[] moveLeft(int[] numbers) {

        int holder = numbers[0];

        for (int i = 0; i < 3; i++) {
            numbers[i] = numbers[i + 1];
        }

        numbers[3] = holder;

        return numbers;
    }

    public static void main(String[] args) {
        int[] numbers = {1,2,3,4};
        System.out.println("Initially the array was: " + Arrays.toString(numbers));
        System.out.println("After calling shiftLeft method, the array is: " + Arrays.toString(moveLeft(numbers)));
    }
    
}
