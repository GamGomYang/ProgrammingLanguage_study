import java.util.HashSet;
import java.util.Set;

public class ltc3 {
    public int lengthOfLongestSubstring(String s) {
        // 해시셋을 사용하여 현재 서브스트링 내의 고유한 문자를 저장합니다.
        Set<Character> set = new HashSet<>();
        int n = s.length();
        int left = 0, right = 0; // 두 포인터를 사용하여 슬라이딩 윈도우를 만듭니다.
        int maxLength = 0; // 가장 긴 서브스트링의 길이를 저장할 변수입니다.

        while (right < n) {
            // 오른쪽 포인터가 가리키는 문자가 셋에 없는 경우
            if (!set.contains(s.charAt(right))) {
                // 현재 문자를 셋에 추가하고 오른쪽 포인터를 한 칸 옮깁니다.
                set.add(s.charAt(right));
                right++;
                // 최대 길이를 갱신합니다.
                maxLength = Math.max(maxLength, right - left);
            } else {
                // 오른쪽 포인터가 가리키는 문자가 셋에 이미 있는 경우
                // 왼쪽 포인터가 가리키는 문자를 셋에서 제거하고 왼쪽 포인터를 한 칸 옮깁니다.
                set.remove(s.charAt(left));
                left++;
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        ltc3 solution = new ltc3();
        String testString = "abcabcbb";
        System.out.println("The length of the longest substring without repeating characters is: " + solution.lengthOfLongestSubstring(testString));
    }
}