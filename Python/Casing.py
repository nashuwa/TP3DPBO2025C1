from Komponen import Komponen

class Casing(Komponen):
    __tipeCasing = ""
    __jumlahFan = 0

    def __init__(self, tipeCasing, jumlahFan, merk, nama):
        super().__init__(merk, nama)
        self.__tipeCasing = tipeCasing
        self.__jumlahFan = jumlahFan

    def get_tipeCasing(self):
        return self.__tipeCasing
    
    def get_jumlahFan(self):
        return self.__jumlahFan
    
    def set_tipeCasing(self, tipeCasing):
        self.__tipeCasing = tipeCasing

    def set_jumlahFan(self, jumlahFan):
        self.__jumlahFan = jumlahFan