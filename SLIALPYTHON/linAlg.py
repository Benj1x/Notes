#
# This example shows how to form and solve a system 
# of linear algebraic equations in Python, using numpy
#
import numpy as np

#
# We define the matrix, for example, row-by-row:
#
A = np.array([[1,2,3], \
              [4,5,6], \
              [1,-2,-3]],dtype=np.double)

#
# Alternatively, one could initialize the matrix to zero,
# and then fill it out elementwise:
# 
# A = np.zeros([3,3])
# A[0,0] = 1 
# A[0,1] = 2 #etc  
#  #Important: remember that indexing starts from 0 here

#
# Then we define the right hand side.  Since Matlab distinguishes
# between column and row vectors, it has to be a column vector
#
b = np.array([5,8,11],dtype=np.double)

#
# Finally we solve the system:
#
x = np.linalg.solve(A,b)

#
# x can be printed
#
print('x=')
print(x)