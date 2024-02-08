package ch03;

public class quiz01 {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        int z = (++x) + (y--); // z = 11 + 20 = 31
        System.out.println(z); // 31

    }
}