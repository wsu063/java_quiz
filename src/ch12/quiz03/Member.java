package ch12.quiz03;

public class Member {
    private String id;
    private String name;

    public Member(String id, String name) {
        this.id = id;
        this.name = name;
    }

    //여기에 코드를 작성하세요.

    @Override
    public String toString() {
        return this.name;
    }
}
