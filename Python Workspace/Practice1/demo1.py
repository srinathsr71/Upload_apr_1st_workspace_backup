# find the factorial using recursion and using iterative
# def fact(n):
#     if n==1 or n==0:
#         return 1
#     else:
#         return n* fact(n-1)
# num=5
# x=fact(num)
# print("factorial of",num,"is",x)
# logic 
# 5 * fact(4)
# 5 * 4 * fact(3)
# 5 * 4 * 3 * fact(2)
# 5 * 4 * 3 * 2 * fact(1)
# 5 * 4 * 3 * 2 * 1

# using iterative
# def fact(n):
#     if n < 0:
#         return 0
#     elif n==0 or n==1:
#         return 1
#     else:
#        fact=1
#        while(n>1):
#            fact *= n
#            n -= 1
#     return fact   
       

# num=5
# x=fact(num)
# print("factorial of",num,"is",x)       
# logic
    # 5>1-True
    # 1*5=5
    # 1-5=4
    

# def fact(n):
#     if n < 0:
#         return 0
#     elif n == 0 or n == 1:
#         return 1
#     else:
#         fact = 1
#         while(n > 1):
#             fact *= n
#             n -= 1
#         return fact
 


# num = 10
# x = fact(num)
# print("Factorial of",num,"is",x)


# 5>1 True
# 1*5=5
# 5-1=4
# 4>1 True
# 1*4=4
# 4-1=3
# 3>1
# 1*3=3
# 3-1=2
# 2>1
# 1*2=2
# 1-2=1
# 1>1 False
# 5*4*3*2



# marks=int(input("please enter your marks"))
# if(marks > 50):
#     print("you have passed the examination")
# if(marks <=50 and marks >20):
#     print("status waiting")
# if(marks<=20):
#     print("you have to attend extra classes")


# a=int(input("please enter First value"))
# b=int(input("Please enter Second value"))
# c=int(input("please enter Third value"))
# if (a>b) and (a>c):
#     print(a,"is a largest number")
# if(b>a) and (b>c):
#     print(b,"is a largest number")
# if(c>a) and (c>b):
#     print(c,"is a largest number")


# list=[1,2,3,4,5]
# for e in list:
#     print(e**3)

# list=[45,33,32,12]
# sum=0
# for r in list:
#     sum=sum+r
# print("the sum is",sum)


# d=int(input("enter the d value"))
# v=int(input("Enter the v value"))
# g=int(input("Enter the g value"))
# if (d>v) and (d>g):
#     print("d is largest value")
# if (v>d) and (v>g):
#     print("v is largest value")
# if (g>d) and (g>v):
#     print("g is largest value")



# list=[2,1,1,2,1,2]
# t=1
# for t in range(1,10):
#     if t==6:
#         continue
#     else:
#         print(t,end=' ')
    
    

# for t in range(1,10):
#     print(t,end=' ')
#     if t==5:
#         break

# d=int(input("enter the d value"))
# v=int(input("Enter the v value"))
# g=int(input("Enter the g value"))
# if (d>v) and (d>g):
#     print("d is largest value")
# elif (v>d) and (v>g):
#     print("v is largest value")
# elif (g>d) and (g>v):
#     print("g is largest value")
# else:
#     print("No value is largest")

# for t in range(1,10,2):
#     print(t,end=' ')
# for t in range(10):
#     print(t,end=' ')
