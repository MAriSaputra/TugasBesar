import java.util.Scanner;

public class Identitas {
	String NamaGedung;
	int LokasiRuang;
	String FakultasdanJurusan;

	Scanner scan = new Scanner(System.in);
	
	void Insert () {
		System.out.println("masukkan Nama Gedung yang Anda tempati : ");
		NamaGedung = scan.next();
		System.out.println("masukkan dimana Lokasi Ruangan yang Anda Tempati : ");
		LokasiRuang = scan.nextInt();
		System.out.println("masukkan nama Fakultas dan Jurusan Anda : ");
		FakultasdanJurusan = scan.next();
	}
	void Print(){
		System.out.println("Nama Gedung : "+ NamaGedung);
		System.out.println("Lokasi Ruangan : "+ LokasiRuang);
		System.out.println("Fakultas dan Jurusan : "+ FakultasdanJurusan);

	}
}
