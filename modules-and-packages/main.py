from calculation import substractOne, addOne as add
from listoperations import addOne as addOneToList

import sys

def main():
    n = int(input('Enter a number'))
    if n %2 != 0:
        substractOne(n)
    else:
        add(n)
    l = [5,6,7]
    print(addOneToList(l))
    print(__doc__)
        

if __name__ == '__main__':
    main()


"""if from calculation import * 
then do not need to do calculation.method(n)
does not import _method

if use import calculation 
then need calculation.method(n)
it imports everything

"""