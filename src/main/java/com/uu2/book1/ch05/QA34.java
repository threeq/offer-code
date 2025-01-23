package com.uu2.book1.ch05;

public class QA34 {
    /**
     * 外星语言排序
     */
    public boolean isAlienSorted(String[] words, String order) {
        int[] orderArray = new int[order.length()];
        for (int i = 0; i < order.length(); i++) {
            orderArray[order.charAt(i) - 'a'] = i;
        }
        for (int i = 1; i < words.length; i++) {
            String s1 = words[i - 1];
            String s2 = words[i];
            if(!isSorted(s1,s2,orderArray)) {
                return false;
            }
        }
        return true;
    }

    private boolean isSorted(String s1, String s2, int[] orderArray) {
        int i=0;
        while(i < s1.length() && i < s2.length()) {
            if(orderArray[s1.charAt(i) - 'a'] < orderArray[s2.charAt(i) - 'a']) {
                return true;
            } else if(orderArray[s1.charAt(i) - 'a'] == orderArray[s2.charAt(i) - 'a']) {
                i++;
            } else {
                return false;
            }
        }
        return i == s1.length();
    }
}
