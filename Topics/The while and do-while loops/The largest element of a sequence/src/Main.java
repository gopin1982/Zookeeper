import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int userInput;
        int maxInput = 0;
        do {
            userInput = scanner.nextInt();
            maxInput = userInput > maxInput ? userInput : maxInput;
        } while (userInput != 0);
        System.out.println(maxInput);
    }
}