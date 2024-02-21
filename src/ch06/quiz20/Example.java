package ch06.quiz20;

public class Example {

    static boolean isNumber(String str) {
          for(int i =0; i < str.length(); i++) {
              if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                  continue;
              }
              else return false;
          }

          return str.isEmpty() ? false : true;
    }
    public static void main(String[] args) {
        String str = "123";
        System.out.println(str + "는 숫자입니까? " + isNumber(str));
        str = "1234o";
        System.out.println(str + "는 숫자입니까? " + isNumber(str));
    }

}
