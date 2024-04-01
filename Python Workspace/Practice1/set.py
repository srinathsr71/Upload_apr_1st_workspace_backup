# s1=set("python")
# print(s1)
# s2=set([10,2,1,4])
# print(s2)
p1={1,2,3,4,5}
p2={2,3,4,5,7}
print(p1|p2)
print(p1&p2)
#difference of sets
print(p1-p2)
#symmateric difference
print(p1^p2)
p1.add(8)
p1.update(['2','11'])
p1.clear()
p1.copy()
#discard(remove element from the list)
p1.discard()