public class Main {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode n1 = new ListNode(2);
        ListNode n2 = new ListNode(3);
//        ListNode n3 = new ListNode(4);
        ListNode n4 = new ListNode(3);
        ListNode n5 = new ListNode(2);
        ListNode n6 = new ListNode(1);
        head.next = n1;
        n1.next = n2;
        n2.next = n4;
    //    n3.next = n4;
        n4.next=n5;
        n5.next=n6;

        System.out.println(isPalindrome(head));



    }

    public static boolean isPalindrome(ListNode head)
    {

// first we need to get the middle element
// reverse the linked list from the element after middle till end
// loop from the two parts if the two element not equal return false;
        ListNode middle=head;
        ListNode fast=head;
        while(fast!=null&& fast.next!=null)
        {

        fast=fast.next.next;
        middle=middle.next;

        }
        ListNode tail=null;
        ListNode curr=middle;
        ListNode nextNode=middle;

        while (nextNode!=null)
        {
        nextNode=nextNode.next;
        curr.next=tail;
        tail=curr;
        curr=nextNode;
        }
        fast=head;

        while (tail!=null)
        {

            if(fast.value!=tail.value){

                return false;
            }

            fast=fast.next;
            tail=tail.next;

        }



        return true;
    }






}
