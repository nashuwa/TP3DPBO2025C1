from Ram import Ram
from Komponen import Komponen

class Motherboard(Komponen):
    def __init__(self, chipset="", socket_cpu="", ram_list=[], merk="", nama=""):
        super().__init__(merk, nama)
        self.__chipset = chipset
        self.__socket_cpu = socket_cpu
        self.__ram_list = ram_list
    
    def set_chipset(self, chipset):
        self.__chipset = chipset
    
    def set_socketCpu(self, socket_cpu):
        self.__socket_cpu = socket_cpu
    
    def set_ramList(self, ram_list):
        self.__ram_list = ram_list
    
    def get_chipset(self):
        return self.__chipset
    
    def get_socketCpu(self):
        return self.__socket_cpu
    
    def get_ramList(self):
        return self.__ram_list
    
    def addRam(self, ram):
        self.__ram_list.append(ram)