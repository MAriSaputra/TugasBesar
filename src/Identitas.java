import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
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
		try{
			PrintStream out = new PrintStream(new FileOutputStream("output.txt"));
			System.setOut(out);
			out.println("Nama Gedung : "+ NamaGedung);
			out.println("Lokasi Ruangan : "+ LokasiRuang);
			out.println("Fakultas dan Jurusan : "+ FakultasdanJurusan);
		}catch(IOException ex){
			ex.printStackTrace();
		}
		

	}
}
