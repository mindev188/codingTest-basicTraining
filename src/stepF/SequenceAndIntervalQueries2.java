package stepF;

/**
 * 문제 설명
 * 정수 배열 arr와 2차원 정수 배열 queries이 주어집니다. queries의 원소는 각각 하나의 query를 나타내며, [s, e, k] 꼴입니다.

 * 각 query마다 순서대로 s ≤ i ≤ e인 모든 i에 대해 k보다 크면서 가장 작은 arr[i]를 찾습니다.

 * 각 쿼리의 순서에 맞게 답을 저장한 배열을 반환하는 solution 함수를 완성해 주세요.
 * 단, 특정 쿼리의 답이 존재하지 않으면 -1을 저장합니다.

 * 제한사항
 * 1 ≤ arr의 길이 ≤ 1,000
 * 0 ≤ arr의 원소 ≤ 1,000,000
 * 1 ≤ queries의 길이 ≤ 1,000
 * 0 ≤ s ≤ e < arr의 길이
 * 0 ≤ k ≤ 1,000,000
 * 
 * 입출력 예
 * arr	queries	result
 * [0, 1, 2, 4, 3]	[[0, 4, 2],[0, 3, 2],[0, 2, 2]]	[3, 4, -1]
 * 
 * 입출력 예 설명
 * 입출력 예 #1

 * 첫 번째 쿼리의 범위에는 0, 1, 2, 4, 3이 있으며 이 중 2보다 크면서 가장 작은 값은 3입니다.
 * 두 번째 쿼리의 범위에는 0, 1, 2, 4가 있으며 이 중 2보다 크면서 가장 작은 값은 4입니다.
 * 세 번째 쿼리의 범위에는 0, 1, 2가 있으며 여기에는 2보다 큰 값이 없습니다.
 * 따라서 [3, 4, -1]을 return 합니다.
 */
public class SequenceAndIntervalQueries2 {

    public static void main(String[] args) {
        for (int a : solution(new int[] {0, 1, 2, 4, 3}, new int[][] {{0, 4, 2},{0, 3, 2},{0, 2, 2}})) {
            System.out.println(a);
        };
    }

    private static int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        
        /**
         * query 의 인자값
         * 0번째 : 시작 위치         * 1번째 : 마지막 위치
         * 2번째 : 비교 최소값
         */
        for (int i = 0; i < queries.length; i++) {
            int[] query = queries[i];
            int start = query[0];
            int end = query[1];
            int currentVal = query[2];
            int targetVal = 0;
           /*
            * 비교 최소값보다 크면서 가장 작은 값
            */ 
            for (int j = start; j <= end; j++) {
                // 비교 최소값보다 크고
                if (currentVal < arr[j]) {
                    if (targetVal == 0) targetVal = arr[j];
                    // 그 중 가장 작은 값
                    if (targetVal > arr[j]) {
                        targetVal = arr[j];
                    };
                };
            };
            answer[i] = targetVal == 0 ? -1 : targetVal;
        }

        // Other Code
        // Arrays.fill(answer, -1);

        // for (int idx = 0; idx < queries.length; idx++) {
        //     int[] query = queries[idx];
        //     int s = query[0], e = query[1], k = query[2];

        //     for (int i = s; i <= e; i++) {
        //         if (k < arr[i]) {
        //             answer[idx] = answer[idx] == -1 ? arr[i] : Math.min(answer[idx], arr[i]);
        //         }
        //     }
        // }
        return answer;
    }
}
