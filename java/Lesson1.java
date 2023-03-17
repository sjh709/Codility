// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");
import java.util.*;
class Solution {
    public int solution(int N) {
        // Implement your solution here
        int answer = 0;
        String bi = Integer.toBinaryString(N);

        LinkedList<Integer> q = new LinkedList<>();
        for(int i = 0; i < bi.length(); i++) {
            if(bi.charAt(i) == '1') {
                q.offer(i);
            }
        }

        int start = 0;
        int end = 0;
        while(q.size() > 1) {
            start = q.pop();
            end = q.peek();
            int result = end - start - 1;
            answer = Math.max(answer, result);
        }

        return answer;
    }
}
