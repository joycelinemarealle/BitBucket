from Car import *

class Luxury(Car):
    def __init__(self,luxuryFeature, speed, topSpeed, registrationNumber):
        super().__init__(speed, topSpeed, registrationNumber)
        self.luxuryFeature = luxuryFeature
    
    def showLuxuryFeature(self):
        return f'This is Luxury Car has : {self.luxuryFeature}'
    
    def accelerate(self, increase):
        self.speed += increase
        if self.speed >= self.topSpeed:
            self.speed = self.topSpeed
            return f'[cannot exceed {self.topSpeed} reduce speed!!]'
        else:
            return f'[speed = {self.speed}]'
