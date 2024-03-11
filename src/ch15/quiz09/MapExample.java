package ch15.quiz09;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class MapExample {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<String,Integer>();
        map.put("blue", 96);
        map.put("hong", 86);
        map.put("white", 92);

        String name = null; //최고 점수를 받은 아이디를 저장하는 변수
        int maxScore = 0; //최고 점수를 저장하는 변수
        int totalScore = 0; //점수 합계를 저장하는 변수

        //여기에 코드를 작성하세요.
        // 순서를 유지하지 않고 저장. 중복 저장 불가능하게
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();

        for (Map.Entry<String, Integer> entry : entrySet) {
            totalScore += entry.getValue();
            // 키: 값
//            System.out.println(entry.getKey() + ": " + entry.getValue());
            if(entry.getValue() > maxScore) {
                name = entry.getKey();
                maxScore = entry.getValue();
            }
        }
//
        System.out.println("평균 점수: " + (totalScore / map.size()));
        System.out.println("최고 점수: " + maxScore);
        System.out.println("최고 점수를 받은 아이디: " + name);
    }
}
