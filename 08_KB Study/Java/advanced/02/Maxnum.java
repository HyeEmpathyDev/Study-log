public class Maxnum {
    public static void main(String[] args) {
        int[] array = {1, 5, 3, 8, 2};

        int max = array[0];  // 첫 번째 값을 "가장 큰 값"으로 가정하고 시작

        for (
                int i = 1;
                i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];  // 더 큰 값을 발견하면 max를 업데이트
            }
        }

        System.out.println("최댓값: " + max);
    }
}
