from Cpu import Cpu
from Ram import Ram
from Harddrive import Harddrive
from Gpu import Gpu
from Motherboard import Motherboard
from Os_class import OS
from Casing import Casing
from Komputer import Komputer

if __name__ == "__main__":
    cpu = Cpu(8, 3.4, "Intel", "Core i7")
    ram1 = Ram(16, "DDR5", "Corsair", "Vengeance")
    ram2 = Ram(32, "DDR4", "Corsair", "Vengeance RGB Pro")
    harddrive = Harddrive(1024, "SSD", "Samsung", "Evo")
    gpu = Gpu(24, 2520.0, "Ada Lovelace", "NVIDIA", "GeForce RTX 4090")
    motherboard = Motherboard("Intel Z790", "LGA 1700", [ram1, ram2, Ram(32, "DDR4", "Team", "T-Force Delta RGB")], "ASUS", "ROG Strix Z790-E Gaming WiFi")
    motherboard.addRam(Ram(16, "DDR5", "Kingston", "Fury Beast"))
    os = OS("macOS", "Ventura 13")
    casing = Casing("Midtower", 3, "Lian Li", "PC-O11 Dynamic")

    komputer = Komputer("PC Jooyeon", cpu, harddrive, motherboard, gpu, os, casing)

    print("Informasi Komputer:")
    print(f"Nama      : {komputer.get_nama()}")
    
    # CPU information
    print(f"CPU       : {komputer.get_cpu().get_merk()} {komputer.get_cpu().get_nama()} "f"({komputer.get_cpu().get_jumlahCore()} Core, {komputer.get_cpu().get_kecepatanGHz()} GHz)")
    
    # GPU information
    print(f"GPU       : {komputer.get_gpu().get_merk()} {komputer.get_gpu().get_nama()} "f"({komputer.get_gpu().get_kapasitasVRAMGB()} GB VRAM, {komputer.get_gpu().get_kecepatanCoreMhz()} MHz)")
    
    # Motherboard information
    print(f"Motherboard: {komputer.get_motherboard().get_merk()} {komputer.get_motherboard().get_nama()} "f"({komputer.get_motherboard().get_chipset()}, {komputer.get_motherboard().get_socketCpu()})")
    
    # RAM information
    ram_list = komputer.get_motherboard().get_ramList()
    for i, ram in enumerate(ram_list):
        print(f"RAM {i+1}     : {ram.get_merk()} {ram.get_nama()} "f"({ram.get_kapasitasGB()} GB {ram.get_ddr()})")
    
    # Harddrive information
    print(f"Harddrive : {komputer.get_harddrive().get_merk()} {komputer.get_harddrive().get_nama()} "f"({komputer.get_harddrive().get_kapasitasGB()} GB {komputer.get_harddrive().get_tipeDrive()})")
    
    # OS information
    print(f"OS        : {komputer.get_OS().get_namaOS()} {komputer.get_OS().get_versi()}")
    
    # Casing information
    print(f"Casing    : {komputer.get_casing().get_merk()} {komputer.get_casing().get_nama()} "f"({komputer.get_casing().get_tipeCasing()}, {komputer.get_casing().get_jumlahFan()} Fans)")