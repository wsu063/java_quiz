package ch15.quiz08;

import java.util.HashSet;
import java.util.Set;

public class Student {
    public int studentNum;
    public String name;
    public Student (int studentNum, String name) {
        this.studentNum = studentNum;
        this.name = name;
    }
    //여기에 코드를 작성하세요.


    @Override
    public int hashCode() {
        return studentNum;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Student student) { // student 객체일때 학번비교
            return studentNum == student.studentNum;
        } else { // student객체가 아니면 false
            return false;
        }
    }
}
