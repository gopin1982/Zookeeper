import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String cityName = scanner.nextLine();
        Boolean result = cityName.endsWith("burg") ? true : false;
        System.out.println(result);
    }
}