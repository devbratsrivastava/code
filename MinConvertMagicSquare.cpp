#include<iostream>
#include<vector>
#include<climits>
#include<algorithm>
using namespace std;
bool isMagic(vector<int> v)
{
    int a[3][3];
    for(int i=0;i<3;i++)
    {
        for(int j=0;j<3;j++)
        {
            a[i][j]=v[3*i+j];
        }
        
    }
    int s=0;
    for(int j=0;j<3;j++)
    s+=a[0][j];
    for(int i=1;i<3;i++)
    {
        int t=0;
        for(int j=0;j<3;j++)
        {
            t+=a[i][j];
        }
        if(t!=s)
        return 0;
    }
    for(int j=0;j<3;j++)
    {
        int t=0;
        for(int i=0;i<3;i++)
        {
            t+=a[i][j];
        }
        if(t!=s)
        return 0;
    }
    int t=0;
    for(int i=0;i<3;i++)
    {
        t+=a[i][i];
    }
    if(t!=s)
    return 0;
     t=0;
    for(int i=0;i<3;i++)
    {
        t+=a[2-i][i];
    }
    if(t!=s)
    return 0;
    return 1;
}
void find(vector<vector<int>>&ms)
{
    vector<int>v(9);
    for(int i=0;i<9;i++)
    v[i]=i+1;
    do {
    if(isMagic(v))
    {
        ms.push_back(v);
    }
    }while (next_permutation(v.begin(),v.end()));
}
int diff(vector<int> a ,vector<int> b)
{
    int r=0;
    for(int i=0;i<9;i++)
    r+=abs(a[i]-b[i]);
    return r;
}
int wrapper(vector<int> v)
{
    int r=INT_MAX;
    vector<vector<int>> ms;
    find(ms);
    for(int i=0;i<ms.size();i++)
    {
        r=min(r,diff(v,ms[i]));
    }
    return r;
}
int main()
{
    vector<int> v;
    for(int i=0;i<9;i++)
    {
        int x;
        cin>>x;
        v.push_back(x);
    }
    cout<<wrapper(v)<<endl;
    return 0;
}
