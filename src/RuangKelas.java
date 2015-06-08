import java.io.*;

import javax.tools.FileObject;

public class RuangKelas {
	
	Identitas user;
	AnalysisSarana sarana;
	Kondisi room;
	AnalysisKebersihan kebersihan;
	AnalysisKenyamanan kenyamanan ;
	AnalysisKeamanan keamanan ;
	AnalysisLingkungan lingkungan;
	
	public RuangKelas(Identitas user, AnalysisSarana sarana, Kondisi room, AnalysisKebersihan kebersihan,
			AnalysisKenyamanan kenyamanan, AnalysisKeamanan keamanan, AnalysisLingkungan lingkungan){
		this.user = user;
		this.sarana = sarana;
		this.room = room;
		this.kebersihan = kebersihan;
		this.kenyamanan = kenyamanan;
		this.keamanan = keamanan;
		this.lingkungan = lingkungan;
	}
	
	
	void Print() {



		try {
			ObjectOutputStream object = new ObjectOutputStream(new FileOutputStream("RuangKelas.txt"));
			object.writeObject(user);
			object.writeObject(lingkungan);
			object.writeObject(sarana);
			object.writeObject(kenyamanan);
			object.writeObject(room);
			object.writeObject(kebersihan);
			object.writeObject(keamanan);
			object.close();
			
			/*System.setOut(out);
			out.println("Nama Ruang : " + user.NamaRuang);
			out.println("Lokasi/Tempat Ruangan  : " + user.LokasiRuang);
			out.println("Fakultas Anda : " + user.Fakultas);
			out.println("Jurusan Anda : "+ user.Jurusan);
		
			
			
			out.println("Kondisi lantai : " + lingkungan.Lantai);
			lingkungan.AnalysisLantai();
			out.println("Kondisi dinding : " + lingkungan.Dinding);
			lingkungan.AnalysisDinding();
			out.println("Kondisi atap : " + lingkungan.Atap);
			lingkungan.AnalysisAtap();
			out.println("Kondisi pintu : " + lingkungan.Pintu);
			lingkungan.AnalysisPintu();
			out.println("Kondisi jendela: " + lingkungan.Jendela);
			lingkungan.AnalysisJendela();
			
			
			out.println("Analysis Jumlah Stop Kontak : " + sarana.JumlahStopKontak);
			//sarana.AnalysisJumlahStopKontak();
			out.println("Analysis Jumlah Kabel LCD : " + sarana.JumlahKabel_LCD);
			//sarana.AnalysisJumlahKabel_LCD();
			out.println("kelas.Analysis Jumlah Lampu: " + sarana.JumlahLampu);
			//sarana.AnalysisJumlahLampu();
			out.println("Analysis Jumlah Kipas Angin : " + sarana.JumlahKipasAngin);
			//sarana.AnalysisJumlahKipasAngin();
			out.println("Analysis Jumlah CCTV: " + sarana.Jumlah_CCTV);
			//sarana.AnalysisJumlah_CCTV();
			out.println("Analysis Kondisi Stop Kontak: " + sarana.KondisiStopKontak);
			//sarana.AnalysisKondisiStopKontak();
			out.println("Analysis Kondisi Kabel LCD : " + sarana.KondisiKabel_LCD);
			//sarana.AnalysisKondisiKabel_LCD();
			out.println("Analysis Kondisi Lampu: " + sarana.KondisiLampu);
			//sarana.AnalysisJumlahLampu();
			out.println("Analysis Kondisi Kipas Angin: " + sarana.KondisiKipasAngin);
			//sarana.AnalysisKondisiKipasAngin();
			out.println("Analysis Kondisi CCTV : " + sarana.Kondisi_CCTV);
			//sarana.AnalysisKondisi_CCTV();
			
			out.println("Analysis Posisi Stop Kontak : " + sarana.PosisiStopKontak);
			sarana.AnalysisPosisiStopKontak();
			out.println("Analysis Posisi Kabel LCD : " + sarana.PosisiKabel_LCD);
			sarana.AnalysisPosisiKabel_LCD();
			out.println("Analysis Posisi Lampu: " + sarana.PosisiLampu);
			sarana.AnalysisPosisiLampu();
			out.println("Analysis Posisi Kipas Angin : " + sarana.PosisiKipasAngin);
			sarana.AnalysisPosisiKipasAngin();
			out.println("Analysis Posisi CCTV : " + sarana.Posisi_CCTV);
			sarana.AnalysisPosisi_CCTV();

			
			out.println("Kebisingan : " + kenyamanan.Kebisingan);
			kenyamanan.AnalysisKebisingan();
			out.println("Bau : " + kenyamanan.Bau);
			kenyamanan.AnalysisBau();
			out.println("Kebocoran : " + kenyamanan.Kebocoran);
			kenyamanan.AnalysisKebocoran();
			out.println("Kerusakan: " + kenyamanan.Kerusakan);
			kenyamanan.AnalysisKerusakan();
			out.println("Keausan: " + kenyamanan.Keausan);
			kenyamanan.AnalysisKeausan();

			
			out.println("Sirkulasi Udara : " + kebersihan.SirkulasiUdara);
			kebersihan.AnalysisSirkulasiUdara();
			out.println("Nilai Pencahayaan : " + kebersihan.NilaiPencahayaan);
			kebersihan.AnalysisNilaiPencahayaan();
			out.println("Nilai Kelembapan : "  + kebersihan.Kelembapan);
			kebersihan.AnalysisKelembapan();
			out.println("Nilai Suhu : " + kebersihan.Suhu);
			kebersihan.AnalysisSuhu();

			
			out.println("Kekokohan : " + keamanan.Kekokohan);
			keamanan.AnalysisKekokohan();
			out.println("Kunci Pintu : " + keamanan.KunciPintu);
			keamanan.AnalysisKunciPintu();
			out.println("Kunci Jendela : " + keamanan.KunciJendela);
			keamanan.AnalysisKunciJendela();
			out.println("Bahaya : " + keamanan.Bahaya);
			keamanan.AnalysisBahaya();
			
			
			out.println("Panjang : " + room.PanjangRuang);
			out.println("Lebar : " + room.LebarRuang);
			out.println("Jumlah kursi : " + room.JumlahKursi);
			out.println("Jumlah pintu : " + room.JumlahPintu);
			out.println("Jumlah jendela : " + room.JumlahJendela);
			out.println("Luas Ruang : " + room.LuasRuang);
			out.println("Rasio Luas : " + room.RasioLuas);

			out.close();*/
		} catch (IOException | java.lang.NullPointerException ex) {
			ex.printStackTrace();
		}
		
		try{
			File data = new File ("InventarisKelas.txt");
			FileReader read = new FileReader(data);
		
			BufferedReader reader = new BufferedReader(read);
			
			String baca = null;
			
			while ((baca = reader.readLine()) !=null){
				System.out.println(baca);
			}
			reader.close();
			}catch(IOException ex){
				ex.printStackTrace();
			}

	}
}
