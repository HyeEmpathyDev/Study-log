import java.util.*;

class Solution {
    public int solution(int[] queue1, int[] queue2) {
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();

        long sum1 = 0, sum2 = 0;

        for (int num : queue1) {
            q1.offer(num);
            sum1 += num;
        }

        for (int num : queue2) {
            q2.offer(num);
            sum2 += num;
        }

        int maxCount = queue1.length * 3;
        int count = 0;

        while (count <= maxCount) {
            if (sum1 == sum2) {
                return count;
            }

            if (sum1 > sum2) {
                int num = q1.poll();
                sum1 -= num;
                sum2 += num;
                q2.offer(num);
            } else {
                int num = q2.poll();
                sum2 -= num;
                sum1 += num;
                q1.offer(num);
            }

            count++;
        }

        return -1;
    }
}
