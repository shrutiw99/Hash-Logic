# -*- coding: utf-8 -*-
"""
Created on Mon Mar 22 23:26:22 2021

@author: Shivangi
"""

str1=input("Enter a string:")
for i in range(0,len(str1),-1):
    if (str1[i] == 'Emma'):
        print("Last occurence of \'Emma\' is at position:",i+1)
        break
