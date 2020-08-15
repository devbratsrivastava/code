#include<stdio.h>
int main()
{
    int n,k;
    scanf("%d%d",&n,&k);
    int max=0;
    //printf("%d%d",n,k);
    for(int i=1;i<n;i++)
    {
        for(int j=i+1;j<=n;j++)
        {
            //printf("%d%d\n",i,j);
            if((i&j)>max&&(i&j)<k)
            max=(i&j);
        }
    }
    printf("%d\n",max);
    max=0;
    for(int i=1;i<n;i++)
    {
        for(int j=i+1;j<=n;j++)
        {
            //printf("%d%d\n",i,j);
            if((i|j)>max&&(i|j)<k)
            max=(i|j);
        }
    }
    printf("%d\n",max);
    max=0;
    for(int i=1;i<n;i++)
    {
        for(int j=i+1;j<=n;j++)
        {
            //printf("%d%d\n",i,j);
            if((i^j)>max&&(i^j)<k)
            max=(i^j);
        }
    }
    printf("%d\n",max);
}
