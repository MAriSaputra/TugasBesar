
public class TestKelas {
	public static void main(String[] args) {
		AdminKelas user = new AdminKelas();
		
		user.InsertIdentitasRuangKelas();
		user.InsertJumlahKondisidanPosisiSarana();
		user.InsertKeamananRuangKelas();
		user.InsertKebersihanRuangKelas();
		user.InsertKenyamananRuangKelas();
		user.InsertKondisiRuangKelas();
		user.InsertLingkunganKelas();
		
		user.PrintIdentitasRuangKelas();
		user.PrintJumlahKondisidanPosisiSarana();
		user.PrintKeamananRuangKelas();
		user.PrintKebersihanRuangKelas();
		user.PrintKenyamanRuangKelas();
		user.PrintKondisiRuangKelas();
		user.PrintLingkunganKelas();
		
	}
}