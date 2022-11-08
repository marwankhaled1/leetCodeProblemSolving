import org.w3c.dom.xpath.XPathResult;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Node head=new Node(1);
        Node n1=new Node(2);
        Node n2=new Node(3);
        Node n3=new Node(4);


        head.next=n1;
        n1.next=n2;
        n2.next=n3;
        n3.next=head;

        System.out.println(first(head));


    }

    public static int  first(Node head)
    {
     int firstElementOfCycle=0;
     // deliver pointer to cycle using fast and slow pointers
     // the delivered pointer will be used to calculate the length of the cyclic
     //set the fast and slow pointers again to head
     //increment the fast pointer k nodes (length of cycle)
     // increment the two pointers by 1 till fast and slow meet while increment firstElementOfCycle
     // return firstElementOfCycle
       Node slow=head;
       Node fast=head.next;
       Node IsCyclic= delivertoCycle(head,slow,fast);
        if(IsCyclic==null)
        {

            return -1;

        }
       slow=IsCyclic;
       int cycleLength=calculateCycleLength(slow);
        slow=head;
        fast=head;

        for(int i=0;i<cycleLength;i++){

            fast=fast.next;

        }


        while(fast!=slow){

            fast=fast.next;
            slow=slow.next;
            firstElementOfCycle++;


        }


        return firstElementOfCycle;
    }

    private static int calculateCycleLength(Node slow) {

        Node temp=slow.next;
        int cycleLength=1;


        while(temp!=slow){

            temp=temp.next;
            cycleLength++;

        }


        return cycleLength;

    }

    private static Node delivertoCycle(Node head, Node slow, Node fast)
    {

   while (fast!=null&&fast.next!=null){


       if(slow==fast)
       {

           return slow;

       }

       fast=fast.next.next;
       slow=slow.next;

   }


   return null;

    }
}
