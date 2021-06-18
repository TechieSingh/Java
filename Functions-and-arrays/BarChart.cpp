#include<iostream>
using namespace std;

void barChart(int arr[], int n){
    int max=0;
    int sp=0;
    int str=0;
    int count =1;
    
    for (int i = 0; i < n; i++)
    {
        while (arr[i]>max)
        {
            max=arr[i];
            count++;
        }
        
    }

    for (int i = 0; i < max; i++)
    {
       for (int j = 0; j < n; j++)
       {
           if(j==count)
           {
            cout<<"*";
           }
           else
           cout<<"-";
           
       }
       cout<<endl;
       
    }
    

}

int main()
{
    int n;
    cin>>n;
    int arr[n];
    for (int i = 0; i < n; i++)
    {
        cin>>arr[i];
    }
    barChart(arr,n);
    return 0;
}
