// Binary tree means tree with only two branch i.e left and right for each branch(or Node)

import java.util.LinkedList;
import java.util.Queue;

class Node{
    int data;
    Node left;
    Node right;

    Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}

class BinaryTree{
    int index=-1;
    // int index=0; // Give wrong output 
    Node buildTree(int[] nodes){
        index++;
        if(nodes[index]==-1){
            return null;
        }
        Node newNode = new Node(nodes[index]);
        // index++; // Give wrong output 
        newNode.left=buildTree(nodes);
        newNode.right=buildTree(nodes);

        return newNode;
    }

    void preorder(Node root){ // Prints the nodes in preorder sequence i.e. root, left, right
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

    void inorder(Node root){ // Prints the nodes in inorder sequence i.e. left, root, right
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    void postorder(Node root){ // Prints the nodes in postorder sequence i.e. left, right, root
        if(root==null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }

    void levelorder(Node root){ // Prints the nodes in levelorder sequence i.e. level by level here we use iteration and queue and not the recursion
        // Here (BFS) Breath First Search is used which means after 2, 3 will be print not the 4 and 5, while (DFS) Depth First Search is vice versa
        // What is the BFS trivarsal of Tree? Ans: Level order traversal.
        // What is the DFS trivarsal of Tree? Ans: Preorder traversal , inorder traversal and postorder traversal because we are goint in depth.
        // Time complexity in all the methods will be linear O(n).
        if(root==null){
            return;
        }

        Queue<Node> q=new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            Node currNode = q.remove();
            if(currNode==null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }else{
                System.out.print(currNode.data+" ");
                if(currNode.left!=null){
                    q.add(currNode.left);
                }
                if(currNode.right!=null){
                    q.add(currNode.right);
                }
            }
        }
    }

    int countOfNodes(Node root){
        if(root==null){
            return 0;
        }

        int leftNodes = countOfNodes(root.left);
        int rightNodes = countOfNodes(root.right);

        return leftNodes+rightNodes+1;
        // time complexity O(n)
    }
    int sumtOfNodes(Node root){
        if(root==null){
            return 0;
        }

        int leftSum = sumtOfNodes(root.left);
        int rightSum = sumtOfNodes(root.right);

        return leftSum+rightSum+root.data;
        // time complexity O(n)
    }

    int height(Node root){
        if(root==null){
            return 0;
        }

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        int myHeight = Math.max(leftHeight, rightHeight)+1;
        return myHeight;
    }

    int diameter(Node root){
        /* This has two types:
            1. passing throught root node
            2. not passing throught root node 
            Also, It has two different approach..
        */
        // Apporach 1: O(n^2)
            /*  Steps:
                    1. Calculating Diameter 1st = diameter of Left Sumbtree
                    2. Calculating Diameter 2nd = diameter of Right Sumbtree
                    3. Calculating diameter 3rd = MAX(LH,RH,LH + RH +1)
            */
        
            if(root==null){
                return 0;
            }

            int diam1 = diameter(root.left);
            int diam2 = diameter(root.right);
            int diam3 = height(root.left) + height(root.right) + 1;

            return Math.max(diam3, Math.max(diam1, diam2));

    }

    TreeInfo improvedDiameter(Node root){

        if(root==null){ // Base case
            return new TreeInfo(0,0);
        }
        TreeInfo left = improvedDiameter(root.left);
        TreeInfo right = improvedDiameter(root.right);

        int myHeight = Math.max(left.ht,right.ht)+1;

        int diam1 = left.diam;
        int diam2 = right.diam;
        int diam3 = left.ht + right.ht +1;

        int mydiam = Math.max(Math.max(diam1,diam2),diam3);

        TreeInfo myInfo = new TreeInfo(myHeight, mydiam);
        return myInfo;
    }
}

class TreeInfo{ // this class for Approach 2
    int ht;
    int diam;
    TreeInfo(int ht,int diam){
        this.ht=ht;
        this.diam=diam;
    }
}

class Main {

    public static void main(String[] args) {
        // Build Tree from given Preorder Sequence

        int[] nodes ={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1}; // given nodes in preorder sequence
        // int[] nodes={1,2,4,-1,-1,-1,-1}; //wrond preorder given

        BinaryTree t=new BinaryTree();
        Node root=t.buildTree(nodes);
        System.out.println(root.data);
        System.out.println("Preorder:");
        t.preorder(root);
        System.out.println("\nInOrder:");
        t.inorder(root);
        System.out.println("\nPostOrder:");
        t.postorder(root);
        System.out.println("\nLevelOrder:");
        // t.levelorder(root);
        // System.out.println(t.countOfNodes(root));
        // System.out.println(t.sumtOfNodes(root));
        // System.out.println(t.height(root));
        // System.out.println(t.diameter(root));
        // System.out.println(t.improvedDiameter(root).diam);
    }
}


// Question practice

public class All_TreeBinaryMethods{
    public static void main(String[] args) {
        // 1. Subtree of another tree
            // Refer https://leetcode.com/problems/subtree-of-another-tree/
    }
}