from Car import *
from familyCar import *

"""The doc string of main """

def main():
    car1= Family(6, 100, 180, "Y789")
    car2 = Luxury("warm seats",60, 120, "K890")
   
   
    print(car1.accelerate(190))
    print(car2.accelerate(50))
                    
if __name__ == '__main__':
    main()