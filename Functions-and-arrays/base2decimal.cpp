#include<iostream>
#include<math.h>
using namespace std;

int findvalue(int n, int b){
    int sum=0;
    int p=1;
    while (n!=0)
    {
        int r=n%10;
        n=n/10;
        sum=sum+r*p;
        p=p*b;   
    }
    
    return sum;
}
int main()
{
    int n,b;
    cin>>n>>b;
    auto value = findvalue(n,b);
    cout<<value;
    return 0;
}
