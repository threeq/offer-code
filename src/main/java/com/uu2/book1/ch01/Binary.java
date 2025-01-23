package com.uu2.book1.ch01;

public class Binary {
    // 题2
    public String add(String a, String b) {
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        StringBuilder result = new StringBuilder();
        while (i >= 0 || j >= 0) {
            int digitA = i >= 0 ? a.charAt(i--) - '0' : 0;
            int digitB = j >= 0 ? b.charAt(j--) - '0' : 0;
            int sum = digitA + digitB + carry;
            if (sum >= 2) {
                carry = 1;
                sum = sum - 2;
            } else {
                carry = 0;
            }
            result.append(sum);
        }
        if (carry == 1) {
            result.append(carry);
        }
        return result.reverse().toString();
    }

    // 题3
    public int[] countBits1(int num) {
        int[] result = new int[num + 1];
        for (int i = 0; i <= num; i++) {
            int j = i;
            while (j > 0) {
                result[i]++;
                j = j & (j - 1);
            }
        }
        return result;
    }

    public int[] countBits2(int num) {
        int[] result = new int[num + 1];
        for (int i = 1; i <= num; i++) {
            result[i] = result[i >> 1] + (i & 1);
        }
        return result;
    }

    public int[] countBits(int num) {
        int[] result = new int[num + 1];
        for (int i = 1; i <= num; i++) {
            result[i] = result[i & (i - 1)] + 1;
        }
        return result;
    }

    // 题4
    public int singleNumber2(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result ^= nums[i];
        }
        return result;
    }

    public int singleNumber3(int[] nums) {
        int[] bitSums = new int[32];
        for (int num : nums) {
            for (int i = 0; i < 32; i++) {
                bitSums[i] += (num >> (31 - i)) & 1;
            }
        }
        int result = 0;
        for (int i = 0; i < 32; i++) {
            result = (result << 1) + bitSums[i] % 3;
        }
        return result;
    }
}
