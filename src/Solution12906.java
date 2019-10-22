import java.util.ArrayList;
import java.util.List;

/**
 * 같은 숫자는 싫어
 * https://programmers.co.kr/learn/courses/30/lessons/12906
 */
public class Solution12906 {
    public static void main(String[] args) {
        int[] arr = {1,1,3,3,0,1,1};
        System.out.println(new Solution12906().solution(arr));
    }

    public int[] solution(int []arr) {
        int beforeNum = -1;
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != beforeNum)
                numbers.add(arr[i]);
            beforeNum = arr[i];
        }

        int[] answer = new int[numbers.size()];
        for (int i = 0; i < numbers.size(); i++) {
            answer[i] = numbers.get(i);
        }

        for(int i =0; i< answer.length; i++) {
            System.out.println(answer[i]);
        }
        return answer;
    }
}
