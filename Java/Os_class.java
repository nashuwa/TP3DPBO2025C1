public class Os_class
{
    private String namaOS;
    private String versi;

    public Os_class()
    {
        this.namaOS = "";
        this.versi = "";
    }

    public Os_class(String namaOS, String versi)
    {
        this.namaOS = namaOS;
        this.versi = versi;
    }

    public void set_namaOS(String namaOS)
    {
        this.namaOS = namaOS;
    }

    public void set_versi(String versi)
    {
        this.versi = versi;
    }

    public String get_namaOS()
    {
        return this.namaOS;
    }

    public String get_versi()
    {
        return this.versi;
    }

}
