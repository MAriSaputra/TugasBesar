import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.InputMismatchException;
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
	}

	
	

