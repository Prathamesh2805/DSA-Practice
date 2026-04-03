package Tree;

import javax.swing.plaf.ColorUIResource;

public class BinarySearchTreeSyntax {
    public static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static class BinarySearchTree {
        Node root;

        public void addToTree(int data) {
            Node myNode = new Node(data);
            if (root == null) {
                root = myNode;
            } else {
                Node current = root;
                while (true) {
                    if (data < current.data) {
                        if (current.left == null) {
                            current.left = myNode;
                            break;
                        } else {
                            current = current.left;
                        }
                    } else {
                        if (current.right == null) {
                            current.right = myNode;
                            break;
                        } else {
                            current = current.right;
                        }

                    }

                }

            }

        }

        public void insertToTree(int data) {
            Node myNode = new Node(data);
            if (root == null) {
                root = myNode;
            } else {
                Node Current = root;
                Node Parent = null;

                while (Current != null) {
                    Parent = Current;
                    if (data < Current.data) {
                        Current = Current.left;
                    } else {
                        Current = Current.right;
                    }

                }
                if (data < Parent.data) {
                    Parent.left = myNode;
                } else {
                    Parent.right = myNode;
                }

            }
        }


        public void inOrderTraversal() {
            inOrderTraversal(root);
        }
        public void inOrderTraversal(Node root) {
            if (root == null) return;
            inOrderTraversal(root.left);
            System.out.print(root.data + " ");
            inOrderTraversal(root.right);
        }


        public void preOrderTraversal(){
            preOrderTraversal(root);
        }
        public void preOrderTraversal(Node root){
            if (root == null) return;
            System.out.print(root.data + " ");
            preOrderTraversal(root.left);
            preOrderTraversal(root.right);
        }


        public void postOrderTraversal(){
            postOrderTraversal(root);
        }
        public void postOrderTraversal(Node root){
            if (root == null) return;
            postOrderTraversal(root.left);
            postOrderTraversal(root.right);
            System.out.print(root.data + " ");
        }

    }

    static void main(String[] args) {
        BinarySearchTree BST = new BinarySearchTree();

        BST.addToTree(10);
        BST.addToTree(43);
        BST.addToTree(78);
        BST.addToTree(12);
        BST.addToTree(73);
        BST.insertToTree(69);
        BST.insertToTree(42);
        BST.insertToTree(83);
        BST.insertToTree(9);
        BST.insertToTree(93);

        System.out.print("In order traversal: ");
        BST.inOrderTraversal();
        System.out.println();

        System.out.print("Pre order traversal: ");
        BST.preOrderTraversal();
        System.out.println();

        System.out.print("Post order traversal: ");
        BST.postOrderTraversal();
        System.out.println();
    }
}
