# -*- coding: utf-8 -*-
"""
Created on Tue Mar 23 00:00:25 2021

@author: Shivangi
"""

l = ["Emma", "Jon", "", "Kelly", None, "Eric", ""]
new=[]
for i in l:
    if i == None or i=="":
        l.remove(i)
        print(l)
str1="Emma25 is an Analyst30"
for i in str1.split():
    if i.isalnum():
        print(i)
        