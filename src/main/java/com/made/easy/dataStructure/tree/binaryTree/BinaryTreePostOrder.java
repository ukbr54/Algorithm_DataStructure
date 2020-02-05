package com.made.easy.dataStructure.tree.binaryTree;

import java.util.ArrayDeque;

/**
 * Traverse left subtree
 * Traverse right subtree
 * visit root
 */
public class BinaryTreePostOrder {

    public static void postOrder(TreeNode root){
        if(root == null){
            return;
        }else{
            postOrder(root.left);
            postOrder(root.right);
            System.out.printf("%d ",root.data);
        }
    }

    public static void postOrderIterative(TreeNode root){
        ArrayDeque<TreeNode> stack = new ArrayDeque<>();
        TreeNode currentNode = root;
        while(currentNode != null || !stack.isEmpty()){
            if(currentNode != null){
                stack.push(currentNode);
                currentNode =currentNode.left;
            }else{
                TreeNode temp = stack.peek().right;
                if(temp == null){
                    temp = stack.pop();
                    System.out.printf("%d ",temp.data);
                    while(!stack.isEmpty() && temp == stack.peek().right){
                        temp = stack.pop();
                        System.out.printf("%d ",temp.data);
                    }
                }else{
                    currentNode = temp;
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
        postOrder(binaryTree);
        System.out.println();
        postOrderIterative(binaryTree);
    }
}
