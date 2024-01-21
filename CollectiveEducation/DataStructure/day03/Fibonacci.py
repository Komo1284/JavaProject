# 피보나치 수열

# Fibonacci (순환)
def fib(n) :
    # print('fib(%d)' % n)
    if n == 0 : return 0
    elif n == 1 : return 1
    else :
        return fib(n-1) + fib(n-2)
    

print("fin(6) = ", fib(6))

# Fibonacci (반복)
def fib_iter(n) :
    if (n < 2) : return n
    last = 0
    current = 1
    for i in range(2, n+1) :
        tmp = current
        current += last
        last = tmp
    return current

import time

print('Fibonacci반복(5) = ', fib_iter(5))
print('Fibonacci순환(5) = ', fib(5))
for i in range(1,40) :
    t1 = time.time()
    fib_iter(i)
    t2 = time.time()
    fib(i)
    t3 = time.time()
    print("n = ", i, "\t반복: ", t2 - t1, "순환 : ", t3 - t2)