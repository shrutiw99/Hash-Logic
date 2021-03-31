# -*- coding: utf-8 -*-
"""
Created on Thu Mar 18 19:40:35 2021

@author: Shivangi
"""

h=int(input("Enter the no. of classes held: "))
a=int(input("Enter the no. of classes attended: "))
p=a/h
print("\t%age of attendance is:",round(p*100,2))
if p>0.75:
    print("Allowed to sit in exam")
else:
    print("Not allowed to sit in exam")