A,B,C=map(int,input().split())
if A==B==C:
  D=10000+A*1000
elif A==B or B==C or A==C:
  same=A if A==B or A==C else B
  D=1000+same*100
elif A!=B!=C:
  largest=max(A,B,C)
  D=largest*100
print(D)