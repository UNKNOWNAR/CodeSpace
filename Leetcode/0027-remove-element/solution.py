class Solution(object):
    def removeElement(self, nums, val):
        """
        :type nums: List[int]
        :type val: int
        :rtype: int
        """
        k = 0
        i = 0
        while i < len(nums):
            if nums[i] != val:
                if k!=i:
                    nums[k], nums[i] = nums[i], nums[k]
                    i = k
                k+=1
            i+=1
        return k
