import java.util.Scanner;
public class AdminKelas {
	
	IdentitasRuangKelas dataIdentitas = new IdentitasRuangKelas();
	KondisiRuangKelas dataKondisi = new KondisiRuangKelas();
	JumlahKondisidanPosisiSarana dataSarana = new JumlahKondisidanPosisiSarana();
	LingkunganRuangKelas dataLingkungan = new LingkunganRuangKelas();
	KebersihanRuangKelas dataKebersihan = new KebersihanRuangKelas();
	KenyamananRuangKelas dataKenyamanan = new KenyamananRuangKelas();
	KeamananRuangKelas dataKeamanan = new KeamananRuangKelas();
	
	void InsertIdentitasRuangKelas(){
		Scanner scan = new Scanner(System.in);
        
        System.out.println("Masukan Nama Ruangan yang akan Anda gunakan : ");
        dataIdentitas.setNamaRuang(scan.nextLine());
        
        System.out.println("Masukan Lokasi Ruangan yang akan Anda gunakan : ");
        dataIdentitas.setLokasiRuang(scan.nextLine());
        
        System.out.println("Masukan Pengguna Program Studi/Fakultas : ");
        dataIdentitas.setProgramStudi_Fakultas(scan.nextLine());
        
	}

	void PrintIdentitasRuangKelas(){
	System.out.println("== Identitas Ruangan Kelas ==");
    System.out.println("Ruang Kelas : " + dataIdentitas.getNamaRuang());
    System.out.println("Gedung : " + dataIdentitas.getLokasiRuang());
    System.out.println("Jurusan : " + dataIdentitas.getProgramStudi_Fakultas());
    
	}

	void InsertKondisiRuangKelas(){
		Scanner scan = new Scanner (System.in);
			System.out.println("Masukkan panjang ruangan : ");
	        dataKondisi.setPanjangRuang(scan.nextInt());
	        
	        System.out.println("Masukkan lebar ruangan :  ");
	        dataKondisi.setLebarRuang(scan.nextInt());
	        
	        System.out.println("Masukkan jumlah kursi dalam suatu ruangan : ");
	        dataKondisi.setJumlahKursi(scan.nextInt());
	        
	        System.out.println("Masukkan jumlah pintu dalam suatu ruangan : ");
	        dataKondisi.setJumlahPintu(scan.nextInt()); 
	        
	        System.out.println("Masukkan jumlah jendela dalam ruangan : ");
	        dataKondisi.setJumlahJendela(scan.nextInt());
	        
	}
	
		void PrintKondisiRuangKelas(){
		 System.out.println("== Kondisi Ruang Kelas ==");
		 System.out.println("Jumlah kursi didalam kelas : " + dataKondisi.getJumlahKursi());
	     System.out.println("Jumlah Pintu pada kelas : " + dataKondisi.getJumlahPintu());
	     System.out.println("Jumlah Jendela pada kelas : " + dataKondisi.getJumlahJendela());
	     System.out.println("Luas Ruang : " + dataKondisi.LuasRuang());
	     System.out.println("Rasio Ruang : "+ dataKondisi.RasioLuas());
	     
	}
	
	void InsertJumlahKondisidanPosisiSarana(){
		Scanner scan = new Scanner(System.in);
		
			System.out.println("Masukkan jumlah stop kontak : ");
	        dataSarana.setJumlahStopKontak(scan.nextInt());
	        
	        System.out.println("Masukkan kondisi stop kontak : ");
	        dataSarana.setKondisiStopKontak(scan.next());
	        
	        System.out.println("Masukkan posisi stop kontak :  ");
	        dataSarana.setPosisiStopKontak(scan.next());
	        
	        System.out.println("Masukkan jumlah kabel LCD : ");
	        dataSarana.setJumlahKabel_LCD(scan.nextInt());
	        
	        System.out.println("Masukkan kondisi kabel LCD : ");
	        dataSarana.setKondisiKabel_LCD(scan.next());
	        
	        System.out.println("Masukkan posisi kabel LCD : ");
	        dataSarana.setPosisiKabel_LCD(scan.next());
	        
	        System.out.println("Masukkan jumlah lampu : ");
	        dataSarana.setJumlahLampu(scan.nextInt());
	        
	        System.out.println("Masukkan kondisi lampu : ");
	        dataSarana.setKondisiLampu(scan.next());
	        
	        System.out.println("Masukkan posisi lampu : ");
	        dataSarana.setPosisiLampu(scan.next());
	        
	        System.out.println("Masukkan SSID : ");
	        dataSarana.setSSID(scan.next());
	        
	        System.out.println("Masukkan Login : ");
	        dataSarana.setLogin(scan.next());
	        
	       	System.out.println("Masukkan Bandwidth : ");
	        dataSarana.setBandwidth(scan.nextInt());
	        
	        System.out.println("Masukkan jumlah kipas angin : ");
	        dataSarana.setJumlahKipasAngin(scan.nextInt());
	        
	        System.out.println("Masukkan kondisi kipas angin  : ");
	        dataSarana.setKondisiKipasAngin(scan.next());
	        
	        System.out.println("Masukkan posisi kipas angin : ");
	        dataSarana.setPosisiKipasAngin(scan.next());
	        
	        System.out.println("Masukkan jumlah AC : ");
	        dataSarana.setJumlah_AC(scan.nextInt());
	        
	        System.out.println("Masukkan kondisi AC : ");
	        dataSarana.setKondisi_AC(scan.next());
	        
	        System.out.println("Masukan posisi AC : ");
	        dataSarana.setPosisi_AC(scan.next());
	        
	        System.out.println("Masukkan jumlah CCTV : ");
	        dataSarana.setJumlah_CCTV(scan.nextInt());
	        
	        System.out.println("Masukkan kondisi CCTV : ");
	        dataSarana.setKondisi_CCTV(scan.next());
	        
	        System.out.println("Masukkan posisi CCTV : ");
	        dataSarana.setPosisi_CCTV(scan.next()); 
	        
	}

	
	      void PrintJumlahKondisidanPosisiSarana(){
	    	  	System.out.println("== Jumlah,Kondisi dan Posisi Sarana ==");
	    	  	System.out.println("Jumlah Stop Kontak : " + dataSarana.getJumlahStopKontak());
	    	  	System.out.println("Kondisi Stop Kontak : " + dataSarana.getKondisiStopKontak());
	    	  	System.out.println("Posisi Stop Kontak  : " + dataSarana.getPosisiStopKontak());
	    	  	System.out.println("Jumlah Kabel LCD : " + dataSarana.getJumlahKabel_LCD());
	    	  	System.out.println("Kondisi Kabel LCD : " + dataSarana.getKondisiKabel_LCD());
	    	  	System.out.println("Posisi Kabel LCD : " + dataSarana.getPosisiKabel_LCD());
	    	  	System.out.println("Jumlah Lampu : " + dataSarana.getJumlahLampu());
	    	  	System.out.println("Kondisi Lampu : " + dataSarana.getKondisiLampu());
	    	  	System.out.println("Posisi Lampu : " + dataSarana.getPosisiLampu());
	    	  	System.out.println("Jumlah Kipas Angin : " + dataSarana.getJumlahKipasAngin());
	    	  	System.out.println("Kondisi Kipas Angin : " + dataSarana.getKondisiKipasAngin());
	    	  	System.out.println("Posisi Kipas Angin 1 : " + dataSarana.getPosisiKipasAngin());
	    	  	System.out.println("Posisi Kipas Angin 2 : " + dataSarana.getPosisiKipasAngin());
	    	  	System.out.println("Jumlah AC : " + dataSarana.getJumlah_AC());
	    	  	System.out.println("Kondisi AC : " + dataSarana.getKondisi_AC());
	    	  	System.out.println("Posisi AC : " + dataSarana.getPosisi_AC());
	    	  	System.out.println("SSID : " + dataSarana.getSSID());
	    	  	System.out.println("Login : " + dataSarana.getLogin());
	    		System.out.println("Bandwidth : " + dataSarana.getBandwidth());
	    		System.out.println("Jumlah CCTV : " + dataSarana.getJumlah_CCTV());
	    	  	System.out.println("Kondisi CCTV : " + dataSarana.getKondisi_CCTV());
	    	  	System.out.println("Posisi CCTV 1 : " + dataSarana.getPosisi_CCTV());
	    	  	System.out.println("Posisi CCTV 2 : " + dataSarana.getPosisi_CCTV());
	    	  	
	}
	      
	 void InsertLingkunganKelas(){
		 Scanner scan = new Scanner(System.in);
			
	       System.out.println("Kondisi Lantai : ");
	       dataLingkungan.setKondisiLantai(scan.nextLine());
	       
	       System.out.println("Kondisi Dinding : ");
	       dataLingkungan.setKondisiDinding(scan.nextLine());
	       
	       System.out.println("Kondisi Atap : ");
	       dataLingkungan.setKondisiAtap(scan.nextLine());
	       
	       System.out.println("Kondisi Pintu : ");
	       dataLingkungan.setKondisiPintu(scan.nextLine());
	       
	       System.out.println("Kondisi Jendela : ");
	       dataLingkungan.setKondisiJendela(scan.nextLine());
	       
	   }
	 
	 void PrintLingkunganKelas(){
		 System.out.println("== Lingkungan Kelas ==");
		 System.out.println("Kondisi Lantai : " + dataLingkungan.getKondisiLantai());
		 System.out.println("Kondisi Dinding : " + dataLingkungan.getKondisiDinding());
		 System.out.println("Kondisi Atap : " + dataLingkungan.getKondisiAtap());
		 System.out.println("Kondisi Pintu : " + dataLingkungan.getKondisiPintu());
		 System.out.println("Kondisi Jendela : " + dataLingkungan.getKondisiJendela());
		 
	 }
	 
	 void InsertKebersihanRuangKelas(){
		 Scanner scan = new Scanner (System.in);
		 	System.out.println("Masukkan kondisi sirkulasi udara dalam ruangan : (baik/tidak baik) ");
		 	dataKebersihan.setSirkulasiUdara(scan.nextLine());
	       
		 	System.out.println("Masukkan nilai pencahayaan dalam ruangan : ");
		 	dataKebersihan.setNilaiPencahayaan(scan.nextInt());
	       
		 	System.out.println("Masukkan nilai kelembapan dalam ruangan : ");
		 	dataKebersihan.setKelembapan(scan.nextInt());
	       
		 	System.out.println("Masukkan suhu dalam ruangan : ");
		 	dataKebersihan.setSuhu(scan.nextInt());
	   }
	   
	
	 void PrintKebersihanRuangKelas(){
		 System.out.println("== Kebersihan Ruang Kelas ==");
		 System.out.println("Sirkulasi Udara : " + dataKebersihan.getSirkualasiUdara());
		 System.out.println("Nilai Pencahayaan : " + dataKebersihan.getNilaiPencahayaan());
		 System.out.println("Kelembapan : " + dataKebersihan.getKelembapan());
		 System.out.println("Suhu : " + dataKebersihan.getSuhu());
	 }
	 
	 void InsertKenyamananRuangKelas(){
		 Scanner scan = new Scanner(System.in);
		 System.out.println("Kondisi kebisingan di dalam kelas : ");
	     dataKenyamanan.setKebisingan(scan.nextLine());
	       
	     System.out.println("Kondisi aroma di dalam/di luar kelas : ");
	     dataKenyamanan.setBau(scan.nextLine());
	       
	     System.out.println("Kondisi kaca jendela di dalam/di luar kelas  : ");
	     dataKenyamanan.setKebocoran(scan.nextLine());
	       
	     System.out.println("Kondisi Kerusakan di dalam kelas : ");
	     dataKenyamanan.setKerusakan(scan.nextLine());
	     
	     System.out.println("Kondisi keausan di dalam kelas : ");
	     dataKenyamanan.setKeausan(scan.nextLine());
	 }
	
	 void PrintKenyamanRuangKelas(){
		 System.out.println("== Kenyamanan Ruang Kelas ==");
		 System.out.println("Kebisingan : " + dataKenyamanan.getKebisingan());
		 System.out.println("Aroma : " + dataKenyamanan.getBau());
		 System.out.println("Kebocoran : " + dataKenyamanan.getKebocoran());
		 System.out.println("Kerusakan : " + dataKenyamanan.getKerusakan());
		 System.out.println("Keausan : " + dataKenyamanan.getKeausan());
		 
	 }
	 
	   void InsertKeamananRuangKelas(){
		   	Scanner scan = new Scanner (System.in);
		   	System.out.println("Kekokohan dalam kelas : ");
	        dataKeamanan.setKekokohan(scan.nextLine());
	        
	        System.out.println("Kelengkapan Kunci Pintu :  ");
	        dataKeamanan.setKunciPintu(scan.nextLine());
	        
	        System.out.println("Kelengkapan Kunci Jendela :  ");
	        dataKeamanan.setKunciJendela(scan.nextLine());
	        
	        System.out.println("Bahaya dalam kelas : ");
	        dataKeamanan.setBahaya(scan.nextLine());
	        
	   }
	   
	  void PrintKeamananRuangKelas(){
		  System.out.println("== Keamanan Ruang Kelas ==");
		  System.out.println("Kekokohan : " + dataKeamanan.getKekokohan());
		  System.out.println("Kunci Pintu : " + dataKeamanan.getKunciPintu());
		  System.out.println("Kunci Jendela : " + dataKeamanan.getKunciJendela());
		  System.out.println("Bahaya : " + dataKeamanan.getBahaya());
		  
	  }  
	  
	}
	   



