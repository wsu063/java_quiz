package ch12.quiz04;

import java.nio.charset.StandardCharsets;

public class DecodingExample {
    public static void main(String[] args) {
        byte[] bytes = {-20, -107, -120, -21, -123, -107};
        String str = new String(bytes);
        System.out.println("str: " + str);

    }
}
