from array import *

T = [[1,2,3], [4,5,6], [7,8,9]]
print(T[0])
print(T[1])
print(T[2])

T2 = [[T[0][0]-T[0][1], T[0][1]-T[0][2], T[0][2]],
[T[1][0]-T[1][1], T[1][1]-T[1][2], T[1][2]],
[T[2][0]-T[2][1], T[2][1]-T[2][2], T[2][2]]]
print(T2[0])
print(T2[1])
print(T2[2])



