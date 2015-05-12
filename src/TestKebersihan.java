
public class TestKebersihan {
	public static void main(String[] args) {
		
	dataSirkulasiUdara sirkulasi = new dataSirkulasiUdara();
	sirkulasi.data();
	sirkulasi.AnalysisSirkulasiUdara();
	
	dataNilaiPencahayaan pencahayaan = new dataNilaiPencahayaan();
	pencahayaan.data();
	pencahayaan.AnalysisNilaiPencahayaan();
	
	dataKelembapan lembap = new dataKelembapan();
	lembap.data();
	lembap.AnalysisKelembapan();
	
	dataSuhu suhu = new dataSuhu();
	suhu.data();
	suhu.AnalysisSuhu();
	
}
}
