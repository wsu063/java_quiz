package ch03;

public class quiz03 {
    public static void main(String[] args) {
        int pencils = 534;
        int students = 30; //학생 한 명이 가지는 연필 수
        int pencilsPerStudent = (pencils / students); // 534 / 30 = 17
        System.out.println(pencilsPerStudent);

        int pencilsLeft = pencils % 30; // 24
        System.out.println(pencilsLeft);//남은 연필 수


    }
}
