package com.made.easy.dataStructure.tree.binaryTree;

import java.util.ArrayDeque;

/**
 * 1. Visit root
 * 2. Traverse Left subtree
 * 3. Traverse Right subtree
 */
public class BinaryPreOrderTraversal {

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

    /**
     * Time Complexity: o(n) and Space Complexity: O(n)
     * @param root
     */
    public static void preorder(TreeNode root){
        if(root == null){
            return;
        }else {
            System.out.printf("%d ",root.data);
            preorder(root.left);
            preorder(root.right);
        }
    }

    /**
     *  Time Complexity: O(n) & Space Complexity: O(n)
     *  1. Create empty stack and push the root node to it.
     *  2. When stack is not empty
     *     a)Pop a node from stack and print it.
     *     b)push the right child of popped node to stack.
     *     c)push the left child of popped node to stack.
     * @param root
     */
    public static void preOrderIterartive(TreeNode root){
        if(root == null){
            return;
        }else{
            ArrayDeque<TreeNode> stack = new ArrayDeque<>();
            stack.push(root);
            while(!stack.isEmpty()){
                final TreeNode node = stack.pop();
                System.out.printf("%d ",node.data);

                if(node.right != null)
                   stack.push(node.right);

                if(node.left != null)
                    stack.push(node.left);

            }
        }
    }

    public static void main(String[] args) {
        final TreeNode binaryTree = createBinaryTree();
        preorder(binaryTree);
        System.out.println();
        preOrderIterartive(binaryTree);
    }
}
