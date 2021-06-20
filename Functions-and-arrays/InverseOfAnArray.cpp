#include<iostream>
using namespace std;

void inverse(int arr[],int n)
{
  int temp[n]={0};
  for (int i = 0; i < n; i++)
  {
      int k=i;
      int j=0;
      j=arr[i];
      temp[j]=k;
  }
  for (int j = 0; j <n ; j++)
  {
     cout<<temp[j]<<endl;
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
   inverse(arr,n);
    
} 
