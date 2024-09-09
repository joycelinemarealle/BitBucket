from Car import *
class Sports(Car):
    def __init__(self,horsePower, speed, topSpeed, registrationNumber):
        super().__init__(speed, topSpreed, registrationNumber)
        self.horsePower = horsePower
    
    def accelerate(self, increase):
        self.speed += increase*1.5 #high speed for sports cars
        if self.speed >= self.topSpeed:
            self.speed = self.topSpeed
            return f'[cannot exceed {self.topSpeed} reduce speed!!]'
        else:
            return f'[speed = {self.speed}]'
    
    def showHorsePower(self):
        return f'This sports car has a horsepower of {self.horsePower}'
