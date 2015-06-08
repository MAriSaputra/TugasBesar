import java.io.Serializable;


public class KenyamananRuangKelas implements Serializable {
	private String Kebisingan;
	private String Bau;
	private String Kebocoran;
	private String Kerusakan;
	private String Keausan;
	
	void setKebisingan(String Kebisingan){
        this.Kebisingan = Kebisingan;
    }
    
    String getKebisingan(){
        return this.Kebisingan;
    }
    void setBau(String Bau){
        this.Bau = Bau;
    }
    
    String getBau(){
        return this.Bau;
    }
    void setKebocoran(String Kebocoran){
        this.Kebocoran = Kebocoran;
    }
    
    String getKebocoran(){
        return this.Kebocoran;
    }
    void setKerusakan(String Kerusakan){
        this.Kerusakan = Kerusakan;
    }
    
    String getKerusakan(){
        return this.Kerusakan;
    }
    void setKeausan(String Keausan){
        this.Keausan = Keausan;
    }
    
    String getKeausan(){
        return this.Keausan;
    }	
}
