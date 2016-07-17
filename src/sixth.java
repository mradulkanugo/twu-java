import java.io.BufferedReader;
import java.io.InputStreamReader;

public class sixth {
    static int starCount = 1;

    public void drawPattern(int inputNumber, int counter) {
        int positionCounter = 0;
        for (positionCounter = 0; positionCounter < inputNumber - counter; positionCounter++) {
            System.out.print(" ");
        }
        for (positionCounter = 0; positionCounter < starCount; positionCounter++) {
            System.out.print("*");
        }
        starCount += 2;
    }
    public void drawReversePattern(int inputNumber, int counter) {
        starCount -= 2;
        int positionCounter = 0;
        for (positionCounter = 0; positionCounter < inputNumber - counter; positionCounter++) {
            System.out.print(" ");
        }
        for (positionCounter = 0; positionCounter < starCount; positionCounter++) {
            System.out.print("*");
        }

    }

    public static void main(String[] args) {
        sixth instanceOfClassSixth = new sixth();
        int counter = 0, inputNumber = 0;
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);
        System.out.println("Enter the value of n: ");
        try {
            inputNumber = Integer.parseInt(br.readLine());
            for (counter = 1; counter <= inputNumber; counter++) {
                instanceOfClassSixth.drawPattern(inputNumber, counter);
                System.out.println();
            }
            starCount-=2;
            for (counter = inputNumber-1; counter > 0; counter--) {
                instanceOfClassSixth.drawReversePattern(inputNumber, counter);
                System.out.println();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}

