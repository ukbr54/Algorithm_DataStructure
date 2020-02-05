package com.made.easy.dataStructure.tree.binaryTree;

import java.util.ArrayDeque;

/**
 * 1. Traverse the left subtree
 * 2. visit root
 * 3. Traverse the right subtree
 */
public class BinaryInOrderTraversal {

    public static void inOrder(TreeNode root){
        if(root == null){
            return;
        }else{
            inOrder(root.left);
            System.out.printf("%d ",root.data);
            inOrder(root.right);
        }
    }

    /**
     * 1. Create a empty stack and initialize currentNode as root.
     * 2. Push the currentNode in stack and set currentNode = currentNode.left until currentNode is NULL.
     * 3. If currentNode is NULL and s is not empty then
     *    a) pop the node from stack and print it
     *    b) set currentNode = currentNode.right
     *    c) go to step 2
     * @param root
     */
    public static void inOrderIterative(TreeNode root){
        if(root == null){
            return;
        }else{
            ArrayDeque<TreeNode> stack = new ArrayDeque<>();
            TreeNode currentNode = root;

            while(!stack.isEmpty() || currentNode != null){
                if(currentNode != null){
                    stack.push(currentNode);
                    currentNode = currentNode.left;
                }else {
                    TreeNode node = stack.pop();
                    System.out.printf("%d ",node.data);
                    currentNode = node.right;
                }
            }
        }
    }

    public static TreeNode createBinaryTree(){
        TreeNode rootNode =new TreeNode(40);
        TreeNode node20=new TreeNode(20);
        TreeNode node10=new TreeNode(10);
        TreeNode node30=new TreeNode(30);
        TreeNode node60=new TreeNode(60);
        TreeNode node50=new TreeNode(50);
        TreeNode node70=new TreeNode(70);

        rootNode.left = node20;
        rootNode.right = node60;

        node20.left=node10;
        node20.right=node30;

        node60.left=node50;
        node60.right=node70;

        return rootNode;
        /**
         *                     40
         *                     /\
         *                    20 60
         *                   / \  / \
         *                  10 30 50 70
         */
    }

    public static void main(String[] args) {
        final TreeNode binaryTree = createBinaryTree();
        inOrder(binaryTree);
        System.out.println();
        inOrderIterative(binaryTree);
    }
}
