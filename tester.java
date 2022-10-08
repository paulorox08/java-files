import java.util.Arrays;

public class tester {

    public static void main(String[] args) {

        int[] data = {1,2,3,4,5,6};

        int indexToRemove = 4;
        
        for (int i: data) {
            if (i == 4) {
                i = 6;
                break;
            }
        }

        System.out.print(Arrays.toString(data));

        

    }
    
}
