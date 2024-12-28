#include<iostream>

using namespace std;

int main(){
    cout<<"Hi"<<endl;
    cout<< "Enter the Number to print it out : ";
    int a;int temp=0;
    cin>>a;
    while(a!=0){
        temp=temp*10+(a%10);
        a=a/10;
    }
    printf("The Reversed Number is : %d",temp);
    cout<<endl<<"Thank You !!!";
    
    }