package ch06.quiz15;

public class MemberService {
    public boolean login(String id, String password) {
      if(id.equals("hong") && password.equals("12345")) {
            return true;
      } else return false;
    }

    public void logout(String id) {
        if(id.equals("hong")) {
            System.out.println(id + "님이 로그아웃 되셨습니다.");
        }
    }
}
