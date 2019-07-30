median=['','','']
print("Enter the three values: ")
for i in range(3):
    median[i]=input()
median.sort()
print(str(median[1])+" is the median of the given values.")
