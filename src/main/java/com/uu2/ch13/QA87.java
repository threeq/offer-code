package com.uu2.ch13;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class QA87 {
    /**
     * 恢复IP地址
     */
    public List<String> restoreIpAddresses(String s) {
        List<String> res = new LinkedList<>();
        helper(s, 0, 0, "", "", res);
        Collections.reverse(res);
        return res;
    }

    private void helper(String s, int i, int segI, String seg, String ip, List<String> res) {
        if (i == s.length() && segI == 3 && isValidSeg(seg)) {
            res.add(ip + seg);
            return;
        }
        if (i < s.length() && segI <= 3) {
            char ch = s.charAt(i);
            if (isValidSeg(seg + ch)) {
                helper(s, i + 1, segI, seg + ch, ip, res);
            }
            if (!seg.isEmpty() && segI < 3) {
                helper(s, i + 1, segI + 1, "" + ch, ip + seg + ".", res);
            }
        }
    }

    private boolean isValidSeg(String seg) {
        return !seg.isEmpty() && Integer.parseInt(seg) <= 255
                && (seg.equals("0") || seg.charAt(0) != '0');
    }

}
