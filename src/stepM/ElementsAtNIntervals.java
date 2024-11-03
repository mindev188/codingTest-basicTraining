package stepM;

/**
 * 문제 설명
 * 정수 리스트 num_list와 정수 n이 주어질 때, num_list의 첫 번째 원소부터 마지막 원소까지 n개 간격으로 저장되어있는 원소들을 차례로 담은 리스트를 return하도록 solution 함수를 완성해주세요.

 * 제한사항
 * 5 ≤ num_list의 길이 ≤ 20
 * 1 ≤ num_list의 원소 ≤ 9
 * 1 ≤ n ≤ 4
 * 입출력 예
 * num_list	n	result
 * [4, 2, 6, 1, 7, 6]	2	[4, 6, 7]
 * [4, 2, 6, 1, 7, 6]	4	[4, 7]
 * 입출력 예 설명
 * 입출력 예 #1

 * [4, 2, 6, 1, 7, 6]에서 2개 간격으로 저장되어 있는 원소들은 [4, 6, 7]입니다.
 * 입출력 예 #2

 * [4, 2, 6, 1, 7, 6]에서 4개 간격으로 저장되어 있는 원소들은 [4, 7]입니다.
 */
public class ElementsAtNIntervals {

    public static void main(String[] args) {
       for (int a : solution(new int[]{4, 2, 6, 1, 7, 6}, 2)) {
            System.out.println(a);
       }
       for (int a : solution(new int[]{4, 2, 6, 1, 7, 6}, 4)) {
            System.out.println(a);
       }
    }

    public static int[] solution(int[] num_list, int n) {
        // answer 배열의 길이는 num_list 배열의 전체 길이를 n으로 나눈 값이 된다.
        int[] answer = new int[num_list.length/n + (num_list.length%n > 0? 1 : 0)];
        int idx = 0;
        for (int i = 0; i < answer.length; i++) {
            answer[i] = num_list[idx];
            idx += n;
        }

        return answer;
    }
}
