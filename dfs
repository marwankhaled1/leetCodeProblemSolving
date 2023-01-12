public class Main {
    public static void main(String[] args) {

        Node rootNode=new Node(5);
        Node n1=new Node(2);
        Node n2=new Node(8);
        rootNode.left=n1;
        rootNode.right=n2;
        // preOrder traverse
        preOrderDfs(rootNode);
        // inOrder traverse
        inOrderDfs(rootNode);
        // postOrder traverse
        postOrdersOrderDfs(rootNode);

    }


    public static void preOrderDfs(Node root)
    {
        if (root!=null)

        {
            System.out.println(root.value);
            preOrderDfs(root.left);
            preOrderDfs(root.right);


        }

    }

    public static void inOrderDfs(Node root)
    {
        if (root!=null)

        {
            inOrderDfs(root.left);
            System.out.println(root.value);
            inOrderDfs(root.right);


        }

    }

    public static void postOrdersOrderDfs(Node root)
    {
        if (root!=null)

        {
            postOrdersOrderDfs(root.left);
            postOrdersOrderDfs(root.right);
            System.out.println(root.value);

        }

    }

}
