
public class eighth {
    public void FizzBuzz() {
        int counter = 1;
        String printWord;
        for (counter = 1; counter <= 100; counter++) {
            if (counter % 15 == 0) {
                printWord = "FizzBuzz";
            } else if (counter % 3 == 0) {
                printWord = "Fizz";
            } else if (counter % 5 == 0) {
                printWord = "Buzz";
            } else
                printWord = counter + "";

            System.out.println(printWord);
        }
    }

    public static void main(String[] args) {
        eighth instanceOfClassEighth = new eighth();
        instanceOfClassEighth.FizzBuzz();
    }
}
