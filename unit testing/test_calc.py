from calc import add
import unittest

class TestCalculator(unittest.TestCase):
    def test_add_one_and_one(self):
        r = add (1,1)
        self.assertEqual(r,2, "one plus is two")

if __name__ == '__main__':
    unittest.main()