import java.util.Arrays;

class Solution {
    public String solution(int[] numbers) {
        StringBuilder answer = new StringBuilder();
        String[] arr = Arrays.stream(numbers).mapToObj(String::valueOf).toArray(String[]::new);
        Arrays.sort(arr, (a, b) -> (b + a).compareTo(a + b));
        for (String s : arr) {
            answer.append(s);
        }
        if (arr[0].equals("0")) {
            return "0";
        }
        return answer.toString();
    }
}