#include<iostream>
#include<math.h>
using namespace std;

int findvalue(int n, int b1,int b2){
    int sum=0;
    int p=1;
    int q=1;
    int decimal=0;
    while (n!=0)
    {
        int r=n%10;
        n=n/10;
        sum=sum+r*p;
        p=p*b1;   
    }
    while (sum!=0)
    {
        int r=sum%b2;
        sum=sum/b2;
        decimal=decimal+r*q;
        q=q*10;   
    }
    return decimal;
}
int main()
{
    int n,b1,b2;
    cin>>n>>b1>>b2;
    auto value = findvalue(n,b1,b2);
    cout<<value;
    return 0;
}
