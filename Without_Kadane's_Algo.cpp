#include <iostream>
#include <limits>
#include <stdio.h>
#include <bits/stdc++.h>
using namespace std;

int maxSubArraySum(int a[],int n)
{
    int i,j,k,max=INT_MIN,s=0;
    for(i=0;i<n;i++)
    {
        //cout<<"i="<<endl;
        for(int j=0;j<=i;j++)
        {
            //cout<<j<<" ";
            //cout<<"j="<<endl;
            s=0;
            for(int k=j;k<n-i+j;k++)
            {
                //cout<<"k="<<endl;
                //cout<<k<<" ";
                s+=a[k];
            }
            //cout<<s;
            if(s>max)
            max=s;
            //cout<<endl;
        }
        //cout<<endl;
    }
    return max;
}

int main()
{
    //cout<<"Hello World";
    int a[] = {-2, -3, 4, -1, -2, 1, 5, -3};
    int n=sizeof(a)/sizeof(a[0]);
    //int maxSum=maxSubArraySum(a,n);
    int largestSum=maxSubArraySum(a,n);
    cout <<"max contiguous sum is " <<largestSum<<endl;
    return 0;
}
