package stepU;

/**
 * 문제 설명
 * 한 자리 정수로 이루어진 문자열 num_str이 주어질 때, 각 자리수의 합을 return하도록 solution 함수를 완성해주세요.

 * 제한사항
 * 3 ≤ num_str ≤ 100
 * 입출력 예
 * num_str	result
 * "123456789"	45
 * "1000000"	1
 * 입출력 예 설명
 * 입출력 예 #1

 * 문자열 안의 모든 숫자를 더하면 45가 됩니다.
 * 입출력 예 #2

 * 문자열 안의 모든 숫자를 더하면 1이 됩니다.

 */
public class StringIntegerSum {
    public static void main(String[] args) {
        System.out.println(solution("123456789")); 
        System.out.println(solution("1000000")); 
    }

    public static int solution(String num_str) {
        int answer = 0;
        // char의 값을 String, 이후 int 형태로 변환해 증감.
        // but. "0" 값을 더하거나 ""로 split 하여 증감도 가능하였음.
        for (char a : num_str.toCharArray()) {
            answer += Integer.valueOf(String.valueOf(a));
        }
        return answer;
    }
}
