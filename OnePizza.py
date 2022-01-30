#one pizza 
c=int(input())
totallikelist=[] 
for i in range(c):
  
  #l=int(input())
  like=input()
  #print(like)
  likelist=like.split()
  likelist.pop(0)
  for j in likelist:
    if j not in totallikelist:
      totallikelist.append(j)
  #print(totallikelist)
  #print(likelist)
  #d=int(input())
  dislike=input()
  #print(like)
  dislikelist=dislike.split()
  dislikelist.pop(0)
  for j in dislikelist:
    if j in totallikelist:
      totallikelist.remove(j)
print(totallikelist)
  #print(dislikelist)
  
