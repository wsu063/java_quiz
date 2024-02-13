package ch04;

import java.util.Scanner;

public class quiz09 {
    public static void main(String[] args) {
        int answer = (int)(Math.random() * 100) + 1; // 1~100
        int input = 0;
        int count = 0;

        Scanner scanner = new Scanner(System.in);

        do {
            count++;
            System.out.println("1과 100사이의 값을 입력하세요");
            input = scanner.nextInt();
            if(input < answer) {
                System.out.println("더 큰 수를 입력하세요.");
            } else if(input > answer) {
                System.out.println("더 작은 수를 입력하세요.");
            } else {
                    System.out.println(count);
                    break;
            }

        } while(true);
    }
}
