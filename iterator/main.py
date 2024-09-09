from Evens import *

def main():
    print('Start')
    for i in Evens(6) :
        print(i, '', end = '')

    elist = list (Evens(8))
    print ('The list of even number', elist,'', end ='')
if __name__ == '__main__':
    main()