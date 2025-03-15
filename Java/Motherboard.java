import java.util.ArrayList;
import java.util.List;

public class Motherboard extends Komponen 
{
    private String chipset;
    private String socketCpu;
    private List<Ram> ramList;
    
    public Motherboard(String chipset, String socketCpu, List<Ram> ramList, String merk, String nama) {
        super(merk, nama);
        this.chipset = chipset;
        this.socketCpu = socketCpu;
        this.ramList = ramList != null ? ramList : new ArrayList<>();
    }
    
    public Motherboard() {
        super("", "");
        this.chipset = "";
        this.socketCpu = "";
        this.ramList = new ArrayList<>();
    }
    
    public void setChipset(String chipset) {
        this.chipset = chipset;
    }
    
    public void setSocketCpu(String socketCpu) {
        this.socketCpu = socketCpu;
    }
    
    public void setRamList(List<Ram> ramList) {
        this.ramList = ramList;
    }
    
    public String getChipset() {
        return chipset;
    }
    
    public String getSocketCpu() {
        return socketCpu;
    }
    
    public List<Ram> getRamList() {
        return ramList;
    }
    
    public void addRam(Ram ram) {
        this.ramList.add(ram);
    }
}