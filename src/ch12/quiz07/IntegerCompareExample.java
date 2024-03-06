package ch12.quiz07;

public class IntegerCompareExample {
    public static void main(String[] args) {
        Integer obj1 = 100;
        Integer obj2 = 100;
        Integer obj3 = 300;
        Integer obj4 = 300;

        System.out.println(obj1.equals(obj2)); // true
        System.out.println(obj3.equals(obj4)); // false
        // 밑에꺼가 false가 나왔던 이유는 Integer타입의 값이 -128 ~ 127이여서
        // 범위 밖을 벗어나서 값 비교가 안된다.
    }
}
