/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        
        
        ListNode dummy = new ListNode(-1);
        ListNode pre = dummy;
        dummy.next = head;
        for(int i=0;i<m-1;i++)
            pre=pre.next;
        ListNode current = pre.next;
        
        while(m++<n){
            ListNode temp = current.next;
            current.next = temp.next;
            temp.next = pre.next;
            pre.next = temp;
        }
        return dummy.next;
    }
}
​
​
​
 
       
