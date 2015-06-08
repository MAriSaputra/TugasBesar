import java.io.FileOutputStream;

import java.io.IOException;
import java.io.PrintStream;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Identitas {
	int NamaRuang;
	String LokasiRuang;
	String Fakultas;
	String Jurusan;
	

	Scanner scan = new Scanner(System.in);

	void Insert() {

		System.out.println("masukkan Nama Gedung yang Anda tempati : ");
		NamaRuang = scan.nextInt();
		System.out.println("masukkan dimana Lokasi Ruangan yang Anda tempati : ");
		LokasiRuang = scan.next();
		System.out.println("masukkan nama Fakultas Anda : ");
		Fakultas = scan.next();
		System.out.println("masukkan nama Jurusan Anda : ");
		Jurusan = scan.next();
		
	}

}
