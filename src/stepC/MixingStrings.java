package stepC;

/**
 * 문제 설명
 * 길이가 같은 두 문자열 str1과 str2가 주어집니다.
 *
 * 두 문자열의 각 문자가 앞에서부터 서로 번갈아가면서 한 번씩 등장하는 문자열을 만들어 return 하는 solution 함수를 완성해 주세요.
 * 
 * 제한사항
 * 1 ≤ str1의 길이 = str2의 길이 ≤ 10
 * str1과 str2는 알파벳 소문자로 이루어진 문자열입니다.
 * 
 * 입출력 예
 * str1     str2    result
 * "aaaaa"  "bbbbb" "ababababab"
 */
public class MixingStrings {

    public static void main(String[] args) {

        System.out.println(solution("str1","str2"));
   }

    private static String solution(String str1, String str2) {
        String answer = "";

        // 각 문자열의 길이가 같이 때문에 하나의 문자열의 길이를 기준으로 자리별로 뽑아내 섞는다
        for (int i = 0;i < str1.length();i++){
            answer += str1.charAt(i);
            answer += str2.charAt(i);
        }
        return answer;
    }
}
