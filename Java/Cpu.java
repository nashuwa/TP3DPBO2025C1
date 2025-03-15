public class Cpu extends Komponen
{
    private int jumlahCore;
    private double kecepatanGHz;

    public Cpu()
    {
        this.jumlahCore = 0;
        this.kecepatanGHz = 0;
    }

    public Cpu(int jumlahCore, double kecepatanGHz, String merk, String nama)
    {   
        super(merk, nama);
        this.jumlahCore = jumlahCore;
        this.kecepatanGHz = kecepatanGHz;
    }

    public void set_jumlahCore(int jumlahCore)
    {
        this.jumlahCore = jumlahCore;
    }

    public void set_kecepatanGHz(double kecepatanGHz)
    {
        this.kecepatanGHz = kecepatanGHz;
    }

    public int get_jumlahCore()
    {
        return this.jumlahCore;
    }

    public double get_kecepatanGHz()
    {
        return this.kecepatanGHz;
    }
}