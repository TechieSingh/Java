#include<iostream>
using namespace std;

int findSpan(int arr[],int n){
    int max=0;
    int min=arr[0];

    for (int i = 0; i < n; i++)
    {
        if(arr[i]>max)
        max=arr[i];
        if(arr[i]<min)
        min=arr[i];
    }
    return max-min;
    

}

int main(){
    int n;
    cin>>n;
    int arr[n];
    for (int i = 0; i < n; i++)
    {
        cin>>arr[i];
    }
    cout<<findSpan(arr,n);
    
    
    
}