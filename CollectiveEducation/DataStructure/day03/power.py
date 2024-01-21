# 거듭제곱 알고리즘

def slow_power(x,n):
    result = 1.0
    for i in range(n):
        result = result * x
    return result

print("2의 10승 = ", slow_power(2, 10))
print("3의 23승 = ", slow_power(3, 23))

# 순환 구조의 거듭제곱 알고리즘
def power(x,n) :
    if n == 0 : return 1.0
    elif (n % 2) == 0 :
        return power(x*x, n //2)
    else:
        return x*power(x*x, (n-1) //2)
    
print("순환 : 2의 10승 = ", power(2,10))
print("순환 : 3의 23승 = ", power(3,23))

# =================================================
import time
print("순환 구조 (2 ** 500) =", power(2.0, 500))
print("순환 구조 (2 ** 500) =", slow_power(2.0, 500))

t1 = time.time()
for i in range(100000) :
    power(2.0, 500)

t2 = time.time()
for i in range(100000) :
    slow_power(2.0, 500)

t3 = time.time()

print("순환 구조... ", t2-t1)
print("반복 구조... ", t3-t2)