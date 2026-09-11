class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        k=Counter(nums)
        for i,j in k.items():
          if  k[i]==1:
            return i  