class Solution:
    def longestSubarray(self, nums: List[int]) -> int:
        a = max(nums)
        cnt = 0 
        ans = 0
        for num in nums:
            if num == a:
                cnt += 1
                ans = max(ans,cnt)
            else:
                cnt = 0
        
        return ans