matrix1=[[5,6,9],[4,2,8]]
matrix2=[[5,9,7],[2,4,6]]
matrix3=[[0,0,0],[0,0,0]]
# mat_len2=len(matrix2)
for j in range(len(matrix1)):
    # print(j)
    for l in range(len(matrix2)+1):
        print(l)
        matrix3[j][l]=matrix1[j][l]+matrix2[j][l]
print("the sum of matrixes of 1 and 2 are:",matrix3)