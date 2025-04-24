public class SumFrom1To100sample{
    public static void main(String[] args) {
        int sum = 0;
        for(int i=1; i<=100; i++) {
            sum += i;  // i를 누적
                   }
        System.out.print("1~100 합 :" + sum);
    }
}

