#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the repeatedString function below.
def repeatedString(s, n):
    c=0
    for i in s:
        if(i=='a'):
            c+=1
    c=c*int(n/len(s))
    for i in range(0,int(n%len(s))):
        if(s[i]=='a'):
            c+=1
    return c

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    s = input()

    n = int(input())

    result = repeatedString(s, n)

    fptr.write(str(result) + '\n')

    fptr.close()
