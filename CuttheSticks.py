n=int(input())
list1=[]
list1=((input())).split()
list2=[]
for i in list1:
    list2.append(int(i))
while(len(list2)>0):
    print(len(list2))
    x=min(list2)
    for i in range(len(list2)):
        list2[i]-=x
    while(list2.count(0)):#while 0 in list2:
        list2.remove(0)
    
    
