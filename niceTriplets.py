from sortedcontainers import SortedList
from typing import *
class Solution:
    def goodTriplets(self, A: List[int], B: List[int]) -> int:
        # Index of a (from A) in B
        pos = [0] * len(A)
        for ind, b in enumerate(B):
            pos[b] = ind
            
        print(pos)
        
        pos_b, prefix_a = SortedList([pos[A[0]]]), [0]

        for a in A[1:]:
            pos_b.add(pos[a])
            # print("Pos_b",list(pos_b))
            prefix_a.append(pos_b.bisect_left(pos[a]))
            # print("Prefix_a",prefix_a)

        pos_b, suffix_a = SortedList([pos[A[-1]]]), [0]
        print(pos_b, suffix_a)

        for a in reversed(A[:len(A)-1]):
            idx = pos_b.bisect(pos[a])
            suffix_a.append(len(pos_b)- idx)
            print("Suffix_a",list(pos_b))
            pos_b.add(pos[a])
            print("Pos_b",list(pos_b))

        suffix_a.reverse() 
        
        ans = 0
        for x,y in zip(prefix_a, suffix_a):
            ans+= x*y

        return ans
    
  
nums1 = [4,0,1,3,2]
nums2 = [4,1,0,2,3]

Solution().goodTriplets(nums1,nums2)