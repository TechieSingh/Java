#include<iostream>
#include<math.h>
using namespace std;

int findvalue(int b, int n1,int n2){
    int sum=0;
    int bro=0;
    int p=1;
    while (n2>0)
    {
        int d1 =n1%10;
        int d2 =n2%10;
        n1=n1/10;
        n2=n2/10;
       
        int d=0;
        d2=d2+bro;
        if(d2>=d1){
            bro=0;
            d=d2-d1;
        }
        else{
            bro=-1;
            d=d2+b-d1;
        }
        sum +=d*p;
        p=p*10;
    }
    return sum;
}
int main()
{
    int b,n1,n2;
    cin>>b>>n1>>n2;
    auto value = findvalue(b,n1,n2);
    cout<<value;
    return 0;
}
