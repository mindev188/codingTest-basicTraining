package stepW;

/**
 * 문제 설명
 * 정수 배열 date1과 date2가 주어집니다. 두 배열은 각각 날짜를 나타내며 [year, month, day] 꼴로 주어집니다. 각 배열에서 year는 연도를, month는 월을, day는 날짜를 나타냅니다.

 * 만약 date1이 date2보다 앞서는 날짜라면 1을, 아니면 0을 return 하는 solution 함수를 완성해 주세요.

 * 제한사항
 * date1의 길이 = date2의 길이 = 3
 * 0 ≤ year ≤ 10,000
 * 1 ≤ month ≤ 12
 * day는 month에 따라 가능한 날짜로 주어집니다.
 * 입출력 예
 * date1	date2	result
 * [2021, 12, 28]	[2021, 12, 29]	1
 * [1024, 10, 24]	[1024, 10, 24]	0
 * 입출력 예 설명
 * 입출력 예 #1

 * date1이 date2보다 하루 앞서기 때문에 1을 return 합니다.
 * 입출력 예 #2

 * date1과 date2는 날짜가 서로 같으므로 date1이 더 앞서는 날짜가 아닙니다. 따라서 0을 return 합니다.
 */
public class DateComparator {
    public static void main(String[] args) {
       System.out.println(solution(new int[]{2021,12,28}, new int[]{2021,12,29})); // 1
       System.out.println(solution(new int[]{1024,10,24}, new int[]{1024,10,24})); // 0
       System.out.println(solution(new int[]{1023,10,24}, new int[]{1024,10,24})); // 1
       System.out.println(solution(new int[]{2021,11,28}, new int[]{2021,12,29})); // 1
       System.out.println(solution(new int[]{2021,11,28}, new int[]{2021,11,25})); // 0
       System.out.println(solution(new int[]{0,1,25}, new int[]{0,1,25})); // 0
       System.out.println(solution(new int[]{2023,12,1}, new int[]{2023,1,23})); // 0
    }

    public static int solution(int[] date1, int[] date2) {
        int answer = 0;
        // 만약 년월일 중 data1의 년월의 값이 date2보다 늦지만, 일의 값반 data2값 보다 빠른경우의 오류
        for (int i = 0; i < date1.length; i++) {
            if (date1[i] < date2[i]) {
                return 1; 
            } else if (date1[i] > date2[i]) {
                return 0;
            }
        }
        return answer;
    }
}
