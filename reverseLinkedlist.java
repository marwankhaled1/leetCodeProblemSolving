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
    public ListNode reverseList(ListNode head) {
         ListNode prev=head;
        ListNode curr=head;
        ListNode temp=head;

        if(temp==null || temp.next==null){

           return  head;

        }
        temp=temp.next;
        prev.next=null;
        curr=temp;



        while(temp!=null)
        {

        temp=temp.next;
        curr.next=prev;
         prev=curr;
        curr=temp;

        }




        return  prev;
    }
}
