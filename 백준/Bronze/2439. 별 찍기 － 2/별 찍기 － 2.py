N = int(input())  # 사용자 입력 받기

for i in range(1, N + 1):
    print(" " * (N - i) + "*" * i)