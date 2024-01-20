# 리스트의 중복 항목 검사 알고리즘

def unique_elements(A):
    n = len(A)
    for i in range(n-1):
        for j in range(i+1,n):
            if A[i] == A[j] :
                return False
    return True

A = [32,14,5,17,23,9,11,14,26,29]
B = [13,6,8,7,12,25]
C = [22,16,14,12,7,13,27,17]

print(A, unique_elements(A))
print(B, unique_elements(B))
print(C, unique_elements(C))