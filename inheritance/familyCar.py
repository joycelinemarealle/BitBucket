from Car import *
class Family(Car): #GOOD PRACTICE TO KEEP IN SEPERATED FILES
    def __init__(self, seater,speed, topSpeed, registrationNumber):
        super().__init__(speed, topSpeed, registrationNumber)
        self.seater = seater
        
    def accelerate(self, increase):
        self.speed += increase*0.5 #controlled speeding for safefty
        if self.speed >= self.topSpeed:
            self.speed = self.topSpeed
            return f'[cannot exceed {self.topSpeed} reduce speed!!]'
        else:
            return f'[speed = {self.speed}]'
        
    def footBootOpener(self):
        print("This car has a foot Boot Opener")
    
    def showSeater(self):
        return f'This is a {self.seater} seater family car'