package ch06;

public class quiz21 {
    static int max(int[] arr) {
        if(arr == null || arr.length == 0) return -999999;
        int maxi = arr[0];
        for(int arrs : arr) {
            if(maxi < arrs) maxi = arrs;
        }
        return maxi;
    }
    public static void main(String[] args) {
        int[] data = { 3, 2, 9, 4, 7 };
        System.out.println(java.util.Arrays.toString(data));
        System.out.println("최대값:" + max(data));
        System.out.println("최대값:" + max(null));

        // 크기가 0인 배열
        System.out.println("최대값:" + max(new int[] {}));
    }

}
