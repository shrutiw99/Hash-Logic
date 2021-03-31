# -*- coding: utf-8 -*-
"""
Created on Mon Mar 22 21:33:11 2021

@author: Shivangi
"""
s1=input("Enter a string1:")
s2=input("Enter a string2:")
l1=len(s1)//2
l2=len(s2)//2
print(l1,l2)
new=s1[:1]+s2[:1]+s1[l1]+s2[l2]+s1[-1]+s2[-1]
print("New String:",new)