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
        n2.next=n1;

        System.out.println(checkcyclic(head));


    }

    public static Boolean checkcyclic(Node head)
    {
       // loop on linked list while not reached the null with fast and slow ptr fast-->2,  slow -->1
        // if fast == slow that's mean there is a cyclic return true
        // after end loop there is no cycle and return false
        Node slow=head;
        Node fast=head.next;
        while (fast!=null && fast.next!=null){


            if(fast==slow){

                return true;

            }

            fast=fast.next.next;
            slow=slow.next;

        }

      return false;
    }

}
