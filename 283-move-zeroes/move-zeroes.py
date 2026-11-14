class Solution(object):
    def moveZeroes(self, nums):
         position = 0
         
         for i in range (len(nums)):
            if nums[i] != 0:
               nums[position], nums[i] = nums[i], nums[position]
               position += 1
       