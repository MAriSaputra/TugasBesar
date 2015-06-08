import java.io.Serializable;


public class IdentitasRuangKelas implements Serializable {	
	private String NamaRuang;
	private String LokasiRuang;
	private String Jurusan;
	private String Fakultas;
	
	void setNamaRuang (String Ruang){
		this.NamaRuang = Ruang;
	}
	String getNamaRuang(){
		return this.NamaRuang; 
	}
	void setLokasiRuang (String Gedung){
		this.LokasiRuang = Gedung;
	}
	String getLokasiRuang(){
		return this.LokasiRuang;
	}
	void setJurusan (String Jurusan){
		this.Jurusan = Jurusan;
	}
	String getJurusan(){
		return this.Jurusan;
	}
	void setFakultas (String Fakultas){
		this.Fakultas = Fakultas;
	}
	String getFakultas(){
		return this.Fakultas;
	}
}
