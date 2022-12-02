import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int userValue = scanner.nextInt();
        final int startRange = 0;
        final int endRange = 10;
        Boolean checkValue = userValue > startRange && userValue < endRange;
        System.out.println(checkValue);
    }
}