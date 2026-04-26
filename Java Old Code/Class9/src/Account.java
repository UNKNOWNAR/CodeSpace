/*Question 5
Write a program to use a class Account with the following specifications:
Class name — Account
Data members — int acno, float balance
Member Methods:
Account (int a, int b) — to initialize acno = a, balance = b
void withdraw(int w) — to maintain the balance with withdrawal (balance - w)
void deposit(int d) — to maintain the balance with the deposit (balance + d)*/
import java.io.*;
public class Account 
{
    int acno;
    float balance;
    Account(int a,int b)
    {
        acno = a;
        balance = b;
    }
    void withdraw(int w)
    {
        balance -= w;
    }  
    void deposit(int d)
    {
        balance += d;
    }  
}