import java.io.Serializable;


public class KebersihanRuangKelas implements Serializable {
	private String SirkulasiUdara;
	private int NilaiPencahayaan;
	private int Kelembapan;
	private int Suhu;
		
	void setSirkulasiUdara(String SirkulasiUdara){
        this.SirkulasiUdara = SirkulasiUdara;
    }
    String getSirkualasiUdara(){
        return this.SirkulasiUdara;
    }
    void setNilaiPencahayaan(int NilaiPencahayaan){
    	this.NilaiPencahayaan = NilaiPencahayaan;
    }
    int getNilaiPencahayaan(){
    	return this.NilaiPencahayaan;
    }
    void setKelembapan(int Kelembapan){
    	this.Kelembapan = Kelembapan;
    }
    int getKelembapan(){
    	return this.Kelembapan;
    }
    void setSuhu(int Suhu){
    	this.Suhu = Suhu;
    }
    int getSuhu(){
    	return this.Suhu;
    }
}
