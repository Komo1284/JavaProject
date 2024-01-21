# 파이썬 리스트 기본 활용

A = []
B = [1, 2, 3, 4]
C = ["hi", "list"]

print("len(A) = ",len(A))
print("len(B) = ",len(B))
print("B[1] = ", B[1])
print("B = ", B)

sum = 0
for i in range(len(B)) :
    sum = sum + B[i]

print("sum(B) = ", sum)

#리스트 만들기 고급
D = [5] * 10
print("D = ", D)

#리스트 내포( comprehension)
import random
E = [ random.randint(0,10) for i in range(10)]
print("E = ", E)

F = E
print ("E = ", E)
print ("F = ", F)
F[3] = 1000
print("E = ", E)
print("F = ", F)

G = list(E)
G[3] = 2000
print("E = ", E)
print("G = ", G)

# 슬라이스 기능
H = G[0:8:2]
print("G = ", G)
print("H = ", H)
