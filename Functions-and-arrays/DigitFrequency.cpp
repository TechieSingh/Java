#include<iostream>
using namespace std;

int freequency(int n, int d){
    int count=0;
    while(n!=0)
    {
        int p;
        p=n%10;
        if(p==d){
            count++;
        }
        n=n/10;
    }
    return count;
}

int main()
{
    int n;
    int d;
    cin>>n;
    cin>>d;
    int f=freequency(n,d);
    cout<<f;
    return 0;
}
