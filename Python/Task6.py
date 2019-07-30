print("Enter the lengths of the three sides of the triangle: ")
a=input("FIRST side: ")
b=input("SECOND side: ")
c=input("THIRD side: ")

if(a==b==c):
    print("The triangle is an equilateral traingle.")
elif((a==b and c!=a)or(b==c and a!=b)or(c==a and b!=c)):
    print("The triangle is an isosceles triangle.")
else:
    print("The triangle is a scalene triangle.")
