package ch03;

public class quiz13 {
    public static void main(String[] args) {
        char ch = 'A';
        char lowerCase = (char) (ch < 97 ? ch + 32 : ch);
        System.out.println("ch:"+ch);
        System.out.println("ch to lowerCase:"+lowerCase);

    }
}
