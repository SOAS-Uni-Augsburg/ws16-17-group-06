'''
Created on 03.11.2016

@author: User
'''
import matplotlib.pyplot as plt
import numpy as np
import math
x = np.arange(0, 1, 0.1);
y = np.zeros(10);
for h in xrange(1, 10):
    k=h*0.1;
    print k
    y[h]=-k*math.log(k,2)-(1-k)*math.log(1-k,2)
plt.plot(x, y)
plt.show();