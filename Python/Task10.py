class rectangle:
    length=0
    width=0
    def rectangle_inputs(self):
        self.length=float(input("Enter the length of the rectangle: "))
        self.width=float(input("Enter the width of the rectangle: "))
    def area(self):
        return self.length*self.width

rect=rectangle()
rect.rectangle_inputs()
print(rect.area())
