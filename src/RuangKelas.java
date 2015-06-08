import java.io.*;

import javax.tools.FileObject;

public class RuangKelas {
	
	IdentitasRuangKelas user = new IdentitasRuangKelas();
	KondisiRuangKelas room = new KondisiRuangKelas();
	JumlahKondisidanPosisiSarana sarana = new JumlahKondisidanPosisiSarana ();
	LingkunganRuangKelas lingkungan = new LingkunganRuangKelas();
	KebersihanRuangKelas kebersihan = new KebersihanRuangKelas();
	KenyamananRuangKelas kenyamanan = new KenyamananRuangKelas();
	KeamananRuangKelas keamanan = new KeamananRuangKelas();

	void Print() {

		try {
			ObjectOutputStream object = new ObjectOutputStream(new FileOutputStream("RuangKelas.txt"));
			object.writeObject(user);
			object.writeObject(lingkungan);
			object.writeObject(sarana);
			object.writeObject(kenyamanan);
			object.writeObject(room);
			object.writeObject(kebersihan);
			object.writeObject(keamanan);
			object.close();
		} catch (IOException | java.lang.NullPointerException ex) {
			ex.printStackTrace();
		}
		
		try{
			ObjectInputStream object = new ObjectInputStream(new FileInputStream("RuangKelas.txt"));
			user = (IdentitasRuangKelas)object.readObject();
			room = (KondisiRuangKelas)object.readObject();
			sarana = (JumlahKondisidanPosisiSarana)object.readObject();
			lingkungan = (LingkunganRuangKelas)object.readObject();
			kebersihan = (KebersihanRuangKelas)object.readObject();
			kenyamanan = (KenyamananRuangKelas)object.readObject();
			keamanan = (KeamananRuangKelas)object.readObject();
			
			}catch(Exception ex){
				ex.printStackTrace();
			}

	}
}