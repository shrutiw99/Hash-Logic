# -*- coding: utf-8 -*-
"""
Created on Fri Mar 19 11:39:07 2021

@author: Shivangi
"""

w="Hello World"
i=0
j=0
while(i<len(w)):
    if w[i]=='o' or w[i]=='O':
        print("Occurence of \'o\' is at:",i+1)
    i=i+1
while(j<len(w)):
    print("Occurence of",w[j],"is at:",j+1)
    j+=1