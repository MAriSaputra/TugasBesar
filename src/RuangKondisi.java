import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class RuangKondisi extends JFrame {
	KondisiRuangKelas kondisi = new KondisiRuangKelas();
	private JPanel contentPane;
	private JTextField Panjang;
	private JTextField Lebar;
	private JTextField Kursi;
	private JTextField Pintu;
	private JTextField Jendela;
	private JTextField Rasio;
	private JTextField Luas;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RuangKondisi frame = new RuangKondisi();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public RuangKondisi() {
		setTitle("Kondisi Ruang Kelas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 369, 341);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Panjang Ruang");
		lblNewLabel.setBounds(10, 11, 86, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Lebar Ruang");
		lblNewLabel_1.setBounds(10, 44, 86, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Jumlah Kursi");
		lblNewLabel_2.setBounds(10, 79, 86, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Jumlah Pintu");
		lblNewLabel_3.setBounds(7, 118, 86, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblJumlahJendela = new JLabel("Jumlah Jendela");
		lblJumlahJendela.setBounds(7, 160, 105, 14);
		contentPane.add(lblJumlahJendela);
		
		Panjang = new JTextField();
		Panjang.setBounds(103, 8, 43, 20);
		contentPane.add(Panjang);
		Panjang.setColumns(10);
		
		Lebar = new JTextField();
		Lebar.setBounds(103, 41, 43, 20);
		contentPane.add(Lebar);
		Lebar.setColumns(10);
		
		Kursi = new JTextField();
		Kursi.setBounds(103, 76, 43, 20);
		contentPane.add(Kursi);
		Kursi.setColumns(10);
		
		Pintu = new JTextField();
		Pintu.setBounds(103, 115, 43, 20);
		contentPane.add(Pintu);
		Pintu.setColumns(10);
		
		Jendela = new JTextField();
		Jendela.setBounds(103, 157, 43, 20);
		contentPane.add(Jendela);
		Jendela.setColumns(10);
		
		JButton btnNext = new JButton("Next");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new RuangSarana().setVisible(true);
				dispose();
			}
		});
		btnNext.setBounds(274, 231, 69, 23);
		contentPane.add(btnNext);
		
		JButton btnPrevious = new JButton("Previous");
		btnPrevious.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new RuangIdentitas().setVisible(true);
				dispose();
			}
		});
		btnPrevious.setBounds(186, 231, 76, 23);
		contentPane.add(btnPrevious);
		
		JLabel lblRasioLuas = new JLabel("Rasio Luas");
		lblRasioLuas.setBounds(7, 200, 89, 14);
		contentPane.add(lblRasioLuas);
		
		JLabel lblLuasRuang = new JLabel("Luas Ruang");
		lblLuasRuang.setBounds(10, 225, 76, 14);
		contentPane.add(lblLuasRuang);
		
		Rasio = new JTextField();
		Rasio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		Rasio.setBounds(98, 197, 48, 20);
		contentPane.add(Rasio);
		Rasio.setColumns(10);
		
		Luas = new JTextField();
		Luas.setColumns(10);
		Luas.setBounds(98, 222, 48, 20);
		contentPane.add(Luas);
		
		JButton btnHitung = new JButton("Hitung");
		btnHitung.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double a = kondisi.LuasRuang(kondisi.getPanjangRuang(), + kondisi.getLebarRuang());
				double b = kondisi.RasioLuas(kondisi.LuasRuang(kondisi.getPanjangRuang(), kondisi.getLebarRuang()), kondisi.getJumlahKursi());
				
				Rasio.setText(" "+a);
				Luas.setText(" "+b);
				
			}
		});
		btnHitung.setBounds(10, 250, 89, 23);
		contentPane.add(btnHitung);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				kondisi.setPanjangRuang(Double.parseDouble(Panjang.getText()));
				kondisi.setLebarRuang(Double.parseDouble(Lebar.getText()));
				kondisi.setJumlahKursi(Integer.parseInt(Kursi.getText()));
				kondisi.setJumlahJendela(Integer.parseInt(Jendela.getText()));
				kondisi.setJumlahPintu(Integer.parseInt(Pintu.getText()));
				SaveLoad.simpankondisi(kondisi);
			}
		});
		btnSave.setBounds(239, 34, 69, 35);
		contentPane.add(btnSave);
		
		JButton btnLoad = new JButton("Load");
		btnLoad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				KondisiRuangKelas kondisi= SaveLoad.bacakondisi();
				Panjang.setText(" "+kondisi.getPanjangRuang());
				Lebar.setText(" "+kondisi.getLebarRuang());
				Kursi.setText(" "+kondisi.getJumlahKursi());
				Pintu.setText(" "+kondisi.getJumlahPintu());
				Jendela.setText(" "+kondisi.getJumlahJendela());
				
			}
		});
		btnLoad.setBounds(239, 80, 69, 35);
		contentPane.add(btnLoad);
	}
}
