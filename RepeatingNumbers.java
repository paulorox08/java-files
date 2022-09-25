public class RepeatingNumbers {

    public static void main(String[] args) {

        int[] testArray = {0, 1, 2, 3, 4, 5, 6, 11, 0};

        int repeatingNumber = findRepeating(testArray);

        if (repeatingNumber == -1) {
            System.out.println("There are no repeating numbers");
        }
        else {
            System.out.println("The repeating number is " + repeatingNumber);
        }
    }

    public static int findRepeating(int[] data) {

        int boundary = 0;
        while (boundary < data.length - 1) {
            int current = data[boundary];
            int smallest = data[boundary];

            for (int after = boundary + 1; after < data.length; after ++) {
                if (data[after] < smallest) {
                    smallest = data[after];
                }
            }

            int index = 0;
            for (int m: data) {
                if (m == smallest && index >= boundary) {
                    break;
                }
                else {
                    index ++;
                }
            }

            data[boundary] = smallest;
            data[index] = current;

            boundary ++;
        }

        int repeater = -1;

        for (int p = 0; p < data.length - 1; p ++) {
            if (data[p] == data [p + 1]) {
                repeater = data[p];
            }
        }

        return repeater;
    }
    
}
