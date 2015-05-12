
public class TestLingkungan {
public static void main(String[] args) {
	
		dataLantai lantai = new dataLantai();
		lantai.data();
		lantai.AnalysisLantai();
		
		dataDinding dinding = new dataDinding();
		dinding.data();
		dinding.AnalysisDinding();
		
		dataAtap atap = new dataAtap();
		atap.data();
		atap.AnalysisAtap();
		
		dataPintu pintu = new dataPintu();
		pintu.data();
		pintu.AnalysisPintu();
		
		dataJendela jendela = new dataJendela();
		jendela.data();
		jendela.AnalysisJendela();
	}		
}
