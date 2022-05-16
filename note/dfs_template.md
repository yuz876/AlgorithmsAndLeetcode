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
            curr_subset.remove(nums[i])
```

## Runtime calculate:
- Sorting problem = O(n! * n) 
- permutations = O(2^n * n)
