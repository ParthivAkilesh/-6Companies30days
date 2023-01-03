class Solution:
    def isValid(self, s: str) -> bool:
        st = []
        for i in s:
            if i=="{" or i=="(" or i=="[":
                st.append(i)
            else:
                if len(st)==0:
                    return False
                p = st.pop()
                if p=="(":
                    if i!=")":
                        return False
                if p=="{":
                    if i!="}":
                        return False
                if p=="[":
                    if i!="]":
                        return False
        if st:
            return False
        return True