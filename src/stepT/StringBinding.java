package stepT;

import java.util.HashMap;
import java.util.Map.Entry;
/**
 * 문제 설명
 * 문자열 배열 strArr이 주어집니다. strArr의 원소들을 길이가 같은 문자열들끼리 그룹으로 묶었을 때 가장 개수가 많은 그룹의 크기를 return 하는 solution 함수를 완성해 주세요.

 * 제한사항
 * 1 ≤ strArr의 길이 ≤ 100,000
 * 1 ≤ strArr의 원소의 길이 ≤ 30
 * strArr의 원소들은 알파벳 소문자로 이루어진 문자열입니다.
 * 입출력 예
 * strArr	result
 * ["a","bc","d","efg","hi"]	2
 * 입출력 예 설명
 * 입출력 예 #1

 * 각 문자열들을 길이에 맞게 그룹으로 묶으면 다음과 같습니다.
 * 문자열 길이	문자열 목록	개수
 * 1	["a","d"]	2
 * 2	["bc","hi"]	2
 * 3	["efg"]	1
 * 개수의 최댓값은 2이므로 2를 return 합니다.
 */
public class StringBinding {

    public static void main(String[] args) {
        System.out.println(solution(new String[]{"a","bc","d","efg","hi"}));
    }

    public static int solution(String[] strArr) {
        int answer = 0;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < strArr.length; i++) {
            int size = strArr[i].length();
            if (map.get(size) != null && map.get(size) > 0) {
                map.put(size, map.get(size) + 1);
            } else {
                map.put(size, 1);
            }
        }

        for (Entry<Integer, Integer> set : map.entrySet()) {
            if (set.getValue() > answer) {
                answer = set.getValue();
            }
        }

        return answer;
    }
}
