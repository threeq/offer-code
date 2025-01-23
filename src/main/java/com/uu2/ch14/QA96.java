package com.uu2.ch14;

public class QA96 {
    /**
     * 字符串交织
     */
    public boolean interleave(String s1, String s2, String s3) {
        if (s1.length() + s2.length() != s3.length()) {
            return false;
        }
        if(s1.isEmpty()) {
            return s3.equals(s2);
        }
        if(s2.isEmpty()) {
            return s3.equals(s1);
        }

        boolean[][] dp = new boolean[s1.length() + 1][s2.length() + 1];
        dp[0][0] = true;
        for (int i = 0; i < s1.length(); i++) {
            dp[i+1][0] = dp[i][0] && s1.charAt(i) == s3.charAt(i);
        }
        for (int j =0; j < s2.length(); j++) {
            dp[0][j+1] = dp[0][j] && s2.charAt(j) == s3.charAt(j);
        }

        for (int i = 1; i <= s1.length(); i++) {
            for (int j = 1; j <= s2.length(); j++) {
                char ch1 = s1.charAt(i - 1);
                char ch2 = s2.charAt(j - 1);
                char ch3 = s3.charAt(i + j - 1);
                dp[i][j] = (ch1 == ch3 && dp[i - 1][j])
                        || (ch2 == ch3 && dp[i][j - 1]);
            }
        }

        return dp[s1.length()][s2.length()];
    }

    public boolean interleave2(String s1, String s2, String s3) {
        if (s1.length() + s2.length() != s3.length()) {
            return false;
        }
        if (s1.length() < s2.length()) {
            return interleave2(s2, s1, s3);
        }

        boolean[] dp = new boolean[s2.length() + 1];
        dp[0] = true;
        for (int i = 1; i <= s2.length(); i++) {
            dp[i] = dp[i - 1] && s2.charAt(i - 1) == s3.charAt(i - 1);
        }

        for (int i = 1; i <= s1.length(); i++) {
            dp[0] = dp[0] && s1.charAt(i - 1) == s3.charAt(i - 1);
            for (int j = 1; j <= s2.length(); j++) {
                char ch1 = s1.charAt(i - 1);
                char ch2 = s2.charAt(j - 1);
                char ch3 = s3.charAt(i+ j - 1);
                dp[j] = (ch1 == ch3 && dp[j])
                        || (ch2 == ch3 && dp[j - 1]);
            }
        }

        return dp[s2.length()];
    }
}
