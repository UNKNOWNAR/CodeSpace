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
    int count = 0;
    int countDominantNodes(TreeNode* root) {
        countDominant(root);
        return count;
    }
    int countDominant(TreeNode* root){
        if(root->left==nullptr&&root->right==nullptr){
            count++;
            return root->val;
        }
        int leftVal = 0,rightVal = 0;
        if(root->left!=nullptr)
            leftVal = countDominant(root->left);
        if(root->right!=nullptr)
            rightVal = countDominant(root->right);
        if(root->val>=rightVal&&root->val>=leftVal)
            count++;
        return max(root->val,max(leftVal,rightVal));
    }
};