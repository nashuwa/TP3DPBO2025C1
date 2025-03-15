public class Komputer {
    private String nama;
    private Cpu cpu;
    private Harddrive harddrive;
    private Motherboard motherboard;
    private Gpu gpu;
    private Os_class os;
    private Casing casing;

    public Komputer() {
        
    }

    public Komputer(String nama, Cpu cpu, Harddrive harddrive, Motherboard motherboard, Gpu gpu, Os_class os, Casing casing) {
        this.nama = nama;
        this.cpu = cpu;
        this.harddrive = harddrive;
        this.motherboard = motherboard;
        this.gpu = gpu;
        this.os = os;
        this.casing = casing;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    public void setHarddrive(Harddrive harddrive) {
        this.harddrive = harddrive;
    }

    public void setMotherboard(Motherboard motherboard) {
        this.motherboard = motherboard;
    }

    public void setGpu(Gpu gpu) {
        this.gpu = gpu;
    }

    public void setOS(Os_class os) {
        this.os = os;
    }

    public void setCasing(Casing casing) {
        this.casing = casing;
    }

    public String getNama() {
        return this.nama;
    }

    public Cpu getCpu() {
        return this.cpu;
    }

    public Harddrive getHarddrive() {
        return this.harddrive;
    }

    public Motherboard getMotherboard() {
        return this.motherboard;
    }

    public Gpu getGpu() {
        return this.gpu;
    }

    public Os_class getOS() {
        return this.os;
    }

    public Casing getCasing() {
        return this.casing;
    }

}