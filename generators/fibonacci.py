class fibonacci:
    def __init__(self, number):
        self.number = number

    def gen_fibNum(listNum,p): #l list iterating through p holds a item of the list
        a,b = 0,1

        for num in range(listNum):
            a,b = b, a+b
            yield b

