# print('welcome to the python world')
#print maximum of two numbers
# a=2
# b=4
# if a>=b:
#     print ('a is maximum')
# else:
#     print ('b is maximum')


# addition of two numbers
# a=2
# b=6
# if a<=b:
#     print(a+b)
# else:
#     print(a-b)
# print 1 to 10 numbers
# i=10
# for a in range(1,11):
#     print(a)

# with out using range
# n=1
# while n<=100:
#     print (n ,end=' ')
#     n+=1
# print multiple of 2
# n=11
# i=1
# for i in range(n):
#     print(3*i,end=' ')

def fact(n):
    if n < 0:
        return 0
    elif n==0 or n==1:
        return 1
    else:
        fact=1
        while(n>1):
            fact *=n
            n -=1
        return fact

num=5
j=fact(num)
print("factorial of",num,"is",j)








