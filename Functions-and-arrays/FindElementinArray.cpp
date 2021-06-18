#include<iostream>

using namespace std;

int findlocation(int arr[],int n, int f){
    int loc=-1;
    for (int i = 0; i < n; i++)
    {
        if(f==arr[i])
        loc=i;
    }
    
    return loc;
}

int main(){
    int n,f;
    cin>>n;
    int arr[n];
    for (int i = 0; i < n; i++)
    {
        cin>>arr[i];
    }
    cin>>f;
    cout<<findlocation(arr,n,f);
    
}