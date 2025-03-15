public class Casing extends Komponen
{
    private String tipeCasing;
    private int jumlahFan;

    public Casing()
    {
        this.tipeCasing = "";
        this.jumlahFan = 0;
    }

    public Casing(String tipeCasing, int jumlahFan, String merk, String nama)
    {   
        super(merk, nama);
        this.tipeCasing = tipeCasing;
        this.jumlahFan = jumlahFan;
    }

    public void set_tipeCasing(String tipeCasing)
    {
        this.tipeCasing = tipeCasing;
    }

    public void set_jumlahFan(int jumlahFan)
    {
        this.jumlahFan = jumlahFan;
    }

    public String get_tipeCasing()
    {
        return this.tipeCasing;
    }

    public int get_jumlahFan()
    {
        return this.jumlahFan;
    }
}
