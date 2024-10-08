package stepF;

/**
 * 문제 설명
 * 정수 배열 arr와 2차원 정수 배열 queries이 주어집니다. queries의 원소는 각각 하나의 query를 나타내며, [i, j] 꼴입니다.

 * 각 query마다 순서대로 arr[i]의 값과 arr[j]의 값을 서로 바꿉니다.

 * 위 규칙에 따라 queries를 처리한 이후의 arr를 return 하는 solution 함수를 완성해 주세요.

 * 제한사항
 * 1 ≤ arr의 길이 ≤ 1,000
 * 0 ≤ arr의 원소 ≤ 1,000,000
 * 1 ≤ queries의 길이 ≤ 1,000
 * 0 ≤ i < j < arr의 길이
 * 
 * 입출력 예
 * arr	queries	result
 * [0, 1, 2, 3, 4]	[[0, 3],[1, 2],[1, 4]]	[3, 4, 1, 0, 2]
 * 
 * 입출력 예 설명
 * 입출력 예 #1

 * 각 쿼리에 따라 arr가 다음과 같이 변합니다.
 * arr
 * [0, 1, 2, 3, 4]
 * [3, 1, 2, 0, 4]
 * [3, 2, 1, 0, 4]
 * [3, 4, 1, 0, 2]
 * 따라서 [3, 4, 1, 0, 2]를 return 합니다.
 */
public class SequenceAndIntervalQueries3 {
    public static void main(String[] args) {
        for (int arr : solution(new int[] {0, 1, 2, 3, 4}, new int[][]{{0, 3}, {1, 2}, {1, 4}})) {
            System.out.println(arr);
        }

    }

    private static int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        // arr의 배열 인자의 각 위치를 queries 의 값에 따라 변경한다.
        // 각 자리의 수를 변경 하기 위해 tmp 변수를 사용
        for (int[] query : queries) {
            /*
             * 0번째 인덱스 값은 tmp로 
             * 1번째 인덱스 값은 0번째 인덱스로
             * tmp의 값은 1번째 인덱스로 교환
             */ 
            int tmp = arr[query[0]];
            arr[query[0]] = arr[query[1]];
            arr[query[1]] = tmp;
        }
        answer = arr;
        return answer;
    }
}
