import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] arr = new int[n];
            
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            
            Map<Long, Long> mp = new HashMap<>();
            for (int num : arr) {
                mp.put((long)num, mp.getOrDefault((long)num, 0L) + 1);
            }
            
            long ans = 0;
            for (Map.Entry<Long, Long> entry : mp.entrySet()) {
                long cur = entry.getValue();
                ans += cur * (cur - 1) / 2;
            }
            
            System.out.println(ans);
        }
        
        scanner.close();
    }
}
