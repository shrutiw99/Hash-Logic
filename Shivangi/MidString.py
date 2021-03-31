# -*- coding: utf-8 -*-
"""
Created on Mon Mar 22 20:56:45 2021

@author: Shivangi
"""

s=input("Enter a string:")
if len(s)>=7 and len(s)%2 != 0:
    l= len(s)//2
    mid=s[l-1:l+2]
    print("Original String is: ",s)
    print("Middle 3 characters are:",mid)
else:
    print("Please enter a String of odd length>7")