months=["january","february","march","april","may","june","july","august","september","october","november","december"]
month_days=[31,28,31,30,31,30,31,31,30,31,30,31]
month=input("Enter the month: ")
for i in range (12):
    if(month.lower()==months[i]):
        print(month_days[i])
