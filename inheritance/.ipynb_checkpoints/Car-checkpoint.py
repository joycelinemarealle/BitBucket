from abc import ABCMeta, abstractmethod

class Car(metaclass=ABCMeta):
    """The doc string of Car object"""
    def __init__(self, speed, topSpeed, registrationNumber):
        self.speed = speed
        self.topSpeed = topSpeed
        self.registrationNumber = registrationNumber
  
    @abstractmethod
    def accelerate(self, increase):
        pass #MAKE SURE TO OVERIDE abstract method IN ALL SUBCLASSES

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
