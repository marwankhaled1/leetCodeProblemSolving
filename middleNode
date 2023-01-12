public class Main {
    public static void main(String[] args) {
        ListNode head=new ListNode(1);
        ListNode n1=new ListNode(2);
        ListNode n2=new ListNode(3);
        ListNode n3=new ListNode(4);


        head.next=n1;
        n1.next=n2;
        n2.next=n3;
        n3.next=head;

        System.out.println(middleNode(head));


    }

    public static ListNode middleNode(ListNode head)
    {

    ListNode slow=head;
    ListNode fast=head;


    while (fast!=null&& fast.next!=null)
    {


    fast=fast.next.next;
    slow=slow.next;

    }


    return slow;
    }




}
