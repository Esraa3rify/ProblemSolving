  public static class Solution1 {
        /**
         * this solution takes between 7 and 8 ms to finish on LeetCode
         * beats around 38% to 48% submissions as of 6/27/2020
         */
        public boolean wordBreak(String s, List<String> wordDict) {
            int n = s.length();
            boolean[] dp = new boolean[n + 1];
            dp[0] = true;
            for (int i = 1; i <= n; i++) {
                for (int j = 0; j < i; j++) {
                    if (dp[j]
                            &&
                            wordDict.contains(s.substring(j, i))) {
                        dp[i] = true;
                        break;
                    }
                }
            }
            CommonUtils.printArray(dp);
            return dp[n];
        }
    }
