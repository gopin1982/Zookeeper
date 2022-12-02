import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        final int startYear = 1900;
        final int endYear = 3000;
        int userYear = scanner.nextInt();
        if (userYear >= startYear && userYear <= endYear) {
            if (userYear % 400 == 0 || userYear % 4 == 0 && userYear % 100 != 0) {
                System.out.println("Leap");
            } else {
                System.out.println("Regular");
            }
        }
    }
}