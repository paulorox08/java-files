
import java.util.Arrays;

public class FinalSelectionSort {
    public static void main(String[] args) {
        int[] data = {-676, 122, 32, 7867, 2345, 112, -435, 344, 0, 39005, 122, 234, -11, 2, 77};

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
            
            
            if (data[index] != smallest) {
                System.out.println(Arrays.toString(data));
            }

            boundary ++ ;
        }

    }
    
}
