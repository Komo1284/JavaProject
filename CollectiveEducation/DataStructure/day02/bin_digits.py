# 2진수 표기의 비트 수

def binary_digits(n) :
    count = 1
    while n > 1 :
        count += 1
        n = n //2
    return count

#===========================
print("총 비트수 (  0) = ", binary_digits(0))
print("총 비트수 (  1) = ", binary_digits(1))
print("총 비트수 ( 13) = ", binary_digits(13))
print("총 비트수 (123) = ", binary_digits(123))
print("총 비트수 (123456789012345) = ", binary_digits(123456789012345))