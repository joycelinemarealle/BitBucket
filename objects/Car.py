

class Car:
    """The doc string of Car object"""
    def __init__(self, speed, topSpeed, registrationNumber):
        self.speed = speed
        self.topSpeed = topSpeed
        self.registrationNumber = registrationNumber
        
    def accelerate(self, increase):
        self.speed += increase
        if self.speed >= self.topSpeed:
            self.speed = self.TopSpeed
            return f'[cannot exceed {self.topSpeed} reduce speed!!]'
        else:
            return f'[speed = {self.speed}]'
        
