package ch03;

public class quiz13 {
    public static void main(String[] args) {
        char ch = 'A';
        char lowerCase = (char) (ch <= 90 ? ch + 32 : ch); // 대문자면 소문자로
        //'A' = 65, 'Z' = 90, 'a' = 97, 'z' = 122
        System.out.println("ch:"+ch);
        System.out.println("ch to lowerCase:"+lowerCase);
        System.out.println((int)'a' + "z= "+ (int)'z');

    }
}
