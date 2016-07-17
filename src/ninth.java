import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ninth {

    public int[] generate(int n) {
        int[] output = new int[n];
        int counter = 2, arrayCounter = 0;
        if (n % 2 == 0) {
            while (n % 2 == 0) {

                output[arrayCounter++] = 2;
                n = n / 2;
            }
        }

        for (counter = 3; counter <= Math.sqrt(n); counter = counter + 2) {
            while (n % counter == 0) {
                output[arrayCounter++] = counter;
                n = n / counter;
            }
        }


        if (n > 2)
            output[arrayCounter++] = n;


        output = Arrays.copyOfRange(output, 0, arrayCounter--);
        Arrays.sort(output);
        return output;
    }

    public static void main(String[] args) {
        ninth instanceOfNinthClass = new ninth();
        int[] result = instanceOfNinthClass.generate(30);
        for (int i : result) {
            System.out.println(i);
        }
    }
}
