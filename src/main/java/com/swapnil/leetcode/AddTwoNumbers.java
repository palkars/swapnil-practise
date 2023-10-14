package com.swapnil.leetcode;

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode firstNode = null, prevNode = null;
        ListNode lp1 = l1;
        ListNode lp2 = l2;
        while (lp1 != null) {
            int val = lp1.val;
            if (lp2 != null) {
                val += lp2.val;
                lp2 = lp2.next;
            }
            ListNode l = new ListNode(val);
            if (firstNode == null) {
                firstNode = l;
            }
            if(prevNode != null) {
                prevNode.next = l;
            }
            prevNode = l;
            lp1 = lp1.next;
        }
        while(lp2!=null) {
            ListNode l = new ListNode(lp2.val);
            if (firstNode == null) {
                firstNode = l;
            }
            if(prevNode != null) {
                prevNode.next = l;
            }
            prevNode = l;
            lp2 = lp2.next;
        }

        if(firstNode!=null){
            lp1 = firstNode;
            while(lp1!=null){
                if(lp1.val>=10){
                    lp1.val = lp1.val%10;
                    if(lp1.next!=null){
                        lp1.next.val++;
                    }else{
                        lp1.next = new ListNode(1);
                    }
                }
                lp1=lp1.next;

            }
        }
        return firstNode;
    }
}
