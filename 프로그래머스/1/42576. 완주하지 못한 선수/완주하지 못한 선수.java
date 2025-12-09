import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Arrays.sort(participant);
        Arrays.sort(completion);

        for (int i = 0; i < completion.length; i++) {
            if (!participant[i].equals(completion[i])) {
                answer += participant[i];
                return participant[i];
            }
        }
        
        return participant[participant.length-1];
    }
}