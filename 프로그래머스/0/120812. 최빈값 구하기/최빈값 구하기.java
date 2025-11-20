import java.util.*;

class Solution {
    public int solution(int[] array) {
        Map<Integer, Integer> freq = new HashMap<>();
        
        // 빈도 계산
        for (int n : array) {
            freq.put(n, freq.getOrDefault(n, 0) + 1);
        }
        
        int maxCount = Collections.max(freq.values()); // 최대 빈도
        int mode = -1;
        int countMax = 0;
        
        // 최빈값 후보 찾기
        for (Map.Entry<Integer, Integer> e : freq.entrySet()) {
            if (e.getValue() == maxCount) {
                countMax++;
                mode = e.getKey();
            }
        }
        
        // 최빈값이 여러 개면 -1
        return countMax > 1 ? -1 : mode;
    }
}