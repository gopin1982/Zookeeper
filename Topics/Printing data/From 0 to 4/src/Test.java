public class Test {
    public static void main(String[] args) {
        long bigNum = 100_000_000_000_000L;
        System.out.println(bigNum);
        int n = (int) bigNum; // 276447232
        System.out.println(n);
    }
}
