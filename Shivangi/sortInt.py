# -*- coding: utf-8 -*-
"""
Created on Wed Mar 24 11:21:06 2021

@author: Shivangi
"""

#------SORTING 3 integers without conditional statements
n1=int(input("Enter a number1:"))
n2=int(input("Enter a number2:"))
n3=int(input("Enter a number3:"))
n1=min(n1,n2,n3)
n3=max(n1,n2,n3)
n2=( n1 + n2 + n3) - n3 - n1 
print("Sorted integers:",n1,n2,n3)