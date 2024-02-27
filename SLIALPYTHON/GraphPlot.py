#
# This example shows how to plot a few graphs in one figure
#

import numpy as np
import matplotlib.pyplot as plt

#
#  Maybe we have some datapoints that we want to plot
#
t = np.array([0,1,2,3,4],dtype=np.double)
y = np.array([0,1,0.8,0.25,-1],dtype=np.double)

# let us plot our datapoints as '*' symbols
plt.plot(t,y,'*',label='datapoints')

# label the axes
plt.xlabel('t')
plt.ylabel('y')

# add grid points to the figure so that it is easier to read
plt.grid(True)

# now let us plot f(t) = sin(t) in the same figure
# in the interval [0..2pi], using 100 plot points
t_plt = np.linspace(0,2*np.pi,100)
y_plt = np.sin(t_plt)
# and plot it as a line
plt.plot(t_plt,y_plt,'-',label='sin')

# let us plot a polynomial p(t) = t-t^3/6+t^5/120 on the interval [0,3], using 50 points
t_plt1 = np.linspace(0,3,50)
y_plt1 = t_plt1 - t_plt1**3/6 + t_plt1**5/120
# and plot it as a line
plt.plot(t_plt1,y_plt1,'-',label='t-t^3/6+t^5/120')

# and add a legend to the figure
plt.legend()

# finally, show the plot
plt.show()