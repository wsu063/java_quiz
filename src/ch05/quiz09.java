package ch05;

public class quiz09 {
    public static void main(String[] args) {
        int[][] array = {
                {95, 86},
                {83, 92, 96},
                {78, 83, 93, 87, 88}
        };
        int sum = 0;
        int total = 0;
        double avg = 0;
        for (int i = 0; i < array.length; i++) {
            total += array[i].length;
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
        }
        avg = (double) sum / total;
        System.out.println("전체 합: " + sum + ", 평균: " + avg);

    }

}
