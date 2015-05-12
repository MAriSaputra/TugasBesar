
public class TestSarana {
public static void main(String[] args) {
		
		dataStopKontak stopkontak = new dataStopKontak();
		stopkontak.data();
		stopkontak.AnalysisJumlah();
		stopkontak.AnalysisKondisi();
		stopkontak.AnalysisPosisi();
		
		dataKabel_LCD kabelLCD = new dataKabel_LCD();
		kabelLCD.data();
		kabelLCD.AnalysisJumlah();
		kabelLCD.AnalysisKondisi();
		kabelLCD.AnalysisPosisi();
		
		dataKipasAngin kipasangin = new dataKipasAngin();
		kipasangin.data();
		kipasangin.AnalysisJumlah();
		kipasangin.AnalysisKondisi();
		kipasangin.AnalysisPosisi();
		
		dataLampu lampu = new dataLampu();
		lampu.data();
		lampu.AnalysisJumlah();
		lampu.AnalysisKondisi();
		lampu.AnalysisPosisi();
		
		data_AC ac = new data_AC();
		ac.data();
		ac.AnalysisJumlah();
		ac.AnalysisKondisi();
		ac.AnalysisPosisi();
		
		data_CCTV cctv = new data_CCTV();
		cctv.data();
		cctv.AnalysisJumlah();
		cctv.AnalysisKondisi();
		cctv.AnalysisPosisi();
		
	}
}
