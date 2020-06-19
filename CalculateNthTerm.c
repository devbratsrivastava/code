#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>


int find_nth_term(int n, int a, int b, int c) {
  
  int s=0,f=0;
    while(f<=2)
    {
        s=a+b+c;
        
        a=b;
        b=c;
        c=s;
        f++;
    }
    return s;
}

int main() {
    int n, a, b, c;
  
    scanf("%d %d %d %d", &n, &a, &b, &c);
    int ans = find_nth_term(n, a, b, c);
 
    printf("%d", ans); 
    return 0;
}
