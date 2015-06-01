import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;


public class TestRuangKelas {
	public static void main(String[] args) {
		Identitas identitas = new Identitas();
		Kondisi kondisi = new Kondisi();
		AnalysisSarana sarana = new AnalysisSarana();
		AnalysisLingkungan lingkungan = new AnalysisLingkungan();
		AnalysisKebersihan kebersihan = new AnalysisKebersihan();
		AnalysisKenyamanan kenyamanan = new AnalysisKenyamanan();
		AnalysisKeamanan keamanan = new AnalysisKeamanan();
		RuangKelas ruang = new RuangKelas();
		
		Identitas ruangan = new Identitas();
		AnalysisSarana kelas = new AnalysisSarana();
		Kondisi user = new Kondisi();

		identitas.Insert();
		kondisi.Insert();
		kondisi.luas();
		kondisi.rasio();
		sarana.data();
		lingkungan.data();
		kebersihan.data();
		kenyamanan.data();
		keamanan.data();
		

		try {
			PrintStream out = new PrintStream(new FileOutputStream(
					"InventarisKelas.txt"));
			System.setOut(out);
			out.println("Nama Gedung : " + ruangan.NamaGedung);
			out.println("Lokasi Ruangan : " + ruangan.LokasiRuang);
			out.println("Fakultas dan Jurusan : " + ruangan.FakultasdanJurusan);

			out.println("kondisi lantai: " + lingkungan.Lantai);
			out.println(lingkungan.AnalysisLantai());
			out.println("kondisi dinding: " + lingkungan.Dinding);
			out.println(lingkungan.AnalysisDinding());
			out.println("kondisi atap: " + lingkungan.Atap);
			out.println(lingkungan.AnalysisAtap());
			out.println("kondisi pintu: " + lingkungan.Pintu);
			out.println(lingkungan.AnalysisPintu());
			out.println("kondisi jendela: " + lingkungan.Jendela);
			out.println(lingkungan.AnalysisJendela());

			out.println(kelas.AnalysisJumlahStopKontak());
			out.println("Analysis Jumlah : " + kelas.JumlahStopKontak);
			out.println(kelas.AnalysisJumlahKabel_LCD());
			out.println("Analysis Jumlah : " + kelas.JumlahKabel_LCD);
			out.println(kelas.AnalysisJumlahLampu());
			out.println("kelas.Analysis Jumlah : " + kelas.JumlahLampu);
			out.println(kelas.AnalysisJumlahKipasAngin());
			out.println("Analysis Jumlah : " + kelas.JumlahKipasAngin);
			out.println(kelas.AnalysisJumlah_CCTV());
			out.println("Analysis Jumlah : " + kelas.Jumlah_CCTV);

			out.println(kelas.AnalysisKondisiStopKontak());
			out.println("Analysis Kondisi : " + kelas.KondisiStopKontak);
			out.println(kelas.AnalysisKondisiKabel_LCD());
			out.println("Analysis Kondisi : " + kelas.KondisiKabel_LCD);
			out.println(kelas.AnalysisJumlahLampu());
			out.println("Analysis Kondisi : " + kelas.KondisiLampu);
			out.println(kelas.AnalysisKondisiKipasAngin());
			out.println("Analysis Kondisi : " + kelas.KondisiKipasAngin);
			out.println(kelas.AnalysisKondisi_CCTV());
			out.println("Analysis Kondisi : " + kelas.Kondisi_CCTV);

			out.println(kelas.AnalysisPosisiStopKontak());
			out.println("Analysis Posisi : " + kelas.PosisiStopKontak);
			out.println(kelas.AnalysisPosisiKabel_LCD());
			out.println("Analysis Posisi : " + kelas.PosisiKabel_LCD);
			out.println(kelas.AnalysisPosisiLampu());
			out.println("Analysis Posisi : " + kelas.PosisiLampu);
			out.println(kelas.AnalysisPosisiKipasAngin());
			out.println("Analysis Posisi : " + kelas.PosisiKipasAngin);
			out.println(kelas.AnalysisPosisi_CCTV());
			out.println("Analysis Posisi : " + kelas.Posisi_CCTV);

			out.println("Panjang : " + user.PanjangRuang);
			out.println("Lebar : " + user.LebarRuang);
			out.println("Jumlah kursi : " + user.JumlahKursi);
			out.println("Jumlah pintu : " + user.JumlahPintu);
			out.println("Jumlah jendela : " + user.JumlahJendela);
			out.println("Luas Ruang : " + user.LuasRuang);
			out.println("Rasio Luas : " + user.RasioLuas);

			out.println("kebisingan: " + kenyamanan.Kebisingan);
			out.println(kenyamanan.AnalysisKebisingan());
			out.println("bau: " + kenyamanan.Bau);
			out.println(kenyamanan.AnalysisBau());
			out.println("kebocoran: " + kenyamanan.Kebocoran);
			out.println(kenyamanan.AnalysisKebocoran());
			out.println("kerusakan: " + kenyamanan.Kerusakan);
			out.println(kenyamanan.AnalysisKerusakan());
			out.println("keausan: " + kenyamanan.Keausan);
			out.println(kenyamanan.AnalysisKeausan());

			out.println("Sirkulasi Udara : " + kebersihan.SirkulasiUdara);
			out.println(kebersihan.AnalysisSirkulasiUdara());
			out.println("Nilai Pencahayaan : " + kebersihan.NilaiPencahayaan);
			out.println(kebersihan.AnalysisNilaiPencahayaan());
			out.println("Nilai Kelembapan : " + kebersihan.Kelembapan);
			out.println(kebersihan.AnalysisKelembapan());
			out.println("Nilai Suhu : " + kebersihan.Suhu);
			out.println(kebersihan.AnalysisSuhu());

			out.println("Kekokohan : " + keamanan.Kekokohan);
			out.println(keamanan.AnalysisKekokohan());
			out.println("Kunci Pintu : " + keamanan.KunciPintu);
			out.println(keamanan.AnalysisKunciPintu());
			out.println("Kunci Jendela : " + keamanan.KunciJendela);
			out.println(keamanan.AnalysisKunciJendela());
			out.println("Bahaya : " + keamanan.Bahaya);
			out.println(keamanan.AnalysisBahaya());

			out.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
}
