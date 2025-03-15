public class Gpu extends Komponen
{
    private int kapasitasVRAMGB;
    private double kecepatanCoreMhz;
    private String tipeGpu;

    public Gpu()
    {
        this.kapasitasVRAMGB = 0;
        this.kecepatanCoreMhz = 0;
        this.tipeGpu = "";
    }

    public Gpu(int kapasitasVRAMGB, double kecepatanCoreMhz, String tipeGpu, String merk, String nama)
    {   
        super(merk, nama);
        this.kapasitasVRAMGB = kapasitasVRAMGB;
        this.kecepatanCoreMhz = kecepatanCoreMhz;
        this.tipeGpu = tipeGpu;
    }

    public void set_kapasitasVRAMGB(int kapasitasVRAMGB)
    {
        this.kapasitasVRAMGB = kapasitasVRAMGB;
    }

    public void set_kecepatanCoreMhz(double kecepatanCoreMhz)
    {
        this.kecepatanCoreMhz = kecepatanCoreMhz;
    }

    public void set_tipeGpu(String tipeGpu)
    {
        this.tipeGpu = tipeGpu;
    }

    public int get_kapasitasVRAMGB()
    {
        return this.kapasitasVRAMGB;
    }

    public double get_kecepatanCoreMhz()
    {
        return this.kecepatanCoreMhz;
    }

    public String get_tipeGpu()
    {
        return this.tipeGpu;
    }
}