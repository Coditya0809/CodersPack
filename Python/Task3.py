l=["","","","",""]
max_length=-9999999999

for i in range(5):
    l[i]=input("Enter the "+str(i)+"th word: ")
for x in range (5):
    if(len(l[x])>max_length):
        max_length=len(l[x])
        maxl_word=l[x]
print(maxl_word+" is the word with longest length of "+str(max_length))
