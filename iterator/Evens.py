class Evens:
    def __init__(self, limit):
        self.limit = limit
        self.val = 0 #if initiate with a value do not need to pass it

        #Makes this class iterable
    def __iter__(self):
        return self
    
    def __next__(self):
        if self.val > self.limit:
            raise StopIteration
        else:
            rval = self.val
            self.val +=2
            return rval

"""class Evens:
    def __init__(self,limit):
        self.limit = limit
        self.val = 0

#Makes this class iterable
def __iter__(self):
    result = range(0,self.limit+1)
    result = filter (lambda x: x%2 ==0 , result)
    return result 

    """