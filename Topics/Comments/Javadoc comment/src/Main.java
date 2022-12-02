import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word1 = scanner.nextLine(); // "This"
        String line1 = scanner.nextLine(); // " is a simple"
        String word2 = scanner.next(); // "multiline"
        String word3 = scanner.next(); // "input,"
        String line2 = scanner.nextLine(); // ""
        System.out.println(word1);
        System.out.println(line1);
        System.out.println(word2);
        System.out.println(word3);
        System.out.println(line2);


    }
}