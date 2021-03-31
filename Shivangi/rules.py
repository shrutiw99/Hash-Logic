# -*- coding: utf-8 -*-
"""
Created on Thu Mar 18 20:11:11 2021

@author: Shivangi
"""

age=int(input("Enter age: "))
g=input("Male or Female? (M or F)")
m=input("Married? (Y or N)")
if g == 'F' or g == 'f':
    print("Will work only in Urban Areas")
elif (g == 'M' or g == 'm') and (age>=20 and age<=40):
    print("May Work Anywhere")
elif (g == 'M' or g == 'm') and (age>=40 and age<=60):
    print("Will work in Urban Areas Only")
else:
    print("ERROR")