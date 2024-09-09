from Car import *
class LuxurySports(Car):
    def __init__(self,luxuryFeature, horsePower, speed, topSpeed, registrationNumber):
         super().__init__(speed, topSpeed, registrationNumber)
         self.horsePower = horsePower
         self.luxuryFeature = luxuryFeature
    
    def showLuxuryFeature(self):
        return f'This is Luxury Car has : {self.luxuryFeature}'
    
    
    def showHorsePower(self):
        return f'This sports car has a horspower of {self.horsePower} '
    
    def accelerate(self, increase):
        self.speed += increase*1.5 #high speed for sports cars
        if self.speed >= self.topSpeed:
            self.speed = self.topSpeed
            return f'[cannot exceed {self.topSpeed} reduce speed!!]'
        else:
            return f'[speed = {self.speed}]'
