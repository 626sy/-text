package com.neusoft.LeetCode;

/**
 * @author shihaobo
 * @date 2020/9/18 18:44
 */
public class fanzhuanlianbia {
    public ListNode reverseList(ListNode head) {
        ListNode prev=null;
        ListNode curr = head;
        ListNode temp = null;
        while(curr!=null){
            temp = curr.next;
            curr.next=prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }

//    public static void main(String[] args) {
//        fanzhuanlianbia fanzhuanlianbia = new fanzhuanlianbia();
//        fanzhuanlianbia.reverseList(arr[0])
//    }
}
