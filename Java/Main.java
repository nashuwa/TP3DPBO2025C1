import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Create components
        Cpu cpu = new Cpu(8, 3.4, "Intel", "Core i7");
        Ram ram1 = new Ram(16, "DDR5", "Corsair", "Vengeance");
        Ram ram2 = new Ram(32, "DDR4", "Corsair", "Vengeance RGB Pro");
        Harddrive harddrive = new Harddrive(1024, "SSD", "Samsung", "Evo");
        Gpu gpu = new Gpu(24, 2520.0, "Ada Lovelace", "NVIDIA", "GeForce RTX 4090");
        
        List<Ram> ramList = new ArrayList<>();
        ramList.add(ram1);
        ramList.add(ram2);
        ramList.add(new Ram(32, "DDR4", "Team", "T-Force Delta RGB"));
        
        Motherboard motherboard = new Motherboard("Intel Z790", "LGA 1700", ramList, "ASUS", "ROG Strix Z790-E Gaming WiFi");
        motherboard.addRam(new Ram(16, "DDR5", "Kingston", "Fury Beast"));
        Os_class os = new Os_class("macOS", "Ventura 13");
        Casing casing = new Casing("Midtower", 3, "Lian Li", "PC-O11 Dynamic");

        // Create komputer
        Komputer komputer = new Komputer("PC Jooyeon", cpu, harddrive, motherboard, gpu, os, casing);

        // Tampilkan computer information
        System.out.println("Informasi Komputer:");
        System.out.println("Nama      : " + komputer.getNama());
        
        // CPU information
        System.out.println("CPU       : " + komputer.getCpu().get_merk() + " " 
                + komputer.getCpu().get_nama() + " (" 
                + komputer.getCpu().get_jumlahCore() + " Core, " 
                + komputer.getCpu().get_kecepatanGHz() + " GHz)");
        
        // GPU information
        System.out.println("GPU       : " + komputer.getGpu().get_merk() + " " 
                + komputer.getGpu().get_nama() + " (" 
                + komputer.getGpu().get_kapasitasVRAMGB() + " GB VRAM, " 
                + komputer.getGpu().get_kecepatanCoreMhz() + " MHz)");
        
        // Motherboard information
        System.out.println("Motherboard: " + komputer.getMotherboard().get_merk() + " " 
                + komputer.getMotherboard().get_nama() + " (" 
                + komputer.getMotherboard().getChipset() + ", " 
                + komputer.getMotherboard().getSocketCpu() + ")");
        
        // RAM information
        List<Ram> rams = komputer.getMotherboard().getRamList();
        for (int i = 0; i < rams.size(); i++) {
            System.out.println("RAM " + (i+1) + "     : " + rams.get(i).get_merk() + " " 
                    + rams.get(i).get_nama() + " (" 
                    + rams.get(i).get_kapasitasGB() + " GB " 
                    + rams.get(i).get_ddr() + ")");
        }
        
        // Harddrive information
        System.out.println("Harddrive : " + komputer.getHarddrive().get_merk() + " " 
                + komputer.getHarddrive().get_nama() + " (" 
                + komputer.getHarddrive().get_kapasitasGB() + " GB " 
                + komputer.getHarddrive().get_tipeDrive() + ")");
        
        // OS information
        System.out.println("OS        : " + komputer.getOS().get_namaOS() + " " 
                + komputer.getOS().get_versi());
        
        // Casing information
        System.out.println("Casing    : " + komputer.getCasing().get_merk() + " " 
                + komputer.getCasing().get_nama() + " (" 
                + komputer.getCasing().get_tipeCasing() + ", " 
                + komputer.getCasing().get_jumlahFan() + " Fans)");
    }
}