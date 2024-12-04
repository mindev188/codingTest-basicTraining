package stepV;

import java.math.BigInteger;

/**
 * 문제 설명
 * 0 이상의 두 정수가 문자열 a, b로 주어질 때, a + b의 값을 문자열로 return 하는 solution 함수를 작성해 주세요.

 * 제한사항
 * 1 ≤ a의 길이 ≤ 100,000
 * 1 ≤ b의 길이 ≤ 100,000
 * a와 b는 숫자로만 이루어져 있습니다.
 * a와 b는 정수 0이 아니라면 0으로 시작하지 않습니다.
 * 입출력 예
 * a	b	result
 * "582"	"734"	"1316"
 * "18446744073709551615"	"287346502836570928366"	"305793246910280479981"
 * "0"	"0"	"0"
 * 입출력 예 설명
 * 입출력 예 #1

 * 예제 1번의 a, b는 각각 582, 734이고 582 + 734 = 1316입니다. 따라서 "1316"을 return 합니다.
 * 입출력 예 #2

 * 예제 2번의 a, b는 각각 18446744073709551615, 287346502836570928366이고 18446744073709551615 + 287346502836570928366 = 305793246910280479981입니다. 따라서 "305793246910280479981"을 return 합니다.
 * 입출력 예 #3

 * 예제 3번의 a, b는 각각 0, 0이고 0 + 0 = 0입니다. 따라서 "0"을 return 합니다.
 */
public class TwoNumberSum {

    public static void main(String[] args) {
       System.out.println(solution("582", "734")); 
       System.out.println(solution("0", "0")); 
       System.out.println(solution("18446744073709551615", "287346502836570928366")); 
    }

    public static String solution(String a, String b) {
        String answer = "";

        // a 와 b를 숫자로 형변환 하여 더한 후 뒤에 문자열을 붙여 문자열 형태로 변환한다.
        // 형변환 과정에서 인자값이 int를 벗어나는 경우가 있어 BigInteger 사용
        BigInteger bigNum = new BigInteger(a);
        answer = bigNum.add(new BigInteger(b)).toString();
        return answer;
    }
}
