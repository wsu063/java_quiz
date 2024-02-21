package ch06.quizBonus;

public class Customer {
    String name;
    String phoneNum;
    String addr;
    int point;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public Customer(String name, String phoneNum, String addr, int point) {
        this.name = name;
        this.phoneNum = phoneNum;
        this.addr = addr;
        this.point = point;
    }
}
