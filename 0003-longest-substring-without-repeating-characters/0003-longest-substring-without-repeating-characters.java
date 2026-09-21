class Solution {
    public int lengthOfLongestSubstring(String s) {
   int[] count = new int[256];
 int left = 0; int maxLen = 0;
   for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);
            count[ch]++;
            while (count[ch] > 1) {
                count[s.charAt(left)]--;
                left++;
            } maxLen = Math.max(maxLen, right - left + 1);
        }
 return maxLen;
    }
}