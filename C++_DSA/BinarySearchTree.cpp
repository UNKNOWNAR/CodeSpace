#include <bits/stdc++.h>
using namespace std;
struct Node{
    int data;
    Node *left;
    Node *right;
    Node(int val){
        data = val;
        left = right = NULL;
    }
};
Node* insert(Node *root,int val){
    if(root==NULL)
        return new Node(val);
    if(root->data>val)
        root->left = insert(root->left,val);
    else
        root->right = insert(root->right,val);
    return root;
}
void inorder(Node *root){
    if(root==NULL) return;
    inorder(root->left);
    cout<<root->data<<" "<<endl;
    inorder(root->right);
}
void postorder(Node* root){
    if(root==NULL) return;
    postorder(root->left);
    postorder(root->right);
    cout<<root->data<<" "<<endl;
}
void preorder(Node* root){
    if(root==NULL) return;
    cout<<root->data<<" "<<endl;
    preorder(root->left);
    preorder(root->right);
}
Node* find(int val, Node* root){
    if(root == NULL) return NULL;
    if(root->data == val) return root;
    if(root->data > val) return find(val, root->left);
    return find(val, root->right);
}
Node* findMin(Node* root){
    while(root->left!=NULL)
        root = root->left;
    return root;
}
Node* deleteNode(int val, Node* root){
    if(root==NULL) return NULL;
    if(root->data>val)
        root = deleteNode(val,root->left);
    else if(root->data<val)
        root = deleteNode(val,root->right);
    if(root->left==NULL&&root->right==NULL){//no child node so delete root
        delete root;
        return NULL;
    }
    if(root->left==NULL){ //only right child
        Node* temp = root->right;
        delete root;
        return temp;
    }
    if(root->right==NULL){//only left child
        Node* temp = root->left;
        delete root;
        return temp;
    }
    //two child case
    Node* temp = findMin(root->right);
    root->data = temp->data;
    root->right = deleteNode(temp->data,root->right);
    return root;    
} 
int main(){
    Node *root = NULL;
    root = insert(root,10);
    root = insert(root,20);
    root = insert(root,30);
    root = insert(root,40);
    root = insert(root,50);
    inorder(root);
    cout<<endl;
    postorder(root);
    cout<<endl;
    preorder(root);
    cout<<find(30,root)<<endl;
}