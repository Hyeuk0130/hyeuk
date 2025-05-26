import sys

for line in sys.stdin:  # 입력이 더 이상 없을 때까지 반복
    A, B = map(int, line.split())
    print(A + B)
