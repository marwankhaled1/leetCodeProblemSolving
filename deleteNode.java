import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        

    }
    public void deleteNode(ListNode node) {
        // delete node given only the node we want to delete not the head of the liked list
        // if we can't get prev that move values
        
        node.value=node.next.value;
        node.next=node.next.next;

    }


}
