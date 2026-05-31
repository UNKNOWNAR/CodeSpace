#include <bits/stdc++.h>
#define ll long long
using namespace std;
void harmonicSieveExample(const vector<int>& arr) {// O(M log M) where M is max_val
    int max_val = *max_element(arr.begin(), arr.end());
    // Frequency array to count occurrences of each number in the input
    vector<int> freq(max_val + 1, 0);
    for (int num : arr) {
        freq[num]++;
    }
    // Iterate through all multiples of x up to max_val
    vector<int> multiples_count(max_val + 1, 0);
    for (int x = 1; x <= max_val; ++x) {
        if(freq[x]==0)
            continue;
        int count = 0;
        for (int mul = x; mul <= max_val; mul += x) {
            count += freq[mul];
        }
        multiples_count[x] = count;
    }
    cout << "Number of multiples for each unique element in the array:\n";
    for (int x = 1; x <= max_val; ++x) {
        if (freq[x] > 0) {
            cout << "Element " << x << " divides " << multiples_count[x] << " elements in the array.\n";
        }
    }
}

int main() {
    // Example usage
    vector<int> items = {2, 4, 6, 8, 3, 9, 12};
    
    cout << "Input array: ";
    for (int x : items) cout << x << " ";
    cout << "\n\n";

    harmonicSieveExample(items);

    return 0;
}
/*
 * Let's trace how this builds out when your active elements are 2, 3, 4, 6, and 12.
 * 
 * The Frequency Profile
 * ---------------------
 * Suppose our input values generate this frequency distribution up to M = 12:
 * freq[2] = 1, freq[3] = 1, freq[4] = 1, freq[6] = 2, freq[12] = 1
 * All other positions are 0.
 * 
 * Execution Trace
 * ---------------
 * 
 * Iteration 1: x = 2
 *   It enters the inner loop because freq[2] > 0.
 *   Jumps: Indices visited are 2, 4, 6, 8, 10, 12.
 *   Summation:
 *     count = freq[2] + freq[4] + freq[6] + freq[8] + freq[10] + freq[12]
 *     count = 1 + 1 + 2 + 0 + 0 + 1 = 5
 *   Result: multiples_count[2] = 5
 * 
 * Iteration 2: x = 3
 *   It enters the inner loop because freq[3] > 0.
 *   Jumps: Indices visited are 3, 6, 9, 12.
 *   Summation:
 *     count = freq[3] + freq[6] + freq[9] + freq[12]
 *     count = 1 + 2 + 0 + 1 = 4
 *   Result: multiples_count[3] = 4
 * 
 * Iteration 3: x = 4
 *   It enters the inner loop because freq[4] > 0.
 *   Jumps: Indices visited are 4, 8, 12.
 *   Summation:
 *     count = freq[4] + freq[8] + freq[12]
 *     count = 1 + 0 + 1 = 2
 *   Result: multiples_count[4] = 2
 * 
 * And so on...
 */