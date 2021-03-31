# -*- coding: utf-8 -*-
"""
Created on Fri Mar 19 10:48:39 2021

@author: Shivangi
"""

age1=int(input("Enter the age of person1:"))
age2=int(input("Enter the age of person2:"))
age3=int(input("Enter the age of person3:"))
print(max(age1,age2,age3),"is Oldest")
print(min(age1,age2,age3),"is Youngest")
if age1==age2:
    print("Age1 & Age2 are equal")  
elif age2==age3:
    print("Age2 & Age3 are equal")
elif age1==age3:
    print("Age1 & Age3 are equal")
elif age1==age2 and age2==age3:
    print("All are equal")
    
    