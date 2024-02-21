package ch06.quiz23;

public class Account {
    private String accountNumber;
    private String owner;
    private int balance;


//    public Account(String accountNumber, String owner, int balance) {
//        this.accountNumber = accountNumber;
//        this.owner = owner;
//        this.balance = balance;
//    } // 선생님 해설. 3개의 변수를 받아서 한번에 생성하는것. 다음번에 이렇게 풀것.

    public String getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public String getOwner() {
        return owner;
    }
    public void setOwner(String owner) {
        this.owner = owner;
    }
    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
}
