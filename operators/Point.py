class Point:
    def __init__(self, x, y):
        self.x = x
        self.y = y 
    
    def __add__(self, value):
        newX = self.x + value.x #adding object to object
        newY = self.y + value.y

        return Point(newX, newY)
       
    
    def __sub__(self, value):
         newX = self.x - value.x
         newY = self.y - value.y
         return Point(newX, newY)
    
    
    def __str__(self):
        return f'Point({self.x}, {self.y})' #do not want to change the x and y so return original