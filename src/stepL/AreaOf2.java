package stepL;

import java.util.ArrayList;
/**
 * 문제 설명
 * 정수 배열 arr가 주어집니다. 배열 안의 2가 모두 포함된 가장 작은 연속된 부분 배열을 return 하는 solution 함수를 완성해 주세요.

 * 단, arr에 2가 없는 경우 [-1]을 return 합니다.

 * 제한사항
 * 1 ≤ arr의 길이 ≤ 100,000
 * 1 ≤ arr의 원소 ≤ 10
 * 입출력 예
 * arr	result
 * [1, 2, 1, 4, 5, 2, 9]	[2, 1, 4, 5, 2]
 * [1, 2, 1]	[2]
 * [1, 1, 1]	[-1]
 * [1, 2, 1, 2, 1, 10, 2, 1]	[2, 1, 2, 1, 10, 2]
 * 입출력 예 설명
 * 입출력 예 #1

 * 2가 있는 인덱스는 1번, 5번 인덱스뿐이므로 1번부터 5번 인덱스까지의 부분 배열인 [2, 1, 4, 5, 2]를 return 합니다.
 * 입출력 예 #2

 * 2가 한 개뿐이므로 [2]를 return 합니다.
 * 입출력 예 #3

 * 2가 배열에 없으므로 [-1]을 return 합니다.
 * 입출력 예 #4

 * 2가 있는 인덱스는 1번, 3번, 6번 인덱스이므로 1번부터 6번 인덱스까지의 부분 배열인 [2, 1, 2, 1, 10, 2]를 return 합니다.
 * ※ 2023년 04월 27일 입출력 예, 입출력 예 설명 및 예시 테스트 케이스가 수정 되었습니다.
 */
public class AreaOf2 {

    public static void main(String[] args) {
        for (int a : solution(new int[] {1, 2, 1, 4, 5, 2, 9})) {
            System.out.println(a);
        }
        for (int a : solution(new int[] {1, 2, 1})) {
            System.out.println(a);
        }
        for (int a : solution(new int[] {1, 9})) {
            System.out.println(a);
        }
        for (int a : solution(new int[] {1, 2, 1, 2, 1, 10, 2, 1})) {
            System.out.println(a);
        }
    }

    private static int[] solution(int[] arr) {
        int[] answer = {};

        // 2의 갯수를 찾는다.
        // 2가 2개인 경우 범위를 지정해 반환
        // 2가 1개인 경우 2만 반환
        // 2가 없는 경우 -1만 반환
        int count = 0;
        int str = 0;
        int end = 0;
        for (int i = 0; i < arr.length; i++) {
            int a = arr[i];
            if (a == 2) {
                count++;
                switch (count) {
                    case 1:
                        str = i;
                        break;
                    default:
                        end = i;
                        break;
                }
            }
        }

        switch (count) {
            case 0:
                answer = new int[]{-1};
                break;
            case 1:
                answer = new int[]{2};
                break;
            default:
                answer = new int[end - str + 1];
                for (int i = 0, j = str; i < answer.length; i++, j++) {
                    answer[i] = arr[j];
                }
                break;
        }
        return answer;
    }
}
