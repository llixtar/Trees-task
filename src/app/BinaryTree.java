package app;

public class BinaryTree {

    Node root;

    public static void main(String[] args) {
        viewResults(createTree());
    }
    public static void viewResults(BinaryTree tree){

        System.out.print("\nInorder traversal: ");
        tree.traverseInOrder(tree.root);

        System.out.print("\nPreorder traversal: ");
        tree.traversePreOrder(tree.root);

        System.out.print("\nPostorder traversal: ");
        tree.traversePostOrder(tree.root);

    }
    private static BinaryTree createTree(){
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(17);

        tree.root.left = new Node(26);
        tree.root.right = new Node(25);

        tree.root.left.left = new Node(8);
        tree.root.left.right = new Node(14);

        tree.root.left.left.left = new Node(31);
        tree.root.left.left.right = new Node(24);

        tree.root.left.right.left = new Node(13);
        tree.root.left.right.right = new Node(51);

        tree.root.right.left = new Node(9);
        tree.root.right.right = new Node(2);
        tree.root.right.right.right = new Node(1);

        return tree;
    }

    BinaryTree() {
        root = null;
    }

    public void traverseInOrder(Node node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.key);
            traverseInOrder(node.right);
        }
    }

    public void traversePostOrder(Node node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(" " + node.key);
        }
    }

    public void traversePreOrder(Node node) {
        if (node != null) {
            System.out.print(" " + node.key);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }
}
