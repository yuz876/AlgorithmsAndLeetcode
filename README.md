This repo records my practices of leetcode.


# 1. Two pointers.

Time complexity: O(nlogn).

Space complexity: 

1.1. Faced two pointers algorithm.
  - Two Sum Type.
    -  [1.two sum](LC/1.two_sum.md) Template
    -  [167. Two Sum II - Input Array Is Sorted](LC/167.Two_Sum_II-Input_Array_Is_Sorted.md)
    -  [1099. Two Sum Less Than K](LC/1099.Two_Sum_Less_Than_K.md)
    -  [15. Three Sum](LC/15.Three_Sum.md)
    -  [170. Two Sum III - Data structure design](LC/170.Two_Sum_III-Data_structure_design.md)
    -  [88. Merge Sorted Array](LC/88.Merge_Sorted_Array.md)


  - Reverse Type. 
    - [125. Valid Palindrome](LC/125.Valid_Palindrome.md)
    - [680. Valid Palindrome II](LC/680.Valid_Palindrome_II.md)
  
  - Partition Type. [quick sort and merge sort (Template)](note/quick_sort_and_merge_sort.md)
    -  [912. sort an array](LC/912.sort_an_array.md)
    -   [215. Kth Largest Element in an Array](LC/215.Kth_Largest_Element_in_an_Array.md)


# 2. Recurssion, BST, Stack, Heap

## Recurssion 3 key elements:
1. Recurssion definition
2. Recurssion dividing
3. Recurssion stopping condition

- [509. Fibonacci Number](LC/509.Fibonacci_Number.md)


  - [190. Reverse Bits](LC/190.Reverse_Bits.md)

- [104. Maximum Depth of Binary Tree](LC/104.Maximum_Depth_of_Binary_Tree.md)

- [704. Binary Search](LC/704.Binary_Search.md) Recusrion, BS

- [94. Binary Tree Inorder Traversal](LC/94.Binary_Tree_Inorder_Traversal.md)

  - [144. Binary Tree Preorder Traversal](LC/144.Binary_Tree_Preorder_Traversal.md)

  - [145. Binary Tree Postorder Traversal](LC/145.Binary_Tree_Postorder_Traversal.md) 

- [206. Reverse Linked List](LC/206.Reverse_Linked_List.md)

- [105. Construct Binary Tree from Preorder and Inorder Traversal](LC/105.Construct_Binary_Tree_from_Preorder_and_Inorder_Traversal.md)

  - [106. Construct Binary Tree from Postrder and Inorder Traversal](LC/106.Construct_Binary_Tree_from_Postorder_and_Inorder_Traversal.md)


  - [889. Construct Binary Tree from Preorder and Postorder Traversal](LC/889.Construct_Binary_Tree_from_Preorder_and_Postorder_Traversal.md)
  
- [1008. Construct Binary Search Tree from Preorder Traversal](LC/1008.Construct_Binary_Search_Tree_from_Preorder_Traversal.md)

# 3. Binary Search

[Binary Search template](note/binary_search_template.md)

- [704. Binary Search(binary search)](LC/704.Binary_Search(binary).md)

- [852. Peak Index in a Mountain Array](LC/852.Peak_Index_in_a_Mountain_Array.md)

- [658. Find K Closest Elements](LC/658.Find_K_Closest_Elements.md)

- [153. Find Minimum in Rotated Sorted Array](LC/153.Find_Minimum_in_Rotated_Sorted_Array.md)

- [69. Sqrt(x)](LC/69.Sqrt(x).md)
  
- [162. Find Peak Element](LC/162._Find_Peak_Element.md)
  
- [33. Search in Rotated Sorted Array](LC/33.Search_in_Rotated_Sorted_Array.md)

- [81. Search in Rotated Sorted Array II](LC/81.Search_in_Rotated_Sorted_Array_II.md)

- [154. Find Minimum in Rotated Sorted Array II](LC/154.Find_Minimum_in_Rotated_Sorted_Array_II.md)

- [1901. Find a Peak Element II](LC/1901.Find_a_Peak_Element_II.md)





# 4. Queue/Stack

### If only use:
|Java Queue Method (directly use this column)|	Equivalent Deque Method|
|-|-|
|add(e)	|addLast(e)|
|offer(e)	|offerLast(e)|
|remove()	|removeFirst()|
|poll()	|pollFirst()|
|element()	|getFirst()|
|peek()	|peekFirst()|


> instance: Queue/Deque<E> myqueue = new ArrayDeque/LinkedList<E>(); (left is head/first)

|Java Stack Method (directly use this column)|	Equivalent Deque Method|
|-|-|
|push(e)	|addFirst(e)|
|pop()	|removeFirst()|
|peek()	|peekFirst()|


> instance: Deque<E> mystack = new ArrayDeque/LinkedList<E>(); (left is top)



### Implement Queue:

- [232. Implement Queue using Stacks](LC/232.Implement_Queue_using_Stacks.md)
  
### Implement Stack:
- [225. Implement Stack using Queues](LC/225.Implement_Stack_using_Queues.md)



# 5. BFS 
[BFS template](note/bfs.md)

[Bi-BFS template](note/bi-bfs.md)

## 5.1 Three types of BFS problems:
### 5.1.1 Traversal all leaves:
- [102. Binary Tree Level Order Traversal](LC/102.Binary_Tree_Level_Order_Traversal.md) BFS on Tree
- [1197. Minimum Knight Moves](LC/1197.Minimum_Knight_Moves.md) BFS on Matrix
  
### 5.1.2 Connected component:
- [127. Word Ladder](LC/127.Word_Ladder.md)
- [133. Clone Graph](LC/133.Clone_Graph.md)
- [200. Number of Islands](LC/200.Number_of_Islands.md)

### 5.1.3 Topological Sorting
- [207. Course Schedule](LC/207.Course_Schedule.md)
- [210. Course Schedule II](LC/210.Course_Schedule_II.md)
- [444. Sequence Reconstruction](LC/444.Sequence_Reconstruction.md)
- [269. Alien Dictionary](LC/269.Alien_Dictionary.md)
## 5.2 More BFS on Graph 
- [261. Graph Valid Tree](LC/261.Graph_Valid_Tree.md)
- [323. Number of Connected Components in an Undirected Graph](LC/323.Number_of_Connected_Components_in_an_Undirected_Graph.md)
- [297. Serialize and Deserialize Binary Tree](LC/297.Serialize_and_Deserialize_Binary_Tree.md)

## 5.3 Bi-BFS
- [1197. Minimum Knight Moves](LC/1197.Minimum_Knight_Moves.md) 

# 6.Hash
## 6.1 HashSet
- [705. Design HashSet](LC/705.Design_HashSet.md)
## 6.2 HashMap
- [706. Design HashMap](LC/706.Design_HashMap.md)
  
# 7. DFS 
 
  Except Binary Tree, 90% DFS problesm are Combinations or Permutations.
  
[DFS Template](note/dfs_template.md)
- 7.1 Combinations
  - [78. Subsets](LC/78.Subsets.md)
    - [90. Subsets II](LC/90.Subsets_II.md)
  - [77. Combinations](LC/77.Combinations.md)
  - [39. Combination Sum](LC/39.Combination_Sum.md)
    - [40. Combination Sum II](LC/40.Combination_Sum_II.md)
    - [216. Combination Sum III](LC/216.Combination_Sum_III.md)
  
- 7.2 Permutation
  - [46. Permutations](LC/46.Permutations.md)
    - [47. Permutations II](LC/47.Permutations_II.md)
  - Next Permutation
    - [31. Next Permutation](LC/31.Next_Permutation.md)
  
 - DFS on matrix:
  - [17. Letter Combinations of a Phone Number](LC/17.Letter_Combinations_of_a_Phone_Number.md)
  - [79. Word Search](LC/79.Word_Search.md)
    - [212. Word Search II](LC/212.Word_Search_II.md)
  - [126. Word Ladder II](LC/126.Word_Ladder_II.md)

  - [37. Sudoku Solver](LC/37.Sudoku_Solver.md)
    - [36. Valid Sudoku 
    (37 Prep not using dfss)](LC/36.Valid_Sudoku.md)
 

# 7.DC
[Binary tree DC template](note/binary_tree_DC_template.md)
- [257. Binary Tree Paths](LC/257.Binary_Tree_Paths.md)
- [110. Balanced Binary Tree](LC/110.Balanced_Binary_Tree.md)
- [1120. Maximum Average Subtree](LC/1120.Maximum_Average_Subtree.md)
- [104. Maximum Depth of Binary Tree](LC/104.Maximum_Depth_of_Binary_Tree.md)

# Other
## [Github/Markdown/HTML/CSS/JS.](basic/)
