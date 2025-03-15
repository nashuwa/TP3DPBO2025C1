from Komponen import Komponen

class Cpu(Komponen):
    __jumlahCore = 0
    __kecepatanGHz = 0.0

    def __init__(self, jumlahCore, kecepatanGHz, merk, nama):
        super().__init__(merk, nama)
        self.__jumlahCore = jumlahCore
        self.__kecepatanGHz = kecepatanGHz

    def get_jumlahCore(self):
        return self.__jumlahCore
    
    def get_kecepatanGHz(self):
        return self.__kecepatanGHz
    
    def set_jumlahCore(self, jumlahCore):
        self.__jumlahCore = jumlahCore

    def set_kecepatanGHz(self, kecepatanGHz):
        self.__kecepatanGHz = kecepatanGHz