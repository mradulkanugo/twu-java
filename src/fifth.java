import java.io.BufferedReader;
import java.io.InputStreamReader;

public class fifth{
    static int starCount =1;
    public void drawPattern(int inputNumber, int counter) {
        int positionCounter = 0;
        for (positionCounter = 0; positionCounter < inputNumber - counter; positionCounter++) {
            System.out.print(" ");
        }
        for (positionCounter = 0; positionCounter <starCount ; positionCounter++) {
            System.out.print("*");
        }
        starCount+=2;
    }

    public static void main(String[] args) {
        fifth instanceOfClassFifth= new fifth();
        int counter = 0, inputNumber = 0;
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);
        System.out.println("Enter the value of n: ");
        try {
            inputNumber = Integer.parseInt(br.readLine());
            for (counter = 1; counter <= inputNumber; counter++) {
                instanceOfClassFifth.drawPattern(inputNumber,counter);
                System.out.println();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}

