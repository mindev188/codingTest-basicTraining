package stepD;

/**
 * 문제 설명
 * 양의 정수 n이 매개변수로 주어질 때, n이 홀수라면 n 이하의 홀수인 모든 양의 정수의 합을 return 하고 
 * n이 짝수라면 n 이하의 짝수인 모든 양의 정수의 제곱의 합을 return 하는 solution 함수를 작성해 주세요.

 * 제한사항
 * 1 ≤ n ≤ 100
 * 
 * 입출력 예
 * n	result
 * 7	16
 * 10	220
 * 
 * 입출력 예 설명
 * 입출력 예 #1
 * 예제 1번의 n은 7로 홀수입니다. 7 이하의 모든 양의 홀수는 1, 3, 5, 7이고 이들의 합인 1 + 3 + 5 + 7 = 16을 return 합니다.
 * 
 * 입출력 예 #2
 * 예제 2번의 n은 10으로 짝수입니다. 10 이하의 모든 양의 짝수는 2, 4, 6, 8, 10이고 이들의 제곱의 합인 2^2 + 4^2 + 6^2 + 8^2 + 10^2 = 4 + 16 + 36 + 64 + 100 = 220을 return 합니다. 
 */
public class ReturnValueToOddOrEven {

    public static void main(String[] args) {
        System.out.println(solution(7));
        System.out.println(solution(10));
    }

    private static int solution(int n) {
        int answer = 0;

        // 홀수
        if (n % 2 == 1) {
            for (int i = 1; i <= n; i += 2) {
                answer += i;
            }
        // 짝수
        } else {
            for (int i = 2; i <= n; i += 2) {
                answer += Math.pow(i, 2);
            }
        }

        /*
         * Other Code
         * if (n % 2 == 1) {
         *     return (n + 1) * (n + 1) / 2 / 2;
         * } else {
         *     return 4 * n/2 * (n/2 + 1) * (2 * n/2 + 1) / 6;
         * }
         */
        return answer;
    }
}
