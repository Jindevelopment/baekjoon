h,m = input().split()
h = int(h)
m = int(m)
cook = int(input())

m+=cook
if m>=60 :
    h+=(m//60)
    m%=60
    if(h>=24):
        h-=24

print(h,m)