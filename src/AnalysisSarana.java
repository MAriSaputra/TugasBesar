
public class AnalysisSarana extends Sarana{
	public void data(){
		Insert(); 
		Print();
		
	}

	

	@Override
	boolean AnalysisJumlahStopKontak() {
		if(JumlahStopKontak >= 4){
			System.out.println("Sesuai");
			return true;
		}
		
		else{
			System.out.println("Tidak Sesuai");
			return false;
		}
		
	}

	@Override
	String AnalysisKondisiStopKontak() {
		if(KondisiStopKontak.equals("baik")){
			return "Sesuai";			
		}
		
		else{
			return "Tidak Sesuai";
		}
		
	}
	@Override
	String AnalysisPosisiStopKontak() {
		if(PosisiStopKontak.equals("di_pojokkan")||PosisiStopKontak.equals("di_dekat_dosen")){
			return "Sesuai";
		}
		else{
			return "Tidak Sesuai";
	}
	}

	@Override
	boolean AnalysisJumlahKabel_LCD() {
		if(JumlahKabel_LCD == 1){
			System.out.println("Sesuai");
			return true;
		}
		
		else{
			System.out.println("Tidak Sesuai");
			return false;
		}
		
	}

	@Override
	String AnalysisKondisiKabel_LCD() {
		if(KondisiKabel_LCD.equals("baik")){
			return "Sesuai";			
		}
		
		else{
			return "Tidak Sesuai";
		}
		
	}

	@Override
	String AnalysisPosisiKabel_LCD() {
		if(PosisiKabel_LCD.equals("di_dekat_dosen")){
			return "Sesuai";
		}
		else{
			return "Tidak Sesuai";
	}
	}

	@Override
	boolean AnalysisJumlahLampu() {
		if(JumlahLampu >= 4){
			System.out.println("Sesuai");
			return true;
		}
		
		else{
			System.out.println("Tidak Sesuai");
			return false;
		}
	}

	@Override
	String AnalysisKondisiLampu() {
		if(KondisiLampu.equals("baik")){
			return "Sesuai";			
		}
		
		else{
			return "Tidak Sesuai";
		}
		
	}

	@Override
	String AnalysisPosisiLampu() {
		if(PosisiKabel_LCD.equals("di_langit-langit")){
			return "Sesuai";
		}
		else{
			return "Tidak Sesuai";
	}
	}

	@Override
	boolean AnalysisJumlahKipasAngin() {
		if(JumlahKipasAngin == 2){
			System.out.println("Sesuai");
			return true;
		}
		
		else{
			System.out.println("Tidak Sesuai");
			return false;
		}
	}

	@Override
	String AnalysisKondisiKipasAngin() {
		if(KondisiKipasAngin.equals("baik")){
			return "Sesuai";			
		}
		
		else{
			return "Tidak Sesuai";
		}
	}

	@Override
	String AnalysisPosisiKipasAngin() {
		if(PosisiKipasAngin.equals("di_dinding")||PosisiKipasAngin.equals("di_langit-langit")){
			return "Sesuai";
		}
		else{
			return "Tidak Sesuai";
	}
	}
	@Override
	boolean AnalysisJumlah_AC() {
		if(Jumlah_AC == 2){
			System.out.println("Sesuai");
			return true;
		}
		
		else{
			System.out.println("Tidak Sesuai");
			return false;
		}
	}

	@Override
	String AnalysisKondisi_AC() {
		if(Kondisi_AC.equals("baik")){
			return "Sesuai";			
		}
		
		else{
			return "Tidak Sesuai";
		}
	}

	@Override
	String AnalysisPosisi_AC() {
		if(PosisiKabel_LCD.equals("di_dinding")){
			return "Sesuai";
		}
		else{
			return "Tidak Sesuai";
	}
	}

	@Override
	boolean AnalysisJumlah_CCTV() {
		if(Jumlah_CCTV == 2){
			System.out.println("Sesuai");
			return true;
		}
		
		else{
			System.out.println("Tidak Sesuai");
			return false;
		}
	}

	@Override
	String AnalysisKondisi_CCTV() {
		if(Kondisi_CCTV.equals("baik")){
			return "Sesuai";			
		}
		
		else{
			return "Tidak Sesuai";
		}
	}

	@Override
	String AnalysisPosisi_CCTV() {
		if(Posisi_CCTV.equals("di_depan")||Posisi_CCTV.equals("di_belakang")){
			return "Sesuai";
		}
		else{
			return "Tidak Sesuai";
	}
	}



}