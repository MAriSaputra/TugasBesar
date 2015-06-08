import java.io.FileOutputStream;

import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;
public class Kondisi {
	
	double PanjangRuang;
	double LebarRuang;
	int JumlahKursi;
	int JumlahPintu;
	int JumlahJendela;
	double LuasRuang;
	double RasioLuas;
	
	Scanner scan = new Scanner(System.in);
	
	public void Insert(){
		
		System.out.println("masukkan panjang ruangan : ");
		PanjangRuang = scan.nextInt();
		System.out.println("masukkan lebar ruangan : ");
		LebarRuang = scan.nextInt();
		System.out.println("masukkan jumlah kursi : ");
		JumlahKursi = scan.nextInt();
		System.out.println("masukkan jumlah pintu : ");
		JumlahPintu = scan.nextInt();
		System.out.println("masukkan jumlah jendela : ");
		JumlahJendela = scan.nextInt();
		
	}
	
	double luas(){
		LuasRuang =PanjangRuang*LebarRuang;
		return LuasRuang;
		
	}
	
	double rasio(){
		RasioLuas = luas()/JumlahKursi;
		return RasioLuas;
	}
	
	
}
