class Komponen:
    __nama = ""
    __merk = ""

    def __init__(self, nama, merk):
        self.__nama = nama
        self.__merk = merk

    def get_nama(self):
        return self.__nama
    
    def get_merk(self):
        return self.__merk
    
    def set_nama(self, nama):
        self.__nama = nama

    def set_merk(self, merk):
        self.__merk = merk