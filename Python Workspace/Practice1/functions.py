# def add():
#     print(1+2)
# add()

# def add(a,b):
#     print(a+b)
# add(1,6)

# def print_list(list):
#     print(list)
# list=[1,5,3,3,2,5]
# print_list(list)


# def li(items):
#     for i in range(1,6):
#         for j in range(1,i+1):
#             print(j,end=' ')
#         print()
# list=[1,2,3,4,5,6]
# li(list)   

# def launchbrowser(Browsername):
#     if Browsername=="chrome":
#         print("launching Google chrome")
#     elif Browsername=="firefox":
#         print("launching firefox")
#     else:
#         print("no browser is defined")
# name="chrome"
# launchbrowser(name)

# factorial of any number

# def fact(num):
#     if(num>1):
#         num=num * fact(num-1)
#     return num
# print(fact(5))


# def login(uname,pwd):
#     print("login with %s and %s" %(uname,pwd))
# login("sr@gmail.com","12344")


# def getgrades(*arg):
#     for x in arg:
#         print(x,end=' ')
# getgrades('A','A+','C','D','B')

# keyword args
def students(**arg):
    for key,value in arg.items():
        print("%s=%s" %(key,value),end=' ')
students(na=10,sr=20,srinath=40)
    