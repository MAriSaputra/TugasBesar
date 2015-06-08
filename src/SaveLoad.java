import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.swing.JOptionPane;


public class SaveLoad {
	public static void simpanidentitas(IdentitasRuangKelas identitas){
		try{
			ObjectOutputStream a = new ObjectOutputStream(new FileOutputStream("identitas.dat"));
			a.writeObject(identitas);
			a.close();
		}
			catch (Exception e) {
				JOptionPane.showMessageDialog(null, e);
				// TODO: handle exception
			}
		}
	public static IdentitasRuangKelas bacaidentitas(){
		IdentitasRuangKelas ari = null;
		try{
			ObjectInputStream load = new ObjectInputStream(new FileInputStream("identitas.dat"));
			ari = (IdentitasRuangKelas)load.readObject();
			load.close();
		}
		catch(Exception e){
			JOptionPane.showMessageDialog(null, e);
		}
		return ari;
	}
	
	public static void simpankondisi(KondisiRuangKelas kondisi){
		try{
			ObjectOutputStream a = new ObjectOutputStream(new FileOutputStream("kondisi.dat"));
			a.writeObject(kondisi);
			a.close();
		}
		catch (Exception e){
			JOptionPane.showMessageDialog(null, e);
			// TODO: handle exception
		}
	}
	public static KondisiRuangKelas bacakondisi(){
		KondisiRuangKelas ari = null;
		try{
			ObjectInputStream load = new ObjectInputStream(new FileInputStream("kondisi.dat"));
			ari = (KondisiRuangKelas)load.readObject();
			load.close();
		}
		catch(Exception e){
			JOptionPane.showMessageDialog(null, e);
		}
		return ari;
	}
	
	public static void simpansarana(JumlahKondisidanPosisiSarana sarana){
		try{
			ObjectOutputStream a = new ObjectOutputStream(new FileOutputStream("sarana.dat"));
			a.writeObject(sarana);
			a.close();
		}
		catch (Exception e){
			JOptionPane.showMessageDialog(null, e);
			// TODO: handle exception
		}	
		}
	public static JumlahKondisidanPosisiSarana bacasarana(){
		JumlahKondisidanPosisiSarana ari = null;
		try{
			ObjectInputStream load = new ObjectInputStream(new FileInputStream("sarana.dat"));
			ari = (JumlahKondisidanPosisiSarana)load.readObject();
			load.close();
		}
		catch(Exception e){
			JOptionPane.showMessageDialog(null, e);
		}
		return ari;
	}
	public static void simpanlingkungan(LingkunganRuangKelas lingkungan){
		try{
			ObjectOutputStream a = new ObjectOutputStream(new FileOutputStream("lingkungan.dat"));
			a.writeObject(lingkungan);
			a.close();
		}
		catch (Exception e){
			JOptionPane.showMessageDialog(null, e);
			// TODO: handle exception
		}	
		}
	public static LingkunganRuangKelas bacalingkungan(){
		LingkunganRuangKelas ari = null;
		try{
			ObjectInputStream load = new ObjectInputStream(new FileInputStream("lingkungan.dat"));
			ari = (LingkunganRuangKelas)load.readObject();
			load.close();
		}
		catch(Exception e){
			JOptionPane.showMessageDialog(null, e);
		}
		return ari;
	
	}
	public static void simpankebersihan(KebersihanRuangKelas kebersihan){
		try{
			ObjectOutputStream a = new ObjectOutputStream(new FileOutputStream("kebersihan.dat"));
			a.writeObject(kebersihan);
			a.close();
		}
		catch (Exception e){
			JOptionPane.showMessageDialog(null, e);
			// TODO: handle exception
		}	
		}
	public static KebersihanRuangKelas bacakebersihan(){
		KebersihanRuangKelas ari = null;
		try{
			ObjectInputStream load = new ObjectInputStream(new FileInputStream("kebersihan.dat"));
			ari = (KebersihanRuangKelas)load.readObject();
			load.close();
		}
		catch(Exception e){
			JOptionPane.showMessageDialog(null, e);
		}
		return ari;
	}
	public static void simpankenyamanan(KenyamananRuangKelas kenyamanan){
		try{
			ObjectOutputStream a = new ObjectOutputStream(new FileOutputStream("kenyamanan.dat"));
			a.writeObject(kenyamanan);
			a.close();
		}
		catch (Exception e){
			JOptionPane.showMessageDialog(null, e);
			// TODO: handle exception
		}	
		}
	public static KenyamananRuangKelas bacakenyamanan(){
		KenyamananRuangKelas ari = null;
		try{
			ObjectInputStream load = new ObjectInputStream(new FileInputStream("kenyamanan.dat"));
			ari = (KenyamananRuangKelas)load.readObject();
			load.close();
		}
		catch(Exception e){
			JOptionPane.showMessageDialog(null, e);
		}
		return ari;
	}
	public static void simpankeamanan(KeamananRuangKelas keamanan){
		try{
			ObjectOutputStream a = new ObjectOutputStream(new FileOutputStream("keamanan.dat"));
			a.writeObject(keamanan);
			a.close();
		}
		catch (Exception e){
			JOptionPane.showMessageDialog(null, e);
			// TODO: handle exception
		}	
		}
	public static KeamananRuangKelas bacakeamanan(){
		KeamananRuangKelas ari = null;
		try{
			ObjectInputStream load = new ObjectInputStream(new FileInputStream("keamanan.dat"));
			ari = (KeamananRuangKelas)load.readObject();
			load.close();
		}
		catch(Exception e){
			JOptionPane.showMessageDialog(null, e);
		}
		return ari;
	}
}
	
	

	

