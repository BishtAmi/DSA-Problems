import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            String s = scanner.next();
            HashMap<Character, List<Integer>> mp = new HashMap<>();
            
            for (int i = 0; i < n; i++) {
                char ch = s.charAt(i);
                if (!mp.containsKey(ch)) {
                    mp.put(ch, new ArrayList<>());
                }
                mp.get(ch).add(i + 1);
            }
            
            long ans = 0;
            for (char ch = 'a'; ch <= 'z'; ch++) {
                if (mp.containsKey(ch)) {
                    List<Integer> positions = mp.get(ch);
                    int sz = positions.size() - 1;
                    int cnt = 0;
                    for (int x : positions) {
                        ans += (long) cnt * x - (long) sz * x;
                        cnt++;
                        sz--;
                    }
                }
            }
            System.out.println(ans);
        }
        scanner.close();
    }
}
