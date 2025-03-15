from Komponen import Komponen

class Gpu(Komponen):
    __kapasitasVRAMGB = 0
    __kecepatanCoreMhz = 0.0
    __tipeGpu = ""

    def __init__(self, kapasitasVRAMGB, kecepatanCoreMhz, tipeGpu, merk, nama):
        super().__init__(merk, nama)
        self.__tipeGpu = tipeGpu
        self.__kapasitasVRAMGB = kapasitasVRAMGB
        self.__kecepatanCoreMhz = kecepatanCoreMhz

    def get_kapasitasVRAMGB(self):
        return self.__kapasitasVRAMGB
    
    def get_kecepatanCoreMhz(self):
        return self.__kecepatanCoreMhz
    
    def set_kapasitasVRAMGB(self, kapasitasVRAMGB):
        self.__kapasitasVRAMGB = kapasitasVRAMGB

    def set_kecepatanCoreMhz(self, kecepatanCoreMhz):
        self.__kecepatanCoreMhz = kecepatanCoreMhz