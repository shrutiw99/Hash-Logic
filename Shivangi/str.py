# -*- coding: utf-8 -*-
"""
Created on Fri Mar 19 11:26:20 2021

@author: Shivangi
"""

s="Hello World 123"
v=('a','e','i','o','u','A','E','I','O','U')
vc=0
d=0
w=0
c=0
for i in s[0:]:
    if i in v:
        vc=vc+1
    elif i not in v:
        c=c+1
    elif i>=0 and i<=9:
        d=d+1
    elif i =="                                     ":
        w=w+1
print("Vowels:",vc)
print("Consonant:",c)
print("Digits:",d)
print("Whitespaces:",w)
