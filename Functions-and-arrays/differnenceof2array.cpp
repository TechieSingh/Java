#include<iostream>
using namespace  std;

int main(){
    int n1,n2;
    cin>>n1;
    int a1[n1];
    for (int i = 0; i < n1; i++)
    {
        cin>>a1[i];
    }
    cin>>n2;
    int a2[n2];
    for (int i = 0; i < n2; i++)
    {
        cin>>a2[i];
    }

    int sum[n2]={0};
    int borrow=0;
    int j=n2-1;

    int temp[j]={0};
    for (int i = n2; i>=0; i--)
    {
        temp[i+(n2-n1)]=a1[i];
    }
    while (j>=0)
    {
            a2[j]=a2[j]+borrow;
            if (a2[j]<temp[j])
            {  
                a2[j]+=10;
                sum[j]=a2[j]-temp[j];
                borrow=-1;
            }
            else if(a2[j]>=temp[j]&&j>=0)
            {
               sum[j]=a2[j]-temp[j];
               borrow=0;
            }
        j--;   
    }

        if (sum[0]==0)
    {
        for (int i = 1; i < n2; i++)
        {
            cout<<sum[i]<<endl;      
           
        }
    }
    else{
        for (int i = 0; i < n2; i++)
        {
            cout<<sum[i]<<endl;      
           
        }
    }    
}    
    
