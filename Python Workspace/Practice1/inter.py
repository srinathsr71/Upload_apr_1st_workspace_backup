# for ele in range(ord('a'),ord('z')+1):
#     # it will print alaphabets
#     n=chr(ele) 
#     print(n,end=' ')
#     # it will print values
#     v=ele-ord('a')+1
#     print(v,end=' ')
#     # print key,value pair like alphabet equal to value
#     print(f'{n}={v}')

# {'a':1}

alphabet_dict_list = []

for char_code in range(ord('A'), ord('Z') + 1):
    letter = chr(char_code)
    numeric_value = char_code - ord('A') + 1
    alphabet_dict = {letter: numeric_value}
    alphabet_dict_list.append(alphabet_dict)

print(alphabet_dict_list)
