package ch04;

public class quiz07 {
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 1;
        int num3 = 0;
        for(int i = 3; i <= 10; i++) {
            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
            System.out.println("피보나치수열의 " + i + "번째 수= " + num3);
        }
    }
}
