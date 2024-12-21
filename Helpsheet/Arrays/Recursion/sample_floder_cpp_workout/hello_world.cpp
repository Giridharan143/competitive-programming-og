#include<iostream>
#include<vector>

using namespace std;

int main(){
    // int nums[]={1,2,3,4,5,6,7};
    // int n = sizeof(nums)/sizeof(nums[0]);
    // for(int i=0;i<n;i++){
    //     nums[i]++;
    // }
    // for(int i=0;i<n;i++){
    //     printf("%d ",nums[i]);
    // }
    // vector<int> nums={10,20,30,40,50};
    // for(int i=0;i<nums.size();i++){
    //     printf("The %d number is %d",i+1,nums[i]);
    //     cout<<"\t";
    // }
    vector<string> arr={"Giri","Dharan"};
    string final="";
    int counter = arr.size();
    for(int i=0;i<arr[counter].size();i++){
        // if(arr[i]==' '){
        //     final+=' ';
        // }
        final=arr[counter][i]+final;
        
        // counter++;
    }
    cout<<("The Reversed String is %s",final)<<endl;
    return 0;
    
}