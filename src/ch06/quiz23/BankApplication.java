package ch06.quiz23;

import java.util.Scanner;

public class BankApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Account[] account = new Account[100];
        int ctr = 0;
        String input;
        boolean run = true;
        do {
            System.out.println("------------------------------------------------");
            System.out.println("1. 계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
            System.out.println("------------------------------------------------");
            System.out.print("선택>");
            input = scanner.nextLine();
            switch (input) {
                case "1":
                    account[ctr] = new Account();
                    System.out.println("-----------");
                    System.out.println("계좌생성");
                    System.out.println("-----------");
                    System.out.print("계좌번호: ");
                    input = scanner.nextLine();
                    account[ctr].setAccountNumber(input);
                    System.out.print("계좌주: ");
                    input = scanner.nextLine();
                    account[ctr].setOwner(input);
                    System.out.print("초기입금액: ");
                    input = scanner.nextLine();
                    account[ctr].setBalance(Integer.parseInt(input));
                    System.out.println("결과: 계좌가 생성되었습니다.");
                    ctr++;
                    break;
                case "2":
                    System.out.println("-----------");
                    System.out.println("계좌목록");
                    System.out.println("-----------");
                    for (int i = 0; i < ctr; i++) {
                        System.out.println(account[i].getAccountNumber() + "\t"
                                + account[i].getOwner() + "\t" + account[i].getBalance());
                    }
                    break;
                case "3":
                    System.out.println("-----------");
                    System.out.println("예금");
                    System.out.println("-----------");
                    System.out.print("계좌번호: ");
                    input = scanner.nextLine();
                    for (int i = 0; i <= ctr; i++) {
                        String chk = account[i].getAccountNumber();
                        if (chk.equals(input)) {
                            System.out.print("예금액: ");
                            input = scanner.nextLine();
                            account[i].setBalance(account[i].getBalance() + Integer.parseInt(input));
                            break;
                        }
                    }
                    break;
                case "4":
                    System.out.println("-----------");
                    System.out.println("출금");
                    System.out.println("-----------");
                    System.out.print("계좌번호: ");
                    input = scanner.nextLine();
                    for (int i = 0; i <= ctr; i++) {
                        String chk = account[i].getAccountNumber();
                        if (chk.equals(input)) {
                            System.out.print("출금액: ");
                            input = scanner.nextLine();
                            account[i].setBalance(account[i].getBalance() - Integer.parseInt(input));
                            System.out.println("결과: 출금이 성공되었습니다.");
                            break;
                        }
                    }
                    break;
                case "5":
                    run = false;
                    break;
                default:
                    System.out.println("값을 잘못 입력했습니다. 다시 입력해주세요.");
                    break;
            }
        } while (run);

        System.out.println("프로그램 종료");

    }
}
