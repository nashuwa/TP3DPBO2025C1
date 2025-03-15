public class Komponen
{
    private String nama;
    private String merk;

    public Komponen()
    {
        this.nama = "";
        this.merk = "";
    }

    public Komponen(String nama, String merk)
    {
        this.nama = nama;
        this.merk = merk;
    }

    public void set_nama(String nama)
    {
        this.nama = nama;
    }

    public void set_merk(String merk)
    {
        this.merk = merk;
    }

    public String get_nama()
    {
        return this.nama;
    }

    public String get_merk()
    {
        return this.merk;
    }
}