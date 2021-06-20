#include<iostream>
using namespace std;

void rotate(int arr[], int n, int index){
   int temp[n-index];
    for (int i = 0; i <= n-index; i++)
    {
        temp[i]=arr[index+i];
    }
    for (int i = 0; i < n-index; i++)
    {
        cout<<temp[i]<<" ";
    }
    for (int i = 0; i < index; i++)
    {
        cout<<arr[i]<<" ";
    }
   
}
int main(){
    int n, r;
    cin>>n;
    int arr[n];
    for(int i = 0 ; i < n; i++){
        cin>>arr[i];
    }
    cin>>r;
    int pos=0;
    if(r<0){
        pos=n+r%n;
    }
    else{
        pos=r%n;
    }
    rotate(arr,n,n-pos);
}