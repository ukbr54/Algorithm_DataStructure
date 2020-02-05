package com.made.easy.dataStructure.tree.binaryTree;

import java.util.ArrayDeque;

public class BinaryTreeLevelOrderTraversal {


    public static void levelOrder(TreeNode root){
        if(root == null) return;

        ArrayDeque<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);

        while(!queue.isEmpty()){
            root = queue.poll();
            System.out.printf("%d ",root.data);
            if(root.left != null){
                queue.add(root.left);
            }

            if(root.right != null){
                queue.add(root.right);
            }
        }
    }

    public static void main(String[] args) {
        final TreeNode binaryTree = createBinaryTree();
        levelOrder(binaryTree);
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
}
