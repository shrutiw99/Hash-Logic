# -*- coding: utf-8 -*-
b=0
ser=int(input("Enter the year of service: "))
sal=int(input("enter the salary: "))
if ser > 5:
    b=0.05*sal
    sal+=b
    print("Net bonus amount is:",sal)
else:
    print("Amount is:",sal)

