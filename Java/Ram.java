public class Ram extends Komponen
{
    private int kapasitasGB;
    private String ddr;

    public Ram()
    {
        this.kapasitasGB = 0;
        this.ddr = "";
    }

    public Ram(int kapasitasGB, String ddr, String merk, String nama)
    {   
        super(merk, nama);
        this.kapasitasGB = kapasitasGB;
        this.ddr = ddr;
    }

    public void set_kapasitasGB(int kapasitasGB)
    {
        this.kapasitasGB = kapasitasGB;
    }

    public void set_ddr(String ddr)
    {
        this.ddr = ddr;
    }

    public int get_kapasitasGB()
    {
        return this.kapasitasGB;
    }

    public String get_ddr()
    {
        return this.ddr;
    }
}