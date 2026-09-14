class Solution {
public:
    string result = "";
    string midChar = "";
    string lexPalindromicPermutation(string s, string target) {
        vector<int> freq(26,0);
        for(char c:s)
            freq[c-'a']++;
        int countOdd = 0;
        for(int i=0;i<26;i++){
            if(freq[i]%2==1){
                countOdd++;
                midChar = char(i+'a');
            }
            if(countOdd>1)
                return "";
            freq[i]/=2;
        }
        string leftHalf;
        solve(target,leftHalf,freq,0,false);
        return result;
    }
    bool solve(string &target,string &leftHalf,vector<int>& freq,int i,bool greater){
        if(i==target.size()/2){
            string temp = leftHalf;
            reverse(temp.begin(),temp.end());
            string temp1 = leftHalf+midChar+temp;
            if(temp1>target){
                result = temp1;
                return true;
            }
            return false;
        }
        for(char c='a';c<='z';c++){
            if(freq[c-'a']==0)  continue;
            if(!greater&&c<target[i])  continue;
            leftHalf.push_back(c);
            freq[c-'a']--;
            bool isGreater = greater||c>target[i];
            if(solve(target,leftHalf,freq,i+1,isGreater))
                return true;
            leftHalf.pop_back();
            freq[c-'a']++;
        }
        return false;
    }
};