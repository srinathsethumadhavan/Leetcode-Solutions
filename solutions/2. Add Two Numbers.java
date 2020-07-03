/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        int sum=0;
        int carry=0;
        ListNode l3 = new ListNode(0);
        ListNode head = l3;
        while(l1!=null || l2!=null)
        {
               sum=carry;
                if(l1!=null)
                    sum+=l1.val;
            if(l2!=null)   
                    sum+=l2.val;
             System.out.println("sum"+sum);
                carry=sum/10;

                ListNode newNode=new ListNode(sum%10);
                l3.next=newNode;
                 
                if(l1!=null)
                    l1=l1.next;
                if(l2!=null)
                    l2=l2.next;
                l3=l3.next;
        } 
        if(carry > 0){
            ListNode newNode=new ListNode(carry);  
            l3.next=newNode;
           l3= l3.next;
        }
        
        return head.next;
        
        
    }
}