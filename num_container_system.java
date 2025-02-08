public class num_container_system {
    public int numContainer(String s) {
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
        num_container_system ncs = new num_container_system();
        System.out.println(ncs.numContainer("abccccdd"));
    }
    
}
