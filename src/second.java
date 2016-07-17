import java.io.BufferedReader;
import java.io.InputStreamReader;

public class second {
    public static void main(String[] args) {
        int counter = 0, inputNumber = 0;
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);
        System.out.println("Enter the value of n: ");
        try {
            inputNumber = Integer.parseInt(br.readLine());
            for (counter = 0; counter < inputNumber; counter++) {
                System.out.print("*");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}
