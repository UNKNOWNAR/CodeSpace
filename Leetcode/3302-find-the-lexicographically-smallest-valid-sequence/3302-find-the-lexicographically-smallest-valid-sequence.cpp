class Solution {
public:
    vector<int> validSequence(string word1, string word2) {
        int n = word1.size();
        int m = word2.size();
        vector<int> rightHandSideMatch(n,0);
        int rightMatched = 0;
        int i=n-1,j=m-1;
        while(i>=0){
            if(j>=0&&word1[i]==word2[j]){
                rightMatched++;
                j--;
            }
            rightHandSideMatch[i] = rightMatched;
            i--;
        }
        vector<int> seq(m);
        bool changePower = true;
        i=0;
        j=0;
        while(i<n&&j<m){
            if(word1[i]==word2[j]){
                seq[j] = i;
                j++;
            }
            else if(changePower&&i<n-1&&rightHandSideMatch[i+1]>=m-j-1){
                seq[j] = i;
                j++;
                changePower = false;
            }
            i++;
        }
        return j==m?seq:vector<int>();
    }
};