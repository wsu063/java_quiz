package ch03;

import java.util.Scanner;

public class quiz09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("입력: ");
        var num = scanner.nextInt();
        System.out.println((num > 0) ? "양수" : ((num == 0) ? "0" : "음수"));
    }
}
