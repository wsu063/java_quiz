package ch04;

public class quiz02 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i < 10; i++) {
            if ((i%3) != 0) continue;
            sum += i;
        }
        System.out.println("3의 배수의 합: " + sum);
    }
}
