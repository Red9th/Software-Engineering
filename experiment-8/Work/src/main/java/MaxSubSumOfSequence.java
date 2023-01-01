import java.util.Scanner;

public class MaxSubSumOfSequence {
    static public int solve(int a[], int n) {
        int[] f = new int[110];
        int ans = 0;
        for(int i = 1; i <= n; i ++) {
            int sum = f[i - 1] + a[i];
            if(sum > 0)
                f[i] = sum;
            ans = Math.max(ans, f[i]);
        }
        return ans;
    }

    public static void main(String []args) {
        int[] a = new int[110];
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i = 1; i <= n; i ++) {
            if(s.hasNext())
                a[i] = s.nextInt();
        }
        System.out.println(solve(a, n));
    }
}
