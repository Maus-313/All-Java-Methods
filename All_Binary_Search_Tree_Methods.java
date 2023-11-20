import java.util.ArrayList;

class Node{
    int data;
    Node left;
    Node right;

    Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class BST{
    // They have O(log(n)) or O(H) time complexity where H is height of the tree and n is number of node where as the normal Bimarch tree has O(n) time complexity

    // In BST
        // a. Left Subtree Nodes < Root
        // b. Right Subtree Nodes > Root
        // c. Left Subtree Nodes < Root
        // bydefault there is no duplicate node
        // special BST has duplicate nodes (It will be mentioned in the question)

    // In BST we can perform following operations
        // 1. Insert
        // 2. Search
        // 3. Delete
        // 4. Preorder
        // 5. Inorder

    // Properties:
        // 1. Inorder Traversal of BST gives a sorted sequences
        // 2. BST makes search efficient.
        // 3. Most problems will be solved using recursion and i.e by dividing into subproblems & making recursive calls on subtrees.

    Node insert(Node root, int val){
        if(root == null){
            root =new Node(val);
            return root;
        }

        if(root.data > val){
            // left subtree
            root.left = insert(root.left, val);
        }else{
            root.right = insert(root.right, val);
        }

        return root;
    }

    void inorder(Node root){

        if(root==null){
            return;
        }

        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    boolean search(Node root, int key){
        // Time complexity O(H)
        if(root==null){
            return false;
        }

        if(root.data>key){
            return search(root.left,key);
        }else if(root.data==key){
            return true;
        }else{
            return search(root.right,key);
        }
    }

    Node delete(Node root, int val){
        // Delete a node
        // Case 1. Node with no child(Leaf Node)
            // replace node with null
        // Case 2. Node with one child
            // replace node with child
        // Case 3. Node with two child
            // replacing node with the inorder successor
            // And delete the node for inorder successor
            // inorder successor always has 0 or 1 child
            // the successor will be the leftmost node in the right subtree
        if(root.data>val){
            root.left = delete(root.left,val);
        }
        if(root.data<val){
            root.right = delete(root.right,val);
        }
        if(root.data==val){
            // case 1
            if(root.left == null && root.right == null){
                return null;
            }

            // case 2
            if(root.left == null){
                return root.right;
            }else if(root.left==null){
                return root.left;
            }

            // case 3
            Node IS = inorderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }

        return root;
    }

    Node inorderSuccessor(Node root){
        while(root.left!=null){
            root=root.left;
        }
        return root;
    }

    // Question:https://leetcode.com/problems/range-sum-of-bst/
    void printInRange(Node root, int X,int Y){
        // base case
        if(root==null){
            return;
        }
        // case 1. X<=root.data<=Y
        if(root.data>=X && root.data<=Y){
            printInRange(root.left, X, Y);
            System.out.print(root.data+" ");
            printInRange(root.right, X, Y);
        }
        // case 2. Y<=root.data
        else if(root.data>=Y){
            printInRange(root.left, X, Y);
        }
        // case 3. X<=root.data
        else if(root.data<=X){
            printInRange(root.right, X, Y);
        }
    }

    // Question: https://leetcode.com/problems/sum-of-root-to-leaf-binary-numbers/
    void printPath(ArrayList<Integer> path){
        for(int i=0;i<path.size();i++){
            System.out.print(path.get(i)+"->");
        }
        System.out.println();
    }
    void printRoot2Leaf(Node root,ArrayList<Integer> path){

        if(root == null){ // base condition
            return;
        }
        path.add(root.data);

        if(root.left==null && root.right==null){ // leaf condition
            printPath(path);
        }else{
            printRoot2Leaf(root.left, path);
            printRoot2Leaf(root.right, path);
        }
        path.remove(path.size()-1);
    }
}

public class All_Binary_Search_Tree_Methods {
    public static void main(String[] args) {
        
    }
}

class Main{
    public static void main(String[] args) {
        int[] values = {8,5,3,1,4,6,10,11,14};
        Node root = null;
        BST t = new BST();
        for(int i=0;i<values.length;i++){
            root = t.insert(root,values[i]);
        }
        // t.inorder(root);
        // System.out.println();
        // t.delete(root, 4);
        // t.inorder(root);
        // System.out.println();
        // t.delete(root, 5);
        // t.inorder(root);

        // t.printInRange(root, 6, 10);
        ArrayList<Integer> path=new ArrayList<>();
        t.printRoot2Leaf(root, path);
    }
}