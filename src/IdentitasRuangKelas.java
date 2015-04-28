
public class IdentitasRuangKelas {	
	private String NamaRuang;
	private String LokasiRuang;
	private String ProgramStudi_Fakultas;
	
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
	void setProgramStudi_Fakultas (String Jurusan){
		this.ProgramStudi_Fakultas = Jurusan;
	}
	String getProgramStudi_Fakultas(){
		return this.ProgramStudi_Fakultas;
	}

}
