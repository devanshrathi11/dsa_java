public class longest_palindrome2 {
    public int longestPalindrome(String s) {
        int[] cnt = new int[128];
        for (char c : s.toCharArray()) {
            cnt[c]++;
        }
        int ans = 0;
        for (int v : cnt) {
            ans += v / 2 * 2;
            if (v % 2 == 1 && ans % 2 == 0) {
                ans++;
            }
        }
        return ans;
    }
    
    public static void main(String[] args) {
        longest_palindrome2 lp = new longest_palindrome2();
        System.out.println(lp.longestPalindrome("abccccdd"));
    }
    
}
