#include <bits/stdc++.h>
#include "Cpu.cpp"
#include "Ram.cpp"
#include "Harddrive.cpp"
#include "Gpu.cpp"
#include "Motherboard.cpp"
#include "OS.cpp"
#include "Casing.cpp"
#include "Komputer.cpp"

using namespace std;

int main() 
{
    ios::sync_with_stdio(0); cin.tie();

    Cpu cpu(8, 3.4, "Intel", "Core i7");
    Ram ram1(16, "DDR5", "Corsair", "Vengeance");
    Ram ram2(32, "DDR4", "Corsair", "Vengeance RGB Pro");
    Harddrive harddrive(1024, "SSD", "Samsung", "Evo");
    Gpu gpu(24, 2520.0, "Ada Lovelace", "NVIDIA", "GeForce RTX 4090");
    Motherboard motherboard("Intel Z790", "LGA 1700", {ram1, ram2, Ram(32, "DDR4", "Team", "T-Force Delta RGB")}, "ASUS", "ROG Strix Z790-E Gaming WiFi");
    motherboard.addRam(Ram(16, "DDR5", "Kingston", "Fury Beast"));
    OS os("macOS", "Ventura 13");
    Casing casing("Midtower", 3, "Lian Li", "PC-O11 Dynamic");

    Komputer komputer("PC Jooyeon", cpu, harddrive, motherboard, gpu, os, casing);

    cout << "Informasi Komputer:" << endl;
    cout << "Nama      : " << komputer.getNama() << endl;
    
    // CPU information
    cout << "CPU       : " << komputer.getCpu().getMerk() << " " 
        << komputer.getCpu().getNama() << " (" 
        << komputer.getCpu().getJumlahCore() << " Core, " 
        << komputer.getCpu().getKecepatanGHz() << " GHz)" << endl;
    
    // GPU information
    cout << "GPU       : " << komputer.getGpu().getMerk() << " " 
        << komputer.getGpu().getNama() << " (" 
        << komputer.getGpu().getkapasitasVRAMGB() << " GB VRAM, " 
        << komputer.getGpu().getkecepatanCoreMhz() << " MHz)" << endl;
    
    // Motherboard information
    cout << "Motherboard: " << komputer.getMotherboard().getMerk() << " " 
        << komputer.getMotherboard().getNama() << " (" 
        << komputer.getMotherboard().getchipset() << ", " 
        << komputer.getMotherboard().getsocketCpu() << ")" << endl;
    
    // RAM information
    vector<Ram> ramList = komputer.getMotherboard().getRamList();
    for (size_t i = 0; i < ramList.size(); i++) {
        cout << "RAM " << (i+1) << "     : " << ramList[i].getMerk() << " " 
            << ramList[i].getNama() << " (" 
            << ramList[i].getKapasitasGB() << " GB " 
            << ramList[i].getDdr() << ")" << endl;
    }
    
    // Harddrive information
    cout << "Harddrive : " << komputer.getHarddrive().getMerk() << " " 
        << komputer.getHarddrive().getNama() << " (" 
        << komputer.getHarddrive().getKapasitasGB() << " GB " 
        << komputer.getHarddrive().getTipeDrive() << ")" << endl;
    
    // OS information
    cout << "OS        : " << komputer.getOS().getnamaOS() << " " 
        << komputer.getOS().getversi() << endl;
    
    // Casing information
    cout << "Casing    : " << komputer.getCasing().getMerk() << " " 
        << komputer.getCasing().getNama() << " (" 
        << komputer.getCasing().gettipeCasing() << ", " 
        << komputer.getCasing().getjumlahFan() << " Fans)" << endl;

    return 0;
}