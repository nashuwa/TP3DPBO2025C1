from Komponen import Komponen

class Harddrive(Komponen):
    __kapasitasGB = 0
    __tipeDrive = ""

    def __init__(self, kapasitasGB, tipeDrive, merk, nama):
        super().__init__(merk, nama)
        self.__kapasitasGB = kapasitasGB
        self.__tipeDrive = tipeDrive

    def get_kapasitasGB(self):
        return self.__kapasitasGB
    
    def get_tipeDrive(self):
        return self.__tipeDrive
    
    def set_kapasitasGB(self, kapasitasGB):
        self.__kapasitasGB = kapasitasGB

    def set_tipeDrive(self, tipeDrive):
        self.__tipeDrive = tipeDrive