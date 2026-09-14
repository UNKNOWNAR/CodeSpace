class Solution {
public:
    bool isPalindromic(string s) {
        string bin = "";
        for(char c:s){
            int num = c;
            bin += bitset<8>(num).to_string();
        }
        int len = bin.size(),left = (len-1)/2,right = len/2;
        while(left>=0&&right<len){
            if(bin[right]!=bin[left])
                return false;
            left--;
            right++;
        }
        return true;
    }
};