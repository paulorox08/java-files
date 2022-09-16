import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {

        int[] data = {23, 45, 66, 12, 87, 19};

        boolean condition;

        if (data.length < 1) {      //test to see if array is empty
            condition = false;
        }
        else {
            condition = true;
        }

        outerloop:
            while (condition == true) {    

                int counter = 0;

                for (int i = 0; i < data.length - 1; i++) {
                    if (data[i] < data[i + 1] || data[i] == data[i + 1]) {  //test to see if adjacent numbers are already sorted or the same
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
