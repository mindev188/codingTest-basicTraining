package stepD;

/**
 * 문제 설명
 * 정수 number와 n, m이 주어집니다. number가 n의 배수이면서 m의 배수이면 1을 아니라면 0을 return하도록 solution 함수를 완성해주세요.

 * 제한사항
 * 10 ≤ number ≤ 100
 * 2 ≤ n, m < 10
 * 입출력 예
 * number	n	m	result
 * 60	2	3	1
 * 55	10	5	0
 * 입출력 예 설명
 * 입출력 예 #1

 * 60은 2의 배수이면서 3의 배수이기 때문에 1을 return합니다.
 * 입출력 예 #2

 * 55는 5의 배수이지만 10의 배수가 아니기 때문에 0을 return합니다.
 */
public class CommonMultiple {

    public static void main(String[] args) {
        
        System.out.println(solution(60, 2, 3));
        System.out.println(solution(55, 10, 5));
    }

    private static int solution(int number, int n, int m) {
        int answer = 0;

        // number이 n의 배수인지
        answer = number % n == 0 ? 1 : 0;

        // number이 m의 배수인지
        if (answer == 1) {
            answer = number % m == 0 ? 1 : 0;
        }

        /*
         * other Code
         * answer = number % n == 0 && number % m == 0 ? 1 : 0;
         */ 

        return answer;
    }
}
