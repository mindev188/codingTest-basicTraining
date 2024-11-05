package stepB;
import java.util.Scanner;
import java.lang.StringBuilder;

/**
 * 문제설명
 * 두 정수 a, b가 주어질 때 다름와 같은 형태의 계산식을 출력하는 코드를 작성해 보세요
 * > a + b = c
 * 
 * 제한사항
 * 1 <= a, b <= 100
 * 
 * 입출력 예
 * 입력#1
 * > 4 5
 * 
 * 출력#1
 * > 4 + 5 = 9
 * 
 */
public class OutputAddition {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int a = sc.nextInt();
         int b = sc.nextInt();

         StringBuilder msg = new StringBuilder();
         msg.append(a).append(" + ").append(b).append(" = ").append(a + b);
         System.out.println(msg.toString());
        sc.close();
    }

}
