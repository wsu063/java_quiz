package ch04;

public class quiz06 {
    public static void main(String[] args) {
        for (int x = 1; x <= 6; x++) {
            for (int y = 1; y <= 6; y++) {
                int sum = x + y;
                if (sum == 6)
                    System.out.println("(" + x + ", " + y + ")");
            }
        }
    }
}
