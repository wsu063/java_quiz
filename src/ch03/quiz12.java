package ch03;

public class quiz12 {
    public static void main(String[] args) {
        char ch = 'z';
        boolean b = ('a' <= ch && ch <= 'z') || (('A' <= ch && ch <= 'Z') ? true : false )|| ('0' <= ch && ch <= '9');
        System.out.println(b);

    }
}
