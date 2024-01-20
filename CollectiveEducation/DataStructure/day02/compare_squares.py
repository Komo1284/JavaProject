# 제곱을 구하는 세가지 알고리즘

def squareAlgorithmA( x ) :
    sum = x * x
    return sum

def squareAlgorithmB( x ):
    sum = 0
    for i in range (x):
        sum += x
    return sum

def squareAlgorithmC( x ) :
    sum = 0
    for i in range(x):
        for j in range(x):
            sum += 1
    return sum

# ======================================
import time

print("알고리즘A : 9 * 9 =", squareAlgorithmA(9))
print("알고리즘B : 9 * 9 =", squareAlgorithmB(9))
print("알고리즘C : 9 * 9 =", squareAlgorithmC(9))

n = 10000

t0 = time.time()
result = squareAlgorithmA(n)
t1 = time.time()
print("알고리즘A = ", result, "실행시간 = ", t1-t0)

t0 = time.time()
result = squareAlgorithmB(n)
t1 = time.time()
print("알고리즘B = ", result, "실행시간 = ", t1-t0)

t0 = time.time()
result = squareAlgorithmC(n)
t1 = time.time()
print("알고리즘C = ", result, "실행시간 = ", t1-t0)
        