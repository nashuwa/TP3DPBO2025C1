from Komponen import Komponen

class Ram(Komponen):
    __kapasitasGB = 0
    __ddr = ""

    def __init__(self, kapasitasGB, ddr, merk, nama):
        super().__init__(merk, nama)
        self.__kapasitasGB = kapasitasGB
        self.__ddr = ddr

    def get_kapasitasGB(self):
        return self.__kapasitasGB
    
    def get_ddr(self):
        return self.__ddr
    
    def set_kapasitasGB(self, kapasitasGB):
        self.__kapasitasGB = kapasitasGB

    def set_ddr(self, ddr):
        self.__ddr = ddr