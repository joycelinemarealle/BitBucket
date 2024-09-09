
class Calculator:
    def __init__(self):
        self._memory = 0  #private attribute use _
        
    @property 
    def memory(self):
        return self._memory #a getter
        
    @memory.setter  
    def memory(self, value):
        self._memory = value #a setter

    def memory_clear(self):
        self._memory = 0

    def add(self,a,b):
        return a+b

    def sub(self,a,b):
        return a-b

    def multiply(self,a,b):
        return a*b

    def divide(self,a,b):
        if b == 0:
            raise ValueError('Can not divide by zero!')
        return a/b
