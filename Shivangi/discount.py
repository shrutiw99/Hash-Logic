# -*- coding: utf-8 -*-
c=100
d=0
q=int(input("Enter the no. of purchased quality: "))
c*=q
if c > 1000:
    d=0.1*c
    c=c-d
    print("Total Cost is:",c)
else:
    print("Total Cost is:",c)
