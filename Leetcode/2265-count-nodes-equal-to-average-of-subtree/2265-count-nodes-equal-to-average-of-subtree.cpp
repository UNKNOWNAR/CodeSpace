/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    int countAvg = 0;
    int averageOfSubtree(TreeNode* root) {
        calcAvg(root);
        return countAvg;
    }
    pair<int,int> calcAvg(TreeNode* root){
        if(root==nullptr)
            return {0,0};
        auto left = calcAvg(root->left);
        auto right = calcAvg(root->right);
        int sum = left.first+right.first+root->val;
        int count = left.second+right.second+1;
        if(sum/count==root->val)
            countAvg++;
        return {sum,count};
    }
};