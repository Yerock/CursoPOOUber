from car import Car

class UberX(Car):
    brand = str
    moddel = str

    def __int__(self, license, driver, brand, model):
        super.__init__(license,driver)
        self.brand = brand 
        self.model = model
        