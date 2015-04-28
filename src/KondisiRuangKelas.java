
public class KondisiRuangKelas {
	private double PanjangRuang;
	private double LebarRuang;
	private int JumlahKursi;
	private int JumlahPintu;
	private int JumlahJendela;
	private double LuasRuang;
	private double RasioLuas;

	void setPanjangRuang(double Panjang){
        this.PanjangRuang = Panjang;
    }
    
    double getPanjangRuang(){
        return this.PanjangRuang;
    }
    
    void setLebarRuang(double Lebar){
        this.LebarRuang = Lebar;
    }
    
    double getLebarRuang(){
        return this.LebarRuang;
    }
    
    void setJumlahKursi(int TotalKursi){
        this.JumlahKursi = TotalKursi;
    }
    
    int getJumlahKursi(){
        return this.JumlahKursi;
    }
    
    void setJumlahPintu(int TotalPintu){
        this.JumlahPintu = TotalPintu;
    }
    
    int getJumlahPintu(){
        return this.JumlahPintu;
    }
    
    void setJumlahJendela(int TotalJendela){
        this.JumlahJendela = TotalJendela;
    }
    
    int getJumlahJendela(){
        return this.JumlahJendela;
    }
    
    double LuasRuang(){
        return PanjangRuang*LebarRuang;
    }
    
    double RasioLuas(){
        return RasioLuas()/JumlahKursi;
    }
}
