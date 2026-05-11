#include<bits/stdc++.h>
using namespace std;

struct Node{
    int data;
    Node* next;
    Node(int data){
        this->data = data;
        this->next = NULL;
    }
};

bool checkCycle(Node *head){
    Node* slow = head;
    Node* fast = head;
    while(fast!=NULL && fast->next!=NULL){
        slow = slow->next;
        fast = fast->next->next;
        if(slow==fast)
            return true;
    }
    return false;
}

Node* reverse(Node *head){
    if(head==NULL||head->next==NULL)
        return head;

    Node* prev = NULL;
    Node* curr = head;
    Node* next = NULL;
    while(curr!=NULL){
        next = curr->next;
        curr->next=prev;
        prev = curr;
        curr = next;
    }
    return prev;    
}

Node* insertBegin(Node *head, int val){
    Node* newNode = new Node(val);
    newNode->next = head;
    return newNode;
}

Node* insertEnd(Node *head, int val){
    Node* newNode = new Node(val);
    if(head==NULL)
        return newNode;
    Node* temp = head;
    while(temp->next!=NULL)
        temp = temp->next;
    temp->next = newNode;
    return head;
}

int main(){
    Node *head = NULL;
    head = insertBegin(head,10);
    head = insertBegin(head,20);
    head = insertEnd(head,30);
    head = insertEnd(head,40);
    head = insertEnd(head,50);
    Node* temp = head;
    while(temp!=NULL){
        cout<<temp->data<<" ";
        temp = temp->next;
    }
    cout<<endl;
    head = reverse(head);
    temp = head;
    while(temp!=NULL){
        cout<<temp->data<<" ";
        temp = temp->next;
    }
    cout<<endl;
    return 0;
}