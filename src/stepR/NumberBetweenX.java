package stepR;

import java.util.ArrayList;
/**
 * 문제 설명
 * 문자열 MYSTRING이 주어집니다. MYSTRING을 문자 "X"를 기준으로 나눴을 때 나눠진 문자열 각각의 길이를 순서대로 저장한 배열을 RETURN 하는 SOLUTION 함수를 완성해 주세요.

 * 제한사항
 * 1 ≤ MYSTRING의 길이 ≤ 100,000
 * MYSTRING은 알파벳 소문자로 이루어진 문자열입니다.
 * 입출력 예
 * MYSTRING	RESULT
 * "oxooxoxxox"	[1, 2, 1, 0, 1, 0]
 * "xabcxdefxghi"	[0, 3, 3, 3]
 * 입출력 예 설명
 * 입출력 예 #1

 * "X"를 기준으로 문자열을 나누면 ["O", "OO", "O", "", "O", ""]가 됩니다. 각각의 길이로 배열을 만들면 [1, 2, 1, 0, 1, 0]입니다. 따라서 [1, 2, 1, 0, 1, 0]을 RETURN 합니다.
 * 입출력 예 #2

 * "X"를 기준으로 문자열을 나누면 ["", "ABC", "DEF", "GHI"]가 됩니다. 각각의 길이로 배열을 만들면 [0, 3, 3, 3]입니다. 따라서 [0, 3, 3, 3]을 RETURN 합니다.
 */
public class NumberBetweenX {

    public static void main(String[] args) {
        for (int a : solution("oxooxoxxox")) {
            System.out.println(a);
        }
    }

    public static int[] solution(String myString) {
        int[] answer = {};

        ArrayList<Integer> list = new ArrayList<Integer>();
        int count = 0;
        for (int i = 0; i < myString.length(); i++) {
            if (myString.charAt(i)=='x') {
                list.add(count);
                count = 0;
            } else {
                count++;
            }
        }
        list.add(count);
        answer = list.stream().mapToInt(a->a).toArray();
        return answer;
    }
}
