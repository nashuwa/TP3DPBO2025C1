from Cpu import Cpu
from Harddrive import Harddrive
from Motherboard import Motherboard
from Gpu import Gpu
from Os_class import OS
from Casing import Casing

class Komputer:
    def __init__(self, nama="", cpu=None, harddrive=None, motherboard=None, gpu=None, os=None, casing=None):
        self.__nama = nama
        self.__cpu = cpu if cpu is not None else Cpu()
        self.__harddrive = harddrive if harddrive is not None else Harddrive()
        self.__motherboard = motherboard if motherboard is not None else Motherboard()
        self.__gpu = gpu if gpu is not None else Gpu()
        self.__os = os if os is not None else OS()
        self.__casing = casing if casing is not None else Casing()
    
    def set_nama(self, nama):
        self.__nama = nama
    
    def set_cpu(self, cpu):
        self.__cpu = cpu
    
    def set_harddrive(self, harddrive):
        self.__harddrive = harddrive
    
    def set_motherboard(self, motherboard):
        self.__motherboard = motherboard
    
    def set_gpu(self, gpu):
        self.__gpu = gpu
    
    def set_OS(self, os):
        self.__os = os
    
    def set_casing(self, casing):
        self.__casing = casing
    
    def get_nama(self):
        return self.__nama
    
    def get_cpu(self):
        return self.__cpu
    
    def get_harddrive(self):
        return self.__harddrive
    
    def get_motherboard(self):
        return self.__motherboard
    
    def get_gpu(self):
        return self.__gpu
    
    def get_OS(self):
        return self.__os
    
    def get_casing(self):
        return self.__casing