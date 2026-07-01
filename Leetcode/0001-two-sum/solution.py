class Solution(object):
    def twoSum(self, nums, target):
       
        # Dictionary to store value to index mappings
        dictionary = {}
        
        # Iterate over the array
        for idx, element in enumerate(nums):
            # Calculate the complement
            complement = target - element
            
            # Check if the complement is already in the dictionary
            if complement in dictionary:
                return [dictionary[complement], idx]
            
            # If complement is not found, store the current element with its index
            dictionary[element] = idx
