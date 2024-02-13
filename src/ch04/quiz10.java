package ch04;

import java.util.Scanner;

public class quiz10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        int balance = 0;
        do {
            System.out.println("-------------------------------");
            System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
            System.out.println("-------------------------------");
            System.out.print("선택>");
            input = scanner.nextLine();
            switch(input) {
                case "1" -> {
                    System.out.print("예금액 > ");
                    input = scanner.nextLine();
                    balance += Integer.parseInt(input);
                    break;
                }
                case "2" -> {
                    System.out.print("출금액 > ");
                    input = scanner.nextLine();
                    balance -= Integer.parseInt(input);
                    break;
                }
                case "3" -> {
                    System.out.println("잔고 > " + balance);
                    break;
                }
                case "4" -> {
                    break;
                }
                default -> {
                    System.out.println("잘못된 입력입니다");
                    break;
                }

            }

        }while(!input.equals("4"));
        System.out.println("\n프로그램 종료");
    }

}
