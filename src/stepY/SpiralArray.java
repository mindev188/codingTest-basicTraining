package stepY;

/**
 * 문제 설명
 * 양의 정수 n이 매개변수로 주어집니다. n × n 배열에 1부터 n2 까지 정수를 인덱스 [0][0]부터 시계방향 나선형으로 배치한 이차원 배열을 return 하는 solution 함수를 작성해 주세요.

 * 제한사항
 * 1 ≤ n ≤ 30
 * 입출력 예
 * n	result
 * 4	[[1, 2, 3, 4], [12, 13, 14, 5], [11, 16, 15, 6], [10, 9, 8, 7]]
 * 5	[[1, 2, 3, 4, 5], [16, 17, 18, 19, 6], [15, 24, 25, 20, 7], [14, 23, 22, 21, 8], [13, 12, 11, 10, 9]]
 * 입출력 예 설명
 * 입출력 예 #1

 * 예제 1번의 n의 값은 4로 4 × 4 배열에 다음과 같이 1부터 16까지 숫자를 채울 수 있습니다.

 * 행 \ 열	0	1	2	3
 * 0	1	2	3	4
 * 1	12	13	14	5
 * 2	11	16	15	6
 * 3	10	9	8	7
 * 따라서 [[1, 2, 3, 4], [12, 13, 14, 5], [11, 16, 15, 6], [10, 9, 8, 7]]를 return 합니다.

 * 입출력 예 #2

 * 예제 2번의 n의 값은 5로 5 × 5 배열에 다음과 같이 1부터 25까지 숫자를 채울 수 있습니다.

 * 행 \ 열	0	1	2	3	4
 * 0	1	2	3	4	5
 * 1	16	17	18	19	6
 * 2	15	24	25	20	7
 * 3	14	23	22	21	8
 * 4	13	12	11	10	9
 * 따라서 [[1, 2, 3, 4, 5], [16, 17, 18, 19, 6], [15, 24, 25, 20, 7], [14, 23, 22, 21, 8], [13, 12, 11, 10, 9]]를 return 합니다.
 */
public class SpiralArray {

    public static void main(String[] args) {
        for(int[] arr: solution(4)) {
            for(int a : arr) {
                System.out.println(a);
            }
        }
    }

    public static int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int x = 0;
        int y = 0;
        int count = 1;
        int direction = 0;

        // direction값에 따라 방향을 바꿔 나가며 값을 채워나간다.
        // 0은 우측, 1은 아래, 2는 왼쪽, 3은 위
        while(count <= n * n) {
            answer[y][x] = count++;
            // 우측 방향
            if (direction == 0) {
                // x + 1의 값이 n과 같거나 다음 인덱스의 값이 0이 아닌 경우
                if (x + 1 == n || answer[y][x + 1] != 0) {
                    // 아래로 방향 전환
                    direction = 1; 
                    y++;
                } else {
                    x++;
                }
            // 아래 방향
            } else if (direction == 1) {
                if (y + 1 == n || answer[y+1][x] != 0) {
                    // 왼쪽으로 방향 전환
                    direction = 2;
                    x--;
                } else {
                    y++;
                }
            // 왼쪽 방향
            } else if (direction == 2) {
                if (x == 0 || answer[y][x-1] != 0) {
                    // 위로 방향 전환
                    direction = 3;
                    y--;
                } else{
                    x--;
                }
            // 위쪽 방향
            } else if (direction == 3) {
                if (y == 0 || answer[y-1][x] != 0) {
                    // 오른쪽 방향 전환
                    direction = 0;
                    x++;
                } else {
                    y--;
                }
            }
        }
        return answer;
    }
}
