n = 10

l = [True] * (n+1)
i = 2

while(i*i <= n):
    if (l[i]):
        for j in range(i*i, n+1, i):
            l[j] = False
    i+=1
    
print([x for x in range(2, len(l)) if l[x]==True])
    