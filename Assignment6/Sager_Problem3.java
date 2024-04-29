/* The following program implements a binary search tree and prints
 * all of the leaf nodes of the tree. It does so by recursively inserting
 * objects of the Node class to the BinarySearchTre in the correct position 
 * (object on left less than parent, object on right greater than parent).
 */

class Node { //bst node class
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class BinarySearchTree {
    Node root; //can see in main function

    public BinarySearchTree() {
        this.root = null;
    }

    public void insert(int data) { 
        root = insertRec(root, data);
    }

    private Node insertRec(Node root, int data) {
        //if left or right empty when seen, add data in new node
        if (root == null) { 
            root = new Node(data);
            return root;
        }
        if (data < root.data) {
            root.left = insertRec(root.left, data);
        } else if (data > root.data) {
            root.right = insertRec(root.right, data);
        }
        //System.out.println(root.data); //print statement for debugging
        return root;
    }

    //recursively iterate throgh tree to find leaf nodes
    public void printLeafNodes(Node node) { 
        if (node == null) {
            return;
        }
        if (node.left == null && node.right == null) {
            System.out.print(node.data + " ");
        }
        printLeafNodes(node.left);
        printLeafNodes(node.right);
    }
}

public class Sager_Problem3 {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        bst.insert(10);
        bst.insert(7);
        bst.insert(14);
        bst.insert(20);
        bst.insert(1);
        bst.insert(5);
        bst.insert(8);

        System.out.print("Leaf nodes: ");
        bst.printLeafNodes(bst.root);
    }
}

