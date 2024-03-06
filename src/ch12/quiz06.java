package ch12;

import java.util.StringTokenizer;

public class quiz06 {
    public static void main(String[] args) {
        String str = "아이디, 이름, 패스워드";
        StringTokenizer token = new StringTokenizer(str, ", ");
        while(token.hasMoreTokens())
            System.out.println(token.nextToken());
        }
    }

