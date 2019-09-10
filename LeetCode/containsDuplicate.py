class Solution(object):
    def containsDuplicate(self, nums):
        s = set([])
        for i in range(len(nums)):
            if nums[i] in s:
                return True
            s.add(nums[i])
        return False