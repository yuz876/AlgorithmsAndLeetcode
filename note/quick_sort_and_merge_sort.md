
# Quick sort

1. Pick a pivot p
   - need the pivot value, not the index
   - pivot selection: random() > middle element > first/last element. Use middle is best choice in realisity. pivot = Array[(start + end) / 2].
2. Partition
   - if <= pivot, put left
   - if >= pivot, put right
   - Here there are = in both left and right  to avoid the worst case
3. Recursion
   - It is recursion after the partition step. 先整体有序再局部有序。

# Merge sort

## Divide and conquer

T(n) = 2 * T(n/2) + O(n)

```
= T(n/4) + O(1) * 2
= T(n/8) + O(1) * 3
= T(n/16) + O(1) * 4
....
= T(1) + O(1) * logn
```


- Quick sort: Do the partition O(n) part first.
- Merge sort: Do the sort part fisrt T(n/2) then do merge part O(n).

# Quick sort VS Merge sort

||Time complexity|Space complexity|Stability*|
|-|-|-|-|
|Quick sort|Avg: O(nlogn). Worst: O(n^2)|O(1) in place|No|
|Merge sort|O(nlogn)|O(n)|Yes|


*Note:
- Stability:
If you want to sort {3, 2', 2'', 1}
  - If stable: sorted: 1, 2', 2'', 3
  - If unstable: sorted: 1, 2'', 2', 3 

# Partition template
```py
left, right = 0, len-1
pivotvalue = array[middle]

while (left <= right){
   while left <= right and array[left] < pivotvalue {
      left ++
   }
   while left <= right and array[right] > pivotvalue {
      right --
   }

   if left <= right {
      swap
      left ++
      right --
   }

}

```