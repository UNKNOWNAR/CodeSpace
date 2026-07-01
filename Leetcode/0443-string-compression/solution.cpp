class Solution {
private:
int reverseInteger(int n) {
    long long reversed = 0; 
    while (n != 0) {
        int lastDigit = n % 10;
        reversed = reversed * 10 + lastDigit;
        n /= 10;
    }
    return (int)reversed;
}
public:
    int compress(vector<char>& chars) {
        vector<string> compressed;
        int i=0;
        int indx = 0;
        int n = chars.size();
        while(i<n){
            int count = 1;
            while(i+1<n&&chars[i]==chars[i+1]){
                i++;
                count++;
            }
            chars[indx++] = chars[i];
            i++;
            if(count==1)
                continue;
            string s = to_string(count);
            for (char c : s) 
                chars[indx++] = c;
        }
        return indx;
    }
};
