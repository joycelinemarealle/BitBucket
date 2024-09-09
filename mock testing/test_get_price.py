from external_market import get_price

from unittest import main
from unittest import TestCase
from unittest.mock import *

def calculate_total_usd(amount):
    price = get_price("gbp/usd")
    return price *amount


class Test_Get_Price(TestCase):
    @patch('external_market.get_price')
    def test_get_1000_to_usd(self, mock_get_price):
        mock_get_price.return_value = 1.29 # returns value . if want object the MagicMock(1.29)
        
        total = calculate_total_usd(1000)
        self.assertEqual(total, (1000*1.29), 'did not get the right price')
        
if __name__ == 'main':
    unittest.main()