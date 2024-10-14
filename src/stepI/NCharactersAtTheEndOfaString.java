package stepI;

/**
 * 문제 설명
 * 문자열 my_string과 정수 n이 매개변수로 주어질 때, my_string의 뒤의 n글자로 이루어진 문자열을 return 하는 solution 함수를 작성해 주세요.

 * 제한사항
 * my_string은 숫자와 알파벳으로 이루어져 있습니다.
 * 1 ≤ my_string의 길이 ≤ 1,000
 * 1 ≤ n ≤ my_string의 길이
 * 입출력 예
 * my_string	n	result
 * "ProgrammerS123"	11	"grammerS123"
 * "He110W0r1d"	5	"W0r1d"
 * 입출력 예
 * 입출력 예 #1

 * 예제 1번의 my_string에서 뒤의 11글자는 "grammerS123"이므로 이 문자열을 return 합니다.
 * 입출력 예 #2

 * 예제 2번의 my_string에서 뒤의 5글자는 "W0r1d"이므로 이 문자열을 return 합니다.
 */
public class NCharactersAtTheEndOfaString {

    public static void main(String[] args) {
        System.out.println(solution("ProgrammerS123", 11));
    }

    private static String solution(String my_string, int n) {
        String answer = "";
        // 마지막 문자열 위치로부터 문자열 길이 - n 값까지 짤라 반환
        answer = my_string.substring(my_string.length() - n);
        return answer;
    }
}
