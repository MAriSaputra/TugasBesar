
public class AnalisisKelas {
	IdentitasRuangKelas identitas = new IdentitasRuangKelas();
	KondisiRuangKelas kondisi = new KondisiRuangKelas();
	JumlahKondisidanPosisiSarana sarana = new JumlahKondisidanPosisiSarana();
	LingkunganRuangKelas lingkungan = new LingkunganRuangKelas();
	KebersihanRuangKelas kebersihan = new KebersihanRuangKelas();
	KenyamananRuangKelas kenyamanan = new KenyamananRuangKelas();
	KeamananRuangKelas keamanan = new KeamananRuangKelas();
	
	boolean AnalysisIdentitasRuangKelas(){
		
		String Fakultas_Jurusan = "Teknik Informatika";
		if(Fakultas_Jurusan.equals(identitas.getProgramStudi_Fakultas())){
			return true;
		}
		
		else{
		
		return false;
		}
			
	}
	
	boolean AnalysisKondisiRuangKelas(){
		if (kondisi.getPanjangRuang() < kondisi.getLebarRuang()){
          System.out.println("Angka yang Anda masukkan Salah");
          return true;
      } 
      
		if (kondisi.getPanjangRuang() == kondisi.getLebarRuang()){
			System.out.println("Tidak ada ruangan yang berbentuk persegi panjang");
			return true;
      }
      
		if (kondisi.RasioLuas() >= 0.5){
			System.out.println(" Ruangan kelas telah memenuhi Standard ");
			return true;
      }
      
		if (kondisi.RasioLuas() <= 0.5){
			System.out.println(" Ruang kelas tidak memenuhi Standard ");
			return true;
      }
      
		if (kondisi.getJumlahPintu() >= 2){
			System.out.println(" Jumlah pintu telah memenuhi Standard ");
			return true;
      }
          
		if(kondisi.getJumlahPintu() <= 2){
          System.out.println(" Jumlah pintu tidak memenuhi Standard ");
          return true;
      }
      
		if (kondisi.getJumlahJendela() >= 1){
          System.out.println(" Jumlah Jendela sesuai ");
          return true;
      }
      
		if (kondisi.getJumlahJendela() == 0){
          System.out.println(" Jumlah Jendela tidak memenuhi Standard ");
          return true;
		}
		
		else{
			System.out.println(" Maaf, Angka yang Anda masukkan Salah ");
			return false;
		}
	}	
	boolean AnalysisJumlahKondisidanPosisiSarana(){
		String KondisiStopKontak = "Berfungsi dengan baik";
        String PosisiStopKontak1 = "Di pojokkan ruangan";
        String PosisiStopKontak2 = "Dekat dosen";
        String KondisiKabel_LCD = "Berfungsi dengan baik";
        String PosisiKabel_LCD = "Dekat dosen";
        String KondisiLampu= "Berfungsi dengan baik";
        String PosisiLampu = "Di atap ruangan";
        String KondisiKipasAngin = "Berfungsi dengan baik";
        String PosisiKipasAngin = "Di atap ruangan";
      	String Kondisi_AC = "Berfungsi dengan baik";
        String Posisi_AC= "Di belakang";
      	String SSID = "UMM Hotspot";
      	String Login = "Bisa Login";
      	String Kondisi_CCTV = "Berfungsi dengan baik";
        String Posisi_CCTV1 = "Di depan";
        String Posisi_CCTV2 = "Di belakang";

        if(sarana.getJumlahStopKontak() >= 4){
            System.out.println("Sudah Sesuai Standard");
            return true;
        }
                
       if(KondisiStopKontak.equals(sarana.getKondisiStopKontak())){
              System.out.println(" Sudah Sesuai Standard ");
              return true;
            }
                       
       	if(PosisiStopKontak1.equals(sarana.getPosisiStopKontak())){
       	 System.out.println(" Sudah Sesuai Standard ");
       	 return true;
       	}
       	
           if(PosisiStopKontak2.equals(sarana.getPosisiStopKontak())){
               System.out.println(" Sudah Sesuai Standard ");
               return true;
           }
      
       if(sarana.getJumlahKabel_LCD() >= 1 ){
            System.out.println("Sudah Sesuai Standard ");
            return true;
        }
               
       if(KondisiKabel_LCD.equals(sarana.getKondisiKabel_LCD())){
             System.out.println("Sudah Sesuai Standard ");
             return true;
        }
        
       if(PosisiKabel_LCD.equals(sarana.getPosisiKabel_LCD())){
             System.out.println("Sudah Sesuai Standard ");
             return true;
        }
       
       if(sarana.getJumlahLampu() >= 18){
    	   System.out.println("Sesuai Standard ");
    	   return true;
       }
       if(KondisiLampu.equals(sarana.getKondisiLampu())){
                System.out.println("Sesuai Standard ");
                return true;
       }
        
        if(PosisiLampu.equals(sarana.getPosisiLampu())){
            System.out.println("Sudah Sesuai Standard ");
            return true;
        }
                      
        if(sarana.getJumlahKipasAngin()>=2){
        	System.out.println("Sudah Sesuai Standard ");
        	return true;
        }
            if(KondisiKipasAngin.equals(sarana.getKondisiKipasAngin())){
                System.out.println("Sudah Sesuai Standard ");
                return true;
            }
            if(KondisiKipasAngin.equals(sarana.getKondisiKipasAngin())){
                System.out.println("Sudah Sesuai Standard ");
                return true;
            }
            if(PosisiKipasAngin.equals(sarana.getPosisiKipasAngin())){
            	System.out.println("Sudah Sesuai Standard ");
            	return true;
            }
            if(PosisiKipasAngin.equals(sarana.getPosisiKipasAngin())){
            	System.out.println("Sudah Sesuai Standard ");
            	return true;
            }
              
        if(sarana.getJumlah_AC()>=1){
            System.out.println("Sudah Sesuai Standard ");
            return true;
        }
        
       if(Kondisi_AC.equals(sarana.getKondisi_AC())){
             System.out.println("Sudah Sesuai Standard ");
             return true;
       }
       
       if(Posisi_AC.equals(sarana.getPosisi_AC())){
            System.out.println("Sudah Sesuai Standard ");
            return true;
        }
       
       if(SSID.equals(sarana.getSSID())){
           System.out.println("Sudah Sesuai Standard ");
           return true;
       }
       
       if(Login.equals(sarana.getLogin())){
    	   System.out.println("Sudah Sesuai Standard");
    	   return true;
       }
       
       if(sarana.getJumlah_CCTV()== 2){
           System.out.println("Sudah Sesuai Standard ");
           return true;
       }
       
       if(Kondisi_CCTV.equals(sarana.getKondisi_CCTV())){
             System.out.println("Sudah Sesuai Standard ");
             return true;
           }
       
      if(Posisi_CCTV1.equals(sarana.getPosisi_CCTV())){
    	  System.out.println("Sudah Sesuai Standard");
    	  return true;
      }
     
      if(Posisi_CCTV2.equals(sarana.getPosisi_CCTV())){
          System.out.println("Sudah Sesuai Standard ");
          return true;
          }
      
      else{
          System.out.println("Belum Sesuai Standard ");
          return false;
  }
}
	
	boolean AnalysisLingkunganRuangKelas(){
	       String KondisiRuangKelas = "Bersih";
	       
	       if(KondisiRuangKelas.equals(lingkungan.getKondisiLantai())){
	    	   System.out.println("Sudah Sesuai Standard ");
	    	   return true;
	       }
	       
	       if(KondisiRuangKelas.equals(lingkungan.getKondisiDinding())){
	    	   System.out.println("Sudah Sesuai Standard ");
	    	 	return true;
	       }
	    
	       if(KondisiRuangKelas.equals(lingkungan.getKondisiAtap())){
	    	   System.out.println("Sudah Sesuai Standard ");
	    	   return true;
	       }
	    	 
	       if(KondisiRuangKelas.equals(lingkungan.getKondisiPintu())){
	    	   System.out.println("Sudah Sesuai Standard"); 
	    	   return true;
	       }
	    	  
	       if(KondisiRuangKelas.equals(lingkungan.getKondisiJendela())){
	      	  System.out.println("Sudah Sesuai Standard");
	      	  return true;
	       }
	       else{
		      System.out.println("Belum Sesuai Standard");
		      return false;
		       } 
	}
	 boolean AnalysisKebersihanRuangKelas(){
		 String SirkulasiUdara = "Lancar";
		 
		 if (SirkulasiUdara.equals(kebersihan.getSirkualasiUdara())){
			 System.out.println("Sirkulasi udara di dalam ruangan sudah sesuai Standard");
			 return true;
		 }
		
	       if( kebersihan.getNilaiPencahayaan()<=350 == kebersihan.getNilaiPencahayaan()>=250){
	           System.out.println("Nilai pencahayaan ruangan sudah sesuai Standard ");
	           return true;
	       }
	       	              
	        if( kebersihan.getKelembapan()<=80 == kebersihan.getKelembapan()>=70){
	           System.out.println("Kelembapan ruangan sudah sesuai Standard ");
	           return true;
	       }
	       	       	        
	        if( kebersihan.getSuhu()<=35 == kebersihan.getSuhu()>=25){
	           System.out.println("Kebersihan ruangan sudah sesuai Standard ");
	           return true;
	       }
	       
	        else {
	           System.out.println("Belum sesuai Standard");
	           return false;
	       }
	   }
	 boolean AnalysisKenyamananRuangKelas(){
		 String Kebisingan = "Tidak Bising";
		 String Bau = "Tidak Bau";
		 String Kebocoran = "Tidak Bocor";
		 String Kerusakan = "Tidak Rusak";
		 String Keausan = "Tidak Aus";
		 
		 if(Kebisingan.equals(kenyamanan.getKebisingan())){
			 System.out.println("Sudah Sesuai");
			 return true;
	       }
	      
		 if(Bau.equals(kenyamanan.getBau())){
			 System.out.println("Sudah Sesuai ");
			 return true;
		 }
		 
		 if(Kebocoran.equals(kenyamanan.getKebocoran())){
			 System.out.println("Sudah Sesuai");
			 return true;
		 
		 }
		 if(Kerusakan.equals(kenyamanan.getKerusakan())){
			 System.out.println("Sudah Sesuai");
			 return true;
		 }
		
		 if(Keausan.equals(kenyamanan.getKeausan())){
			 System.out.println("Sudah Sesuai");
			 return true;
		 }
		 else{
			 System.out.println("Belum Sesuai");
			 return false;
		 }
	 }
	 boolean AnalysisKeamananRuangKelas(){
		   String Kekokohan = "Kokoh";
		   String KunciPintu = "Ada";
		   String KunciJendela = "Ada";
		   String Bahaya = "Aman";
	   
	   if(Kekokohan.equals(keamanan.getKekokohan())){
         System.out.println("Sudah Sesuai");
         return true;
	   }
	     
	   if(KunciPintu.equals(keamanan.getKunciPintu())){
         System.out.println("Sudah Sesuai");
         return true;
	   }
	      
	   if(KunciJendela.equals(keamanan.getKunciJendela())){
         System.out.println("Sudah Sesuai");
         return true;
	   
	   }
	   
	   if(Bahaya.equals(keamanan.getBahaya())){
		   System.out.println("Sudah Sesuai");
		   return true;
		   
	   }
	   
	   else{
		   System.out.println("Belum Sesuai");
		   return false;
	   }
	   }     
}
