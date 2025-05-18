num1 = int(input())
num2 = int(input())

digit1 = num2 % 10
digit2 = (num2 // 10) % 10
digit3 = num2 // 100

step1 = num1 * digit1
step2 = num1 * digit2
step3 = num1 * digit3
step4 = num1 * num2

print(step1)
print(step2)
print(step3)
print(step4)