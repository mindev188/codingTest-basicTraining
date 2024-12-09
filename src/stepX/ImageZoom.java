package stepX;

import java.util.ArrayList;
/**
 * 문제 설명
직사각형 형태의 그림 파일이 있고, 이 그림 파일은 1 × 1 크기의 정사각형 크기의 픽셀로 이루어져 있습니다. 이 그림 파일을 나타낸 문자열 배열 picture과 정수 k가 매개변수로 주어질 때, 이 그림 파일을 가로 세로로 k배 늘린 그림 파일을 나타내도록 문자열 배열을 return 하는 solution 함수를 작성해 주세요.

제한사항
1 ≤ picture의 길이 ≤ 20
1 ≤ picture의 원소의 길이 ≤ 20
모든 picture의 원소의 길이는 같습니다.
picture의 원소는 '.'과 'x'로 이루어져 있습니다.
1 ≤ k ≤ 10
입출력 예
picture	k	result
[".xx...xx.", "x..x.x..x", "x...x...x", ".x.....x.", "..x...x..", "...x.x...", "....x...."]	2	["..xxxx......xxxx..", "..xxxx......xxxx..", "xx....xx..xx....xx", "xx....xx..xx....xx", "xx......xx......xx", "xx......xx......xx", "..xx..........xx..", "..xx..........xx..", "....xx......xx....", "....xx......xx....", "......xx..xx......", "......xx..xx......", "........xx........", "........xx........"]
["x.x", ".x.", "x.x"]	3	["xxx...xxx", "xxx...xxx", "xxx...xxx", "...xxx...", "...xxx...", "...xxx...", "xxx...xxx", "xxx...xxx", "xxx...xxx"]
입출력 예 설명
입출력 예 #1

예제 1번의 picture는 다음과 같습니다.

.xx...xx.
x..x.x..x
x...x...x
.x.....x.
..x...x..
...x.x...
....x....
이를 가로 세로로 k배, 즉 2배 확대하면 그림 파일은 다음과 같습니다.

..xxxx......xxxx..
..xxxx......xxxx..
xx....xx..xx....xx
xx....xx..xx....xx
xx......xx......xx
xx......xx......xx
..xx..........xx..
..xx..........xx..
....xx......xx....
....xx......xx....
......xx..xx......
......xx..xx......
........xx........
........xx........
따라서 ["..xxxx......xxxx..", "..xxxx......xxxx..", "xx....xx..xx....xx", "xx....xx..xx....xx", "xx......xx......xx", "xx......xx......xx", "..xx..........xx..", "..xx..........xx..", "....xx......xx....", "....xx......xx....", "......xx..xx......", "......xx..xx......", "........xx........", "........xx........"]를 return 합니다.

입출력 예 #2

예제 2번의 picture는 다음과 같습니다.

x.x
.x.
x.x
이를 가로 세로로 k배, 즉 3배 확대하면 그림 파일은 다음과 같습니다.

xxx...xxx
xxx...xxx
xxx...xxx
...xxx...
...xxx...
...xxx...
xxx...xxx
xxx...xxx
xxx...xxx
따라서 ["xxx...xxx", "xxx...xxx", "xxx...xxx", "...xxx...", "...xxx...", "...xxx...", "xxx...xxx", "xxx...xxx", "xxx...xxx"]를 return 합니다.
 */
public class ImageZoom {

    public static void main(String[] args) {
        for (String a : solution(new String[] {".xx...xx.", "x..x.x..x", "x...x...x", ".x.....x.", "..x...x..", "...x.x...", "....x...."}, 2)) {
            System.out.println(a);
        }
    }

    public static String[] solution(String[] picture, int k) {
        String[] answer = {};

        /**
         * x와 . 의 값을 곱함과 동시에 인자를 늘려야 한다. k 값 만큼
         */
        ArrayList<String> list = new ArrayList<String>();
        String x = "";
        String dot = "";
        for (int i = 0; i < k; i++) {
            x += "x";
            dot += ".";
        }

        // replaceAll("\\.") 대신 정규식을 통해 replaceAll("[.]", dot),replaceAll("[x]", x)); 을 하는것이 더 깔끔했을 것 같다
        for (int i = 0; i < picture.length; i++) {
            String a = picture[i];
            a = a.replaceAll("x", x);
            a = a.replaceAll("\\.", dot);
            for (int j = 0; j < k; j++) {
                list.add(a);
            }
        }

        answer = list.stream().toArray(String[]::new);
        return answer;
    }
}
