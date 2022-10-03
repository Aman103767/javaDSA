class Node{
    int data ;
    Node left;
    Node right;

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", left=" + left +
                ", right=" + right +
                '}';
    }

    public Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
}
class Main{
    Node root;
    static void preorder(Node root){
        if(root == null){
            return ;
        }
        System.out.println(root.data);
        preorder(root.left);
        preorder(root.right);

    }
    public static void main(String args []){
        Main m = new Main();
        m.root = new Node(10);
        Node n1 = new Node(12);
        Node n2 = new Node(15);
        Node n3 = new Node(17);
        Node n4 = new Node(19);
        m.root.left = n1;
        m.root.right = n2;
        n1.left = n3;
        n1.right = n4;
        preorder(m.root);
    }
}