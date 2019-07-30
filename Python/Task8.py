print("Enter the elements of the list separating each element by a space: ")
a=[int(x) for x in input().split()]
pdt=1
for i in range(len(a)):
    pdt=pdt*a[i]
print(pdt)
