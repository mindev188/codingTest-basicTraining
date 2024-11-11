package stepO;

/**
 * 문제 설명
 * 정수가 있을 때, 짝수라면 반으로 나누고, 홀수라면 1을 뺀 뒤 반으로 나누면, 마지막엔 1이 됩니다. 예를 들어 10이 있다면 다음과 같은 과정으로 1이 됩니다.

 * 10 / 2 = 5
 * (5 - 1) / 2 = 2
 * 2 / 2 = 1
 * 위와 같이 3번의 나누기 연산으로 1이 되었습니다.

 * 정수들이 담긴 리스트 NUM_LIST가 주어질 때, NUM_LIST의 모든 원소를 1로 만들기 위해서 필요한 나누기 연산의 횟수를 RETURN하도록 SOLUTION 함수를 완성해주세요.

 * 제한사항
 * 3 ≤ NUM_LIST의 길이 ≤ 15
 * 1 ≤ NUM_LIST의 원소 ≤ 30
 * 입출력 예
 * NUM_LIST	RESULT
 * [12, 4, 15, 1, 14]	11
 * 입출력 예 설명
 * 입출력 예 #1

 * 12는 3번, 4는 2번, 15는 3번, 1은 0번, 14는 3번의 연산이 필요하기 때문에 총 11번의 연산이 필요합니다.
 */
public class MakeIt1 {

    public static void main(String[] args) {
       System.out.println(solution(new int[] {12, 4, 15, 1, 14})); 
    }

    public static int solution(int[] num_list) {
        int answer = 0;
        // 홀수와 짝수에 따라 값을 나눠가며 1이 나올때가지 각 원소를 연산한다.
        // 짝수 :  n / 2 , 홀수 : (n - 1) / 2
        // 총 연산 횟수를 반환한다.
        for (int a : num_list) {
            while(a > 1)  {
                if (a % 2 == 1 ) a = a - 1;
                a = a / 2;
                answer++;
            }
        }
        return answer;
    }
}
