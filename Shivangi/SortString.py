# -*- coding: utf-8 -*-
"""
Created on Mon Mar 22 21:43:54 2021

@author: Shivangi
"""

s=input("Enter a string:")
l=""
u=""
for i in s[:]:
    if i.islower():
        l+=i
    else:
        u+=i
new_s=l+u
print(new_s)