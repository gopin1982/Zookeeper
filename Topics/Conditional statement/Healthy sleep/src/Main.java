import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int minHours = scanner.nextInt();
        int maxHours = scanner.nextInt();
        int sleptHours = scanner.nextInt();
        if (sleptHours < minHours) {
            System.out.println("Deficiency");
        } else if (sleptHours > maxHours) {
            System.out.println("Excess");
        } else {
            System.out.println("Normal");
        }
    }
}