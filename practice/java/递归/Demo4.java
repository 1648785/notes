public class Demo4 {
    public static void main(String[] args) {
        T t = new T();
        t.move(2,'a','b','c');
    }
}
class T {
    public void move(int num, char a, char b, char c) {
        if(num == 1) {
            System.out.println(a + "->" + c);
        } else {
            move(num - 1, a, c, b);
            System.out.println(a + "->" + c);
            move(num - 1, b, a, c);
        }
    }
}