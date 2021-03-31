# -*- coding: utf-8 -*-
age1, age2, age3=input("Enter the age of 3 persons \'Comma Separated\':").split()
if age1 >= age2 and age1 >= age3:
    print(age1,"is Oldest")
    if age1==age2 and age2>age3:
        print("Age1 & Age2 are equal")
        print(age3,"is Youngest")
    elif age1==age3 and age1>age2:
        print("Age1 & Age3 are equal")
        print(age2,"is Youngest")
    else:
        if age2>age3:
            print(age3,"is Youngest")
        else:
            print(age2,"is Youngest")
        
elif age2>=age1 and age2>=age3:
    print(age2,"is Oldest")
    if age2==age1 and age2>age3:
         print("Age1 & Age2 are equal")
         print(age3,"is Youngest")
    elif age2==age3 and age2>age1:
        print("Age2 & Age3 are equal")
        print(age1,"is Youngest")
    else:
        if age1>age3:
            print(age3,"is Youngest")
        else:
            print(age1,"is Youngest")
            1
else:
    print(age3,"is Oldest")
    if age3==age1 and age1>age2:
        print("Age1 & Age3 are equal")
        print(age2,"is Youngest")
    elif age3==age2 and age3>age1:
        print("Age2 & Age3 are equal")
        print(age1,"is Youngest")
    else:
        if age1>age2:
            print(age2,"is Youngest")
        else:
            print(age1,"is Youngest")

