import java.util.Arrays;

/**
 * 정렬 > K 번째 수
 * https://programmers.co.kr/learn/courses/30/lessons/42748
 */
public class Solution42748 {

  public static void main(String[] args) {
    int[] array = {1, 5, 2, 6, 3, 7, 4};
    int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

    int[] resArray = solution(array, commands);
    for (int res : resArray) {
      System.out.print(res + " ");
    }
  }

  public static int[] solution(int[] array, int[][] commands) {

    int[] answer = new int[commands.length];

    for (int i = 0; i < commands.length; i++) {
      int[] subArray = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);
      Arrays.sort(subArray);
      answer[i] = subArray[(commands[i][2]) - 1];
    }
    return answer;
  }
}
