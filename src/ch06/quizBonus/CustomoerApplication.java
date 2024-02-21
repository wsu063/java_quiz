package ch06.quizBonus;

import java.util.Scanner;

public class CustomoerApplication {
    private static Scanner scanner = new Scanner(System.in);
    private static Customer[] customer = new Customer[50];

    public static void main(String[] args) {
        boolean run = true;

        int select;

        while (run) {
            System.out.println("------------------------------------------------------------------------");
            System.out.println("1. 고객 등록 | 2. 고객 리스트 | 3. 포인트 사용 | 4. 포인트 적립 | 5. 프로그램 종료");
            System.out.println("------------------------------------------------------------------------");
            System.out.print("선택 > ");
            select = scanner.nextInt();
            switch (select) {
                case 1:
                    //고객 등록
                    registCustomer();
                    break;
                case 2:
                    //모든 고객 리스트 확인
                    checkCustomer();
                    break;
                case 3:
                    //포인트 사용(500점 이상)
                    usePoint();
                    break;
                case 4:
                    //포인트 적립
                    stackPoint();
                    break;
                case 5:
                    //프로그램 종료
                    run = false;
                    break;
            }

        }
        System.out.println("프로그램 종료");

    }
    private static void registCustomer() {
        System.out.println("--------");
        System.out.println("고객 등록");
        System.out.println("--------");
        System.out.print("고객명: ");
        String name = scanner.next();
        System.out.print("핸드폰 번호: ");
        String phoneNum = scanner.next();
        System.out.print("집주소: ");
        String addr = scanner.next();
        System.out.print("포인트: ");
        int point = scanner.nextInt();
        Customer newCustomer = new Customer(name, phoneNum, addr, point);
        for(int i = 0; i < customer.length; i++){
            if(findCustomer(phoneNum) != null) {
                System.out.println("등록 실패! 이미 있는 번호입니다.");
                break;
            } else if(customer[i] == null){
                customer[i] = newCustomer;
                System.out.println("등록 성공! 새로운 고객이 등록되었습니다.");
                break;
            }
        }
    }
    private static void checkCustomer() {
        System.out.println("-------------------");
        System.out.println("모든 고객 리스트 확인");
        System.out.println("-------------------");
        for (int i = 0; i < customer.length; i++) {
            if(customer[i] == null) {
                break;
            } else {
                System.out.println(customer[i].getName() + "\t" + customer[i].getPhoneNum() + "\t"
                        + customer[i].getPoint());
            }
        }
    }

    private static void usePoint() {
        System.out.println("----------");
        System.out.println("포인트 사용");
        System.out.println("----------");
        System.out.print("고객의 핸드폰 번호:  ");
        String num = scanner.next();
        Customer point = findCustomer(num);
        int now = point.getPoint();
        if(point.getPoint() < 500){
            System.out.println("포인트는 500점 이상부터 사용 가능합니다.");
            return;
        } else {
            System.out.print("사용할 포인트 입력: ");
            int use = scanner.nextInt();
            if(use > now) {
                System.out.println("포인트가 부족합니다.");
            } else {
                point.setPoint(now - use);
                System.out.println("포인트 사용 완료");
            }
        }
    }
    private static void stackPoint() {
        System.out.println("---------");
        System.out.println("포인트 적립");
        System.out.println("---------");
        System.out.print("적립할 고객의 핸드폰 번호: ");
        String num = scanner.next();
        Customer sp = findCustomer(num);
        System.out.print("적립할 포인트: ");
        int stack = scanner.nextInt();
        if(stack >= 2000){
            stack *= 1.1; // 손실발생가능성
            System.out.println("2000점 이상 적립했으므로 10% 더 적립됩니다.");
        }
        int now = sp.getPoint();
        sp.setPoint(now + stack);
        System.out.println("적립 완료!");
    }
    private static Customer findCustomer(String phoneNum) {
        Customer ret = null;
        for (int i = 0; i < customer.length; i++) {
            if(customer[i] == null){
                break;
            } else if((customer[i].getPhoneNum()).equals(phoneNum)) {
                ret = customer[i];
            }
        }
        return ret;
    }
}
