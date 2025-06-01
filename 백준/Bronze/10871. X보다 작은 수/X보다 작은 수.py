N,X=map(int,input().split())
N=list(map(int,input().split()))
result = [num for num in N if num < X]
print(" ".join(map(str, result)))