import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;

        // 오름차순 정렬
        Arrays.sort(score);

        int length = score.length;

        for (int i = length - m; i >= 0; i -= m) {
            int minScore = score[i];

            int boxPrice = minScore * m;
            answer += boxPrice;
        }

        return answer;
    }
}