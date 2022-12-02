import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int count = 0;
        int userInput = scanner.nextInt();
        while (userInput != 0) {
            count++;
            userInput = scanner.nextInt();
        }
        System.out.println(count);
    }
}