class InvalidNumberError(Exception):
    """Raised when number is not within the valid range"""

    def __init__(self, message = "Invalid Number provided"):
        self.message = message
        super().__init__(self.message)


    def __str__(self):
        return f'{self.message}'
    