import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String strValue = scanner.next();
        int startVal = scanner.nextInt();
        int endVal = scanner.nextInt();
        String modValue = strValue.substring(startVal,endVal+1);
        System.out.println(modValue);
    }
}