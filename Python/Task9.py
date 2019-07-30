print("Enter the elements of the list separating each element by a space: ")
a=[int(x) for x in input().split()]
count_e=0
count_o=0
for i in range(len(a)):
    if(a[i]%2==0):
        count_e=count_e+1
    elif(a[i]%2==1):
        count_o=count_o+1
print("Number of even numbers in the list: "+str(count_e))
print("Number of odd numbers in the list: "+str(count_o))
