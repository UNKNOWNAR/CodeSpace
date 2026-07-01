class Solution {
public:
    vector<string> twoEditWords(vector<string>& queries, vector<string>& dictionary) {
        vector<string> answer;
        
        // Iterate through each query word to maintain original order
        for (const string& q : queries) {
            bool found = false;
            
            // Check against every word in the dictionary
            for (const string& d : dictionary) {
                int diff = 0;
                
                // Compare characters at each position (Hamming Distance)
                for (int k = 0; k < q.size(); k++) {
                    if (q[k] != d[k]) {
                        diff++;
                    }
                    // Optimization: if edits exceed 2, this dictionary word is invalid
                    if (diff > 2) break; 
                }
                
                // If we found a match within 2 edits, save it and stop checking dictionary
                if (diff <= 2) {
                    found = true;
                    break;
                }
            }
            
            if (found) {
                answer.push_back(q);
            }
        }
        
        return answer;
    }
};
