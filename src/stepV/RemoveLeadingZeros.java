package stepV;

/**
 * 문제 설명
 *  정수로 이루어진 문자열 n_str이 주어질 때, n_str의 가장 왼쪽에 처음으로 등장하는 0들을 뗀 문자열을 return하도록 solution 함수를 완성해주세요.

 *  제한사항
 *  2 ≤ n_str ≤ 10
 *  n_str이 "0"으로만 이루어진 경우는 없습니다.
 *  입출력 예
 *  n_str	result
 *  "0010"	"10"
 *  "854020"	"854020"
 *  입출력 예 설명
 *  입출력 예 #1

 *  "0010"의 가장 왼쪽에 연속으로 등장하는 "0"을 모두 제거하면 "10"이 됩니다.
 *  입출력 예 #2

 *  "854020"는 가장 왼쪽에 0이 없으므로 "854020"을 return합니다.
 */
public class RemoveLeadingZeros {

    public static void main(String[] args) {
        System.out.println(solution("0010"));
        System.out.println(solution("854020"));
    }

    public static String solution(String n_str) {
        String answer = "";

        // 반복문으로 0이 나오지 않는 경우 answer에 해당 인덱스부터 문자열을 잘라 반환
        // but. Integer로 변환하면 앞의 0은 사라진다... ex) String.valueOf(Integer.parseInt(n_str));
        for (int i = 0; i < n_str.length(); i++) {
            char a = n_str.charAt(i);
            if (a == '0') {
                continue;
            } else {
                answer = n_str.substring(i);
                break;
            }
        }
        return answer;
    }
}
