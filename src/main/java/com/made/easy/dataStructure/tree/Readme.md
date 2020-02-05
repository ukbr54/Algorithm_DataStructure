1. A tree is a data structure that is similar to linked list but instead of each nodes pointing to the next node in
   a linear fashion, each node points to number of nodes.
2. Tree is an example of non-linear data structure.
3. They organize data hierarchically.

#### Terminology:
   1. __Root__ is the topmost node of the tree.
   2. __Edge__ is the link between two nodes.
   3. __Child__ is a node that has a parent node.
   4. __Leaf__ is a node that does not have a child node in a tree.
   5. The height of a node is the number of edges on the longest path from the node to a leaf.A leaf node will have a height of 0.    
   6. The depth of a node is the number of edges from the node to the tree's root node.A root node will have a depth of 0.
   
     
   ![HeightDepth](/src/main/java/com/made/easy/dataStructure/tree/tree.png)
   
#### Binary Tree:
- A tree is called binary tree if each node has zero child, one child or two child.
- Empty tree is also a valid binary tree.
- Types of Binary Trees:
   1. Strict Binary Tree: If each node has exactly two children or no children.
   2. Full Binary Tree: If each node has exactly two children and all leaf nodes are at same level.
   3. Complete Binary Tree: A complete binary tree is a binary tree in which every level, except possibly the last, is completely filled, and all nodes are as far left as possible.
      All leaf nodes are at height h or h-1.
- Properties of Binary Tree:
   1. The number of nodes n in a full binary tree is 2^(h+1) - 1. Where h is the height.
   2. The number of nodes n in a complete binary tree is 2^h(minimum) and 2^(h+1) - 1(maximum).
   3. The number of leaf node in a full binary tree is 2^h.
   4. The number of NULL links in a complete binary tree of n nodes is n+1.
   
- Basic Operation on Binary Trees:
 1. Inserting an element into a tree.
 2. Deleting an element from a tree.
 3. Searching for an element.
 4. Traversing the tree. 
 
 |Binary Tree Operation| Time Complexity | Space Complexity |
 |---------------------|-----------------|------------------|
 | PreOrder (recursive/Iterative)| O(n)  | O(n)             |
 | InOrder  (recursive/Iterative)| O(n)  | O(n)             |
 | PostOrder (recursive/Iterative)| O(n) | O(n)             |
 | Level order traversal          |O(n)  | O(n)             | 
   
         
   