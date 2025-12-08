
import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int solution(int[] queue1, int[] queue2) {
        int answer = -2;

        long sum1 = 0;
        long sum2 = 0;

        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        for (int n : queue1) {
            q1.offer(n);
            sum1 += n;
        }
        for (int n : queue2) {
            q2.offer(n);
            sum2 += n;
        }

        int maxTry = 2 * (q1.size() + q2.size());

        int count = 0;

        while (true) {
            if (q1.isEmpty() || q2.isEmpty() || count > maxTry) {
                break;
            }

            if (sum1 == sum2) {
                break;
            } else if (sum1 > sum2) {
                Integer poll = q1.poll();
                q2.offer(poll);
                sum1 -= poll;
                sum2 += poll;
            } else {
                Integer poll = q2.poll();
                q1.offer(poll);
                sum2 -= poll;
                sum1 += poll;
            }

            count++;
        }

        if (sum1 == sum2) {
            answer = count;
        } else {
            answer = -1;
        }

        return answer;
    }
}