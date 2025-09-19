q = int(input())
g = input()
r = input()
nota = 0

for i in range(q):
    if g[i] == r[i]:
        nota = nota + 1
    
print(nota)
