# -*- coding: utf-8 -*-
"""
Created on Mon Mar 22 21:53:14 2021

@author: Shivangi
"""

s=input("Enter a string:")
d=0
u=0
l=0
sym=0
for i in s:
    if i.isalpha():
        if i.islower():
            l+=1
        else:
            u+=1
    elif i.isdigit():
        d+=1
    else:
        sym+=1
print("Lower case characters:",l)
print("Upper case characters:",u)
print("Digits:",d)
print("Symbols:",sym)