from car import Car

class UberVan(Car):
    typeCarAccepted = []
    seatsMaterial = []

    def __int__(self, license, driver, typeCarAccepted, seatsMaterial):
        super.__init__(license,driver)
        self.typeCarAccepted = typeCarAccepted
        self.seatsMaterial = seatsMaterial