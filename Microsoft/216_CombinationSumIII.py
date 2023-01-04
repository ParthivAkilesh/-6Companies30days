class Solution:
    def combinationSum3(self, k: int, n: int) -> List[List[int]]:

        res = []
        st = []
        def backtrack(num, st, tar):
            if len(st) == k:
                if tar == 0:
                    res.append(st)
                return
            
            for x in range(num+1, 10):
                if x <= tar:
                    backtrack(x, st+[x], tar-x)

        backtrack(0, st, n)

        return res