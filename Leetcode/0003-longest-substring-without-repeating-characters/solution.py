class Solution(object):
    def lengthOfLongestSubstring(self, s):
        maps = {}
        maxLength = 0
        start = 0
        for idx, char in enumerate(s):
            if(char in maps):
                start = max(maps[char]+1,start)
            maps[char] = idx
            maxLength = max(maxLength,idx-start+1)
        return maxLength
