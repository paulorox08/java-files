import java.util.Arrays;

public class bubbleSort {

    public static void main(String[] args) {

        int[] data = {45, 93, 33, 55};

        boolean condition = true;

        outerloop:
            while (condition == true) {

                int counter = 0;

                for (int i = 0; i < data.length - 1; i++) {
                    if (data[i] < data[i + 1]) {
                        counter ++;
                    }
                    else {
                        break;
                    }
                }
                
                if (counter == data.length -1) {
                    break outerloop;
                }
                
                for (int x = 0; x < data.length -1; x ++) {
                    if (data[x] > data[x + 1]) {
                        int bigger  = data[x];
                        data[x] = data[x + 1];
                        data[x + 1] = bigger;
                    }
                }
                
            }

            System.out.print(Arrays.toString(data));
    }
}
