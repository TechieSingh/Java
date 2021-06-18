#include<iostream>
using namespace std;

int getproduct(int b,int n1,int r){
    int result=0;
    int c=0;
    int product;
    int p=1;
    while (n1>0 || c>0)
    {
        int o =n1%10;
        n1=n1/10;
        product=((o*r)+c)%b;
        c=((o*r)+c)/b;
        result=result+product*p;
        p=p*10;
    }
    return result;
}

 int findvalue(int b, int n1,int n2){
    int value=0;
    int c=0;
    int p=1;
    while (n1>0 || n2>0 || c>0)
    {
        int r1 =n1%10;
        int r2 =n2%10;
        n1=n1/10;
        n2=n2/10;
        int d=r1+r2+c;
        c=d/b;
        d=d%b;
        value +=d*p;
        p=p*10;
    }
    return value;
}
int getsum(int b, int n1, int n2){
    int sum=0;
    int value=0;
    int p=1;
    while (n2>0)
    {
        int r =n2%10;
        n2=n2/10;
        value = getproduct(b,n1,r);
        sum=findvalue(b,sum,value*p);
        p=p*10;
    }
    
    
    return sum;
}


int main(){
    int b, n1, n2;
    cin>>b>>n1>>n2;
    cout<<getsum(b,n1,n2);
}