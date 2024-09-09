import unittest
import calc

class TestCalc(unittest.TestCase):
    def setUp(self):
        self.c = calc.Calculator() #instance of calculator

    def test_add(self):
        self.assertEqual(self.c.add(10, 5), 15)
        self.assertEqual(self.c.add(-1, 1), 0)  # edge case
        self.assertEqual(self.c.add(-1, -1), -2)  # edge case

    def test_sub(self):
        self.assertEqual(self.c.sub(10, 5), 5)
        self.assertEqual(self.c.sub(-2, -2), 0)  # edge case
        self.assertEqual(self.c.sub(-10, 5), -15)  # edge case

    def test_multiply(self):
        self.assertEqual(self.c.multiply(10, 5), 50)
        self.assertEqual(self.c.multiply(-10, 5), -50)  # edge case
        self.assertEqual(self.c.multiply(-10, -5), 50)  # edge case

    def test_divide(self):
        self.assertEqual(self.c.divide(10, 5), 2)
        self.assertEqual(self.c.divide(-10, 5), -2)  # edge case
        self.assertEqual(self.c.divide(-10, -5), 2)  # edge case
        self.assertEqual(self.c.divide(5, 2), 2.5)  # edge case
        self.assertRaises(ValueError, self.c.divide, 10, 0)

    def test_memory(self):
        self.c.memory = 10
        self.assertEqual(self.c.memory, 10)

        self.c.memory_clear()
        self.assertEqual(self.c.memory, 0)

if __name__ == '__main__':
    unittest.main()