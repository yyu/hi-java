public class Main {
    public static void main(String[] args) {
        String s = "bar";

        byte[] bytes = s.getBytes();

        System.out.println("bytes:");
        for (byte b : bytes) {
            System.out.println(b);
        }

        char[] chars = new char[3];
        s.getChars(0, 3, chars, 0);
        System.out.println("chars:");
        for (char ch : chars) {
            System.out.println(ch);
        }
    }
}
