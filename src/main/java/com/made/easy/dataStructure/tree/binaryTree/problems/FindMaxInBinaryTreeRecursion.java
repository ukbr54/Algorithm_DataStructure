package com.made.easy.dataStructure.tree.binaryTree.problems;

import com.made.easy.dataStructure.tree.binaryTree.TreeNode;

/**
 *  Finding Maximum element in binary tree.
 */
public class FindMaxInBinaryTreeRecursion {
    public static int findMax(TreeNode root){
        int maxValue = Integer.MIN_VALUE;
        if(root != null){
            int leftMax = findMax(root.left);
            int rightMax = findMax(root.right);

            if(leftMax > rightMax){
                maxValue = leftMax;
            }else{
                maxValue = rightMax;
            }

            if(root.data > maxValue){
                maxValue = root.data;
            }
        }
        return maxValue;
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
        System.out.println(findMax(binaryTree));
    }
}
