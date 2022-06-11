# More general 
```py
class Solution:
    def subsets(self, nums: List[int]) -> List[List[int]]:
        if not nums:
            return []
        
        results = []
        self.dfs(nums, 0, [], results)
        return results
    
    def dfs(self, nums, curr_index, curr_subset, results):
        results.append(list(curr_subset))
        
        for i in range(curr_index, len(nums)):# only consider nums after curr_index
            # add all options except themselves
            curr_subset.append(nums[i]) # [1] -> [1, 2]
            self.dfs(nums, i + 1, curr_subset, results)
            # backtracking [1, 2] -> [1] this is for next iteration it can do [1] -> [1, 3]
            curr_subset.remove(nums[i]) # also can use curr_subset.pop() to avoid deleting first element when multiple elements are same.
```

## Runtime calculate:
- Sorting problem = O(n! * n) 
- permutations = O(2^n * n)


## Method 2: (Combinations special, take or not-take)

```py
class Solution:
    def subsets(self, nums: List[int]) -> List[List[int]]:
        if not nums:
            return []
        
        results = []
        self.dfs(nums, 0, [], results)
        return results
        
    # 1. recursion definition
    def dfs(self, nums, curr_index, curr_subset, results):
        # 3. recursion stopping
        if curr_index >= len(nums):
            # deep copy
            results.append(list(curr_subset))
            # results.add(new ArrayList<>(curr_subset));
            return
        
        # 2. recursion divide
        # option 1 add the element
        curr_subset.append(nums[curr_index])
        self.dfs(nums, curr_index + 1, curr_subset, results)
        
        # option 2 don't add the element
        curr_subset.remove(nums[curr_index])#backtracking # also can use curr_subset.pop() to avoid deleting first element when multiple elements are same.
        self.dfs(nums, curr_index + 1, curr_subset, results) 
        
 # [1 2 3]
 #  1 0 0 -> [1]
 #  1 0 1 -> [1, 3]
 #  0 1 1 -> [2, 3]
```
