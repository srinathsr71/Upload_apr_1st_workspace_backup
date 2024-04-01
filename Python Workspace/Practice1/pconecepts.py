# a=100
# b=200
# c=330
# if a>b and a>c:
#     print("a is the highest number")
# elif b>c:
#     print("b is the highest number")
# else:
#     print("c is the highest number")

a=100
b=200
c=330
d=2000
if a>b and a>c:
    print("a is the highest number")
elif b>c:
    print("b is the highest number")
elif c>d:
    print("c is the highest number")
else:
    print("d is the highest number")




total=int(input("please enter total value"))
if total<=100:
    total=total+20
elif total>=100 and total<=500:
    total=total+50
else:
    total=total+100

print(total)
# print(f'{"total value="}{total}')f'strings

