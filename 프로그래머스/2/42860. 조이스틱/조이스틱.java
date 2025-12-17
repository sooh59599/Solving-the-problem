
class Solution {

    public static void main(String[] args) {
        System.out.println(solution("JEROEN"));
    }

    public static int solution(String name) {
        int answer = 0;
        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            int min = Math.min(ch - 'A', 'Z' - ch + 1);
            answer += min;
        }
        int move = name.length() - 1;
        for(int i = 0; i < name.length(); i++){
            int next = i + 1;

            while(next < name.length() && name.charAt(next) == 'A'){
                next++;
            }
            int move1 = i * 2 + (name.length() - next);
            int move2 = i + 2 *(name.length() - next);

            move = Math.min(move, Math.min(move1,move2));
        }
        return answer + move;
    }
}

