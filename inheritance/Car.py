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

   


