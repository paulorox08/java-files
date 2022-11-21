import java.util.ArrayList;
import java.util.Arrays;

public class Tester {

    public static void main(String[] args) {

        int x = 121;

        String temp = String.valueOf(x);

        int[] array = new int[temp.length()];
        
        for (int i = 0; i < temp.length(); i ++) {
            array[i] = temp.charAt(i) - '0';

        }

        System.out.print(Arrays.toString(array));

    }

}
