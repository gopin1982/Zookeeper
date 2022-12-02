import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int userInput = scanner.nextInt();
        final int lowestValue = -15;
        final int rangeValue1 = 12;
        final int rangeValue2 = 14;
        final int rangeValue3 = 17;
        final int highestValue = 19;
        if (userInput > lowestValue && userInput <= rangeValue1) {
            System.out.println("True");
        }  else if (userInput > rangeValue2 && userInput < rangeValue3) {
            System.out.println("True");
        }  else if (userInput >= highestValue) {
            System.out.println("True");
        }  else {
            System.out.println("False");
        }
    }
}