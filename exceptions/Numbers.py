from InvalidNumberError import *
max_limit = 100
min_lower_limit = 0
min_upper_limit = 50

class Numbers:
    def __init__(self, max, min):
        
        if type(max) is str or type(min) is str:
            raise InvalidNumberError("Inputs must not be strings")
        self.max = max
        self.min = min

    def divide(self):
        try:
            if self.max < max_limit and self.min > min_lower_limit and self.min < min_upper_limit:
                value = self.max / self.min
                return f'The value of dividing {self.max} by {self.min} is {value}' 
            else:
                return f'Invalid values: max should be < {max_limit} and min should be between {min_lower_limit} and {min_upper_limit}'
        
        except Exception as e:
            raise InvalidNumberError("Invalid range of numbers was added") from e


    def __str__(self):
        return f'The max value is {self.max}, the min value is {self.min}'

"""except ValueError as e:
            print('Exception:', e)"""

""" except Exception as e:
            raise InvalidNumberError('message') from e
"""

"""  except InvalidNumberError as e:
            print('Invalid number was added', e)"""