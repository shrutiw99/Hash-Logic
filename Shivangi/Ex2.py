# -*- coding: utf-8 -*-
"""
Created on Mon Mar 22 21:05:01 2021

@author: Shivangi
"""

s1=input("Enter a string1:")
s2=input("Enter a string2:")
l1=len(s1)//2
new=s1[:l1]+s2+s1[l1:]
print(new)