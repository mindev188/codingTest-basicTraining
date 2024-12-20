package stepA;
import java.util.Scanner;

/**
 * 문제 설명
 * 문자열 'str'이 주어질 때, 'str'을 출력하는 코드를 작성해 보세요.
 * 
 * 제한사항
 * - 1 <= 'str'의 길이 <= 1,000,000
 * - 'str'에는 공백이 없으며, 첫째 줄에 한 줄로만 주어집니다.
 * 
 * 입출력 예
 * 입력 #1
 * HelloWorld!
 * 출력 #1
 * HelloWorld!
 */
public class OutputString {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        /* 문제 풀이 */
        // >> 공백도 아닌 값이 한줄로만 출력되므로 Syso로 출력만 한다
        System.out.println(a);
        sc.close();
    }
}