class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        i = 0
        j = 1
        for num in nums:
            for num2 in nums[j:len(nums)]:
                if (num + num2) == target:
                    return [i ,j] 
                j += 1
            i += 1