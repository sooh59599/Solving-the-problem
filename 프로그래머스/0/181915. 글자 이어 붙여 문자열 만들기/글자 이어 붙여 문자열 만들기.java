class Solution {
    public String solution(String my_string, int[] index_list) {
        StringBuilder answer = new StringBuilder();
        char[] charArray = my_string.toCharArray();
        for (int j : index_list) {
            answer.append(charArray[j]);
        }
        return answer.toString();
    }
}