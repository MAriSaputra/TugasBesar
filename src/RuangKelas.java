import java.io.*;

public class RuangKelas {
	void Print() {

		Identitas user = new Identitas();
		AnalysisSarana sarana = new AnalysisSarana();
		Kondisi room = new Kondisi();
		AnalysisKebersihan kebersihan = new AnalysisKebersihan();
		AnalysisKenyamanan kenyamanan = new AnalysisKenyamanan();
		AnalysisKeamanan keamanan = new AnalysisKeamanan();
		AnalysisLingkungan lingkungan = new AnalysisLingkungan();

		try {
			PrintStream out = new PrintStream(new FileOutputStream(
					"InventarisKelas.txt"));
			System.setOut(out);
			out.println("Nama Gedung : " + user.NamaGedung);
			out.println("Lokasi Ruangan : " + user.LokasiRuang);
			out.println("Fakultas dan Jurusan : " + user.FakultasdanJurusan);

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
			
			out.println(sarana.AnalysisJumlahStopKontak());
			out.println("Analysis Jumlah : " + sarana.JumlahStopKontak);
			out.println(sarana.AnalysisJumlahKabel_LCD());
			out.println("Analysis Jumlah : " + sarana.JumlahKabel_LCD);
			out.println(sarana.AnalysisJumlahLampu());
			out.println("kelas.Analysis Jumlah : " + sarana.JumlahLampu);
			out.println(sarana.AnalysisJumlahKipasAngin());
			out.println("Analysis Jumlah : " + sarana.JumlahKipasAngin);
			out.println(sarana.AnalysisJumlah_CCTV());
			out.println("Analysis Jumlah : " + sarana.Jumlah_CCTV);
			out.println(sarana.AnalysisKondisiStopKontak());
			out.println("Analysis Kondisi : " + sarana.KondisiStopKontak);
			out.println(sarana.AnalysisKondisiKabel_LCD());
			out.println("Analysis Kondisi : " + sarana.KondisiKabel_LCD);
			out.println(sarana.AnalysisJumlahLampu());
			out.println("Analysis Kondisi : " + sarana.KondisiLampu);
			out.println(sarana.AnalysisKondisiKipasAngin());
			out.println("Analysis Kondisi : " + sarana.KondisiKipasAngin);
			out.println(sarana.AnalysisKondisi_CCTV());
			out.println("Analysis Kondisi : " + sarana.Kondisi_CCTV);
			out.println(sarana.AnalysisPosisiStopKontak());
			out.println("Analysis Posisi : " + sarana.PosisiStopKontak);
			out.println(sarana.AnalysisPosisiKabel_LCD());
			out.println("Analysis Posisi : " + sarana.PosisiKabel_LCD);
			out.println(sarana.AnalysisPosisiLampu());
			out.println("Analysis Posisi : " + sarana.PosisiLampu);
			out.println(sarana.AnalysisPosisiKipasAngin());
			out.println("Analysis Posisi : " + sarana.PosisiKipasAngin);
			out.println(sarana.AnalysisPosisi_CCTV());
			out.println("Analysis Posisi : " + sarana.Posisi_CCTV);

			out.println("Panjang : " + room.PanjangRuang);
			out.println("Lebar : " + room.LebarRuang);
			out.println("Jumlah kursi : " + room.JumlahKursi);
			out.println("Jumlah pintu : " + room.JumlahPintu);
			out.println("Jumlah jendela : " + room.JumlahJendela);
			out.println("Luas Ruang : " + room.LuasRuang);
			out.println("Rasio Luas : " + room.RasioLuas);

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
