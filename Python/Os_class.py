class OS:
    __namaOS = ""
    __versi = ""

    def __init__(self, namaOS, versi):
        self.__namaOS = namaOS
        self.__versi = versi

    def get_namaOS(self):
        return self.__namaOS
    
    def get_versi(self):
        return self.__versi
    
    def set_namaOS(self, namaOS):
        self.__namaOS = namaOS

    def set_versi(self, versi):
        self.__versi = versi