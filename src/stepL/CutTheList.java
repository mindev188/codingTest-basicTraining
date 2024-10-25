package stepL;

/** 
 * 문제 설명
 * 정수 n과 정수 3개가 담긴 리스트 slicer 그리고 정수 여러 개가 담긴 리스트 num_list가 주어집니다. slicer에 담긴 정수를 차례대로 a, b, c라고 할 때, n에 따라 다음과 같이 num_list를 슬라이싱 하려고 합니다.

 * n = 1 : num_list의 0번 인덱스부터 b번 인덱스까지
 * n = 2 : num_list의 a번 인덱스부터 마지막 인덱스까지
 * n = 3 : num_list의 a번 인덱스부터 b번 인덱스까지
 * n = 4 : num_list의 a번 인덱스부터 b번 인덱스까지 c 간격으로
 * 올바르게 슬라이싱한 리스트를 return하도록 solution 함수를 완성해주세요.

 * 제한사항
 * n 은 1, 2, 3, 4 중 하나입니다.
 * slicer의 길이 = 3
 * slicer에 담긴 정수를 차례대로 a, b, c라고 할 때

 * 0 ≤ a ≤ b ≤ num_list의 길이 - 1
 * 1 ≤ c ≤ 3
 * 5 ≤ num_list의 길이 ≤ 30

 * 0 ≤ num_list의 원소 ≤ 100

 * 입출력 예
 * n	slicer	num_list	result
 * 3	[1, 5, 2]	[1, 2, 3, 4, 5, 6, 7, 8, 9]	[2, 3, 4, 5, 6]
 * 4	[1, 5, 2]	[1, 2, 3, 4, 5, 6, 7, 8, 9]	[2, 4, 6]
 * 입출력 예 설명
 * 입출력 예 #1

 * [1, 2, 3, 4, 5, 6, 7, 8, 9]에서 1번 인덱스부터 5번 인덱스까지 자른 리스트는 [2, 3, 4, 5, 6]입니다.
 * 입출력 예 #2

 * [1, 2, 3, 4, 5, 6, 7, 8, 9]에서 1번 인덱스부터 5번 인덱스까지 2개 간격으로 자른 리스트는 [2, 4, 6]입니다.
 */
public class CutTheList {
    public static void main(String[] args) {
        System.out.println("start 1");
        for (int i : solution(3, new int[]{1, 5, 2}, new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9})) {
            System.out.println(i);
        }        
        System.out.println("start 2");
         for (int i : solution(4, new int[]{1, 5, 2}, new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9})) {
            System.out.println(i);
        }        
        System.out.println("start 3");
         for (int i : solution(1, new int[]{1, 5, 2}, new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9})) {
            System.out.println(i);
        }        
        System.out.println("start 4");
         for (int i : solution(2, new int[]{1, 5, 2}, new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9})) {
            System.out.println(i);
        }        
   }

    private static int[] solution(int n, int[] slicer, int[] num_list) {
        int[] answer = {};
        /*
         * n = 1 : num_list의 0번 인덱스부터 b번 인덱스까지
         * n = 2 : num_list의 a번 인덱스부터 마지막 인덱스까지
         * n = 3 : num_list의 a번 인덱스부터 b번 인덱스까지
         * n = 4 : num_list의 a번 인덱스부터 b번 인덱스까지 c 간격으로
         */
        int a = slicer[0];
        int b = slicer[1];
        int c = slicer[2];

        int start = 0;
        int end = 0;
        switch (n) {
            case 1:
                answer = new int[b+1];
                start = 0;
                end = b;
                break;
            case 2:
                answer = new int[num_list.length-a]; // num_list는 10개의 숫자, 9까지의 인덱스, a는 1 , 그럼 10-1은 9 + 1 = 10.
                start = a;
                end = num_list.length-1;
                break;
            case 3:
                answer = new int[b-a+1];
                start = a;
                end = b;
                break;
        
            default: // 4
                answer = new int[((b-a)/c)+1];
                start = a;
                end = b;
                break;
        }

        // start 인덱스부터 end 인덱스 까지의 값을 answer 배열에 넣어 반환한다.
        // but n = 4 인 경우 c 간격으로 집어 넣는다.
        for (int i = 0; start <= end; i++) {
            answer[i] = num_list[start];
            if ( n != 4) {
                start = start + 1;
            } else {
                start = start + 2;
                if (answer.length == i-1) break;
            }
        }

        return answer;
    }
}
