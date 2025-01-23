package com.uu2.book1.ch04;

public class QA25 {
    /**
     * 链表中的数字相加
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        QA24 qa24 = new QA24();
        l1 = qa24.reverseList(l1);
        l2 = qa24.reverseList(l2);

        ListNode reverseAdd = addReversed(l1, l2);
        return qa24.reverseList(reverseAdd);
    }

    private ListNode addReversed(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode sumNode = dummy;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int val1 = l1 == null ? 0 : l1.val;
            int val2 = l2 == null ? 0 : l2.val;
            int sum = val1 + val2 + carry;
            carry = sum / 10;
            int val = sum % 10;

            sumNode.next = new ListNode(val);
            sumNode = sumNode.next;

            l1 = l1 == null ?null : l1.next;
            l2 = l2 == null ?null : l2.next;
        }
        if (carry > 0) {
            sumNode.next = new ListNode(carry);
        }
        return dummy.next;
    }
}
