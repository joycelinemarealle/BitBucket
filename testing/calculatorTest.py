import unittest 
from calculator import *

class test_calculator(unittest.TestCase):
    def setUp(self):
        print('Set up')

    def tearDown(self):
        print('tear down')

    def test_initial_value(self):
        c= Calculator() #create new object Calculator
        self.assertEqual(c.total, 0, "initial value not set")

    def test_add_2_and_3(self):
        c = Calculator() #create new object Calculator
        c.set(3)
        c.add
        c.set(2)
        c.add()
        self.assertEqual(c.total, 2, "add 2+3 does not equal 5")

if __name__ == '__main__':
    unittest.main()