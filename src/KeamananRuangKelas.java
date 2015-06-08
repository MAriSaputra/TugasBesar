import java.io.Serializable;


public class KeamananRuangKelas implements Serializable{
	private String Kekokohan;
	private String KunciPintu;
	private String KunciJendela;
	private String Bahaya;
		
	void setKekokohan(String Kekokohan){
        this.Kekokohan = Kekokohan;
    }
    String getKekokohan(){
        return this.Kekokohan;
    }
    void setKunciPintu(String KunciPintu){
        this.KunciPintu = KunciPintu;
    }
    String getKunciPintu(){
        return this.KunciPintu;
    }
    void setKunciJendela(String KunciJendela){
        this.KunciJendela = KunciJendela;
    }   
    String getKunciJendela(){
        return this.KunciJendela;
    }
    void setBahaya(String Bahaya){
        this.Bahaya = Bahaya;
    }  
    String getBahaya(){
        return this.Bahaya;
    }
}
