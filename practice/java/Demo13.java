public class Demo13 {
    public static void main(String[] args) {
        char[] chars = new char[26];
        for(int i = 0; i < 26; i++) {
            chars[i] = (char)('A' + i);
            System.out.println(chars[i]);
        }
    }
}