import java.io.FileOutputStream;

import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;
abstract public class Sarana implements Kelas{
	
	int JumlahStopKontak,Jumlah_AC,JumlahKabel_LCD,JumlahKipasAngin,Jumlah_CCTV,JumlahLampu;
	String KondisiStopKontak,Kondisi_AC,KondisiKabel_LCD,KondisiKipasAngin,Kondisi_CCTV,KondisiLampu;
	String PosisiStopKontak,Posisi_AC,PosisiKabel_LCD,PosisiKipasAngin,Posisi_CCTV,PosisiLampu;
	
	Scanner scan = new Scanner(System.in);
	
	@Override
	public void Insert() {
		System.out.println("masukkan jumlah stop kontak : ");
		JumlahStopKontak= scan.nextInt();
		System.out.println("masukkan jumlah AC : ");
		Jumlah_AC= scan.nextInt();
		System.out.println("masukkan jumlah kabel LCD : ");
		JumlahKabel_LCD= scan.nextInt();
		System.out.println("masukkan jumlah kipas angin : ");
		JumlahKipasAngin= scan.nextInt();
		System.out.println("masukkan jumlah lampu : ");
		JumlahLampu= scan.nextInt();
		System.out.println("masukkan jumlah CCTV : ");
		Jumlah_CCTV= scan.nextInt();
		
		System.out.println("masukkan kondisi stop kontak : ");
		KondisiStopKontak = scan.next();
		System.out.println("masukkan kondisi AC : ");
		Kondisi_AC= scan.next();
		System.out.println("masukkan kondisi kabel LCD : ");
		KondisiKabel_LCD= scan.next();
		System.out.println("masukkan kondisi kipas angin : ");
		KondisiKipasAngin= scan.next();
		System.out.println("masukkan kondisi lampu : ");
		KondisiLampu= scan.next();
		System.out.println("masukkan kondisi CCTV : ");
		Kondisi_CCTV= scan.next();
		
		System.out.println("masukkan posisi stop kontak : ");
		PosisiStopKontak = scan.next();
		System.out.println("masukkan posisi AC : ");
		Posisi_AC= scan.next();
		System.out.println("masukkan posisi kabel LCD : ");
		PosisiKabel_LCD= scan.next();
		System.out.println("masukkan posisi kipas angin : ");
		PosisiKipasAngin= scan.next();
		System.out.println("masukkan posisi lampu : ");
		PosisiLampu= scan.next();
		System.out.println("masukkan posisi CCTV : ");
		Posisi_CCTV= scan.next();
		
	}
	
	
	

	abstract boolean AnalysisJumlahStopKontak();
	abstract String AnalysisKondisiStopKontak();
	abstract String AnalysisPosisiStopKontak();
	abstract boolean AnalysisJumlahKabel_LCD();
	abstract String AnalysisKondisiKabel_LCD();
	abstract String AnalysisPosisiKabel_LCD();
	abstract boolean AnalysisJumlahLampu();
	abstract String AnalysisKondisiLampu();
	abstract String AnalysisPosisiLampu();
	abstract boolean AnalysisJumlahKipasAngin();
	abstract String AnalysisKondisiKipasAngin();
	abstract String AnalysisPosisiKipasAngin();
	abstract boolean AnalysisJumlah_AC();
	abstract String AnalysisKondisi_AC();
	abstract String AnalysisPosisi_AC();
	abstract boolean AnalysisJumlah_CCTV();
	abstract String AnalysisKondisi_CCTV();
	abstract String AnalysisPosisi_CCTV();

	

	}

