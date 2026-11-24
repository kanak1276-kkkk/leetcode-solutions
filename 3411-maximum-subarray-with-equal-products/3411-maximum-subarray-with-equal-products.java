class Solution {
    public int maxLength(int[] nums) {
        int n = nums.length;
        long maxLcm = 1;
        long maxVal = 0;

        for (int x : nums) {
            maxLcm = lcm(maxLcm, x);
            maxVal = Math.max(maxVal, x);
        }

        long maxLimit = maxLcm * maxVal;
        int ans = 1;

        for (int i = 0; i < n; i++) {
            long prod = 1;
            long g = 0;
            long l = 1;

            for (int j = i; j < n; j++) {
                long x = nums[j];
                
                   if (prod > maxLimit / x) {
                    break;
                }
                
                prod *= x;
                g = gcd(g, x);
                l = lcm(l, x);

                if (prod == l * g) {
                    ans = Math.max(ans, j - i + 1);
                }
            }
        }

        return ans;
    }

    private long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    private long lcm(long a, long b) {
        return (a / gcd(a, b)) * b;
    }
}