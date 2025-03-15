public class Harddrive extends Komponen
{
    private int kapasitasGB;
    private String tipeDrive;

    public Harddrive()
    {
        this.kapasitasGB = 0;
        this.tipeDrive = "";
    }

    public Harddrive(int kapasitasGB, String tipeDrive, String merk, String nama)
    {   
        super(merk, nama);
        this.kapasitasGB = kapasitasGB;
        this.tipeDrive = tipeDrive;
    }

    public void set_kapasitasGB(int kapasitasGB)
    {
        this.kapasitasGB = kapasitasGB;
    }

    public void set_tipeDrive(String tipeDrive)
    {
        this.tipeDrive = tipeDrive;
    }

    public int get_kapasitasGB()
    {
        return this.kapasitasGB;
    }

    public String get_tipeDrive()
    {
        return this.tipeDrive;
    }
}