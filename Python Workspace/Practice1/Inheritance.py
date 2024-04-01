# class Base(object):
#     pass
# class Child(Base):
#     pass
# print(issubclass(Child,Base))

class Base1(object):
    def __init__(self):
        self.str1="srinath"
        print("Base1")
    
class Base2(object):
    def __init__(self):
        self.str2="sri"
        print("Base2")

class Child(Base1,Base2):
    def __init__(self):
        Base1.__init__(self)
        Base2.__init__(self)
        print("Child")
    def printstrings(self):
        print(self.str1,self.str2)

ob=Child()
ob.printstrings()